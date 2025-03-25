/*
 * Nama file : Petani.java
 * Deskripsi : Atribut dan Method Petani
 * Nama/NIM : Tsabita Syahida Khafid/24060123130071
 * Tanggal Pembuatan : Selasa, 25 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(){
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal kota: " + asal_kota);
    }

    @Override
    public int hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        Period masa = Period.between(getTgl(), now);
        return masa.getYears() + 0;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }
}
