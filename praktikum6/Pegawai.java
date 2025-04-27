public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public int getGajiPokok(){
        return gajiPokok;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
    }
}
