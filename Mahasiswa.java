/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat : Tsabita Syahida Khafid
 * Tanggal : 3 Maret 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = " ";
        this.nama = " ";
        this.prodi = " ";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //konstruktor dengan parameter
    public Mahasiswa (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>(); 
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // selektor
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }
    public Dosen getDosenwali(){
        return dosenWali;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // mutator
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public int getJumlahSks(){
        int sum = 0;
        for (int i = 0; i < listMatKul.size(); i++){
           sum += listMatKul.get(i).getSks(); 
        }
        return sum;
    }

    public int getJumlahMatkul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata kuliah yang diambil: ");
        int i;
        for(i=0; i<listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Doswal: " + dosenWali.getNama());
        System.out.println("Kendaraan: " + kendaraan.getJenis());
    }
}