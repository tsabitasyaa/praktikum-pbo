/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat : Tsabita Syahida Khafid
 * Tanggal : 3 Maret 2025
 */

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // konstruktor tanpa parameter
    public Dosen(){
        this.nip = " ";
        this.nama = " ";
        this.prodi = " ";
    }

    // konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // selektor
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    // mutator
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
