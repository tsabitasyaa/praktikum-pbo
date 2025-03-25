/*
 * Nama file : PNS.java
 * Deskripsi : Atribut dan Method PNS
 * Nama/NIM : Tsabita Syahida Khafid/24060123130071
 * Tanggal Pembuatan : Selasa, 25 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    public PNS(){
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }

    @Override
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period masa = Period.between(getTgl(), now);
        return masa.getYears() + 1;
    }

    @Override
    public double hitungPajak(){
        return 0.1 * getPendapatan();
    }
}
