public abstract class Ruang {
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;
    private static int jmlRuang = 0;

    public Ruang(){
        jmlRuang++;
    }

    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
        jmlRuang++;
    }
    public String getKode() {
        return kode;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public static int getJmlRuang() {
        return jmlRuang;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }   

    public void tampilkanInfo(){
        System.out.println("Kode: " + kode);
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Kapasitas: " + kapasitas);
    }

    public abstract double hitungBiayaKebersihan();
}
