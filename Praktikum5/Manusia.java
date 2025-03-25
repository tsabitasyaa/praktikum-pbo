/*
 * Nama file : Manusia.java
 * Deskripsi : Atribut dan Method Manusia
 * Nama/NIM : Tsabita Syahida Khafid/24060123130071
 * Tanggal Pembuatan : Selasa, 25 Maret 2025
 */

import java.time.LocalDate;

public abstract class Manusia {
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    public Manusia(){
        counterMns++;
    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getTgl(){
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTgl(LocalDate tgl){
        this.tgl_mulai_kerja = tgl;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal mulai kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    public static void printCounterMns() {
        System.out.println("Jumlah objek manusia: " + counterMns);
    }

    public abstract int hitungMasaKerja();
}
