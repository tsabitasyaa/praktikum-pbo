/* Nama File : MataKuliah.java
 * Deskripsi : berisi atribut dan method dalam class MataKuliah
 * Pembuat : Tsabita Syahida Khafid
 * Tanggal : 3 Maret 2025
 */

public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    // konstruktor tanpa parameter
    public MataKuliah(){
        this.idMatkul = " ";
        this.nama = " ";
        this.sks = 0;
    }

    // konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // selektor
    public String getIdMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    // mutator
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
