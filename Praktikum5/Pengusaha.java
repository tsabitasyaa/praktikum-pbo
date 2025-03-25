/*
 * Nama file : Pengusaha.java
 * Deskripsi : Atribut dan Method Pengusaha
 * Nama/NIM : Tsabita Syahida Khafid/24060123130071
 * Tanggal Pembuatan : Selasa, 25 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(){
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }

    @Override
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period masa = Period.between(getTgl(), now);
        return masa.getYears() + 7;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }
}
