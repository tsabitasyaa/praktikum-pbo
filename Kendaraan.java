/* Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat : Tsabita Syahida Khafid
 * Tanggal : 3 Maret 2025
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    // konstruktor tanpa parameter
    public Kendaraan(){
        this.noPlat = " ";
        this.jenis = " ";
    }

    // konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    // mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}
