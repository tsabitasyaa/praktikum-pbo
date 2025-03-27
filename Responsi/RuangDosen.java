public class RuangDosen extends Ruang{
    private String namaDosen;
    private int jmlMeja;
    private int jmlKursi;
    private double tarif;
    private static int jmlRuangDosen = 0;

    public RuangDosen(){
        jmlRuangDosen++;
    }

    public RuangDosen(
        String kode, 
        double panjang, 
        double lebar, 
        double tinggi, 
        int kapasitas,
        String namaDosen,
        int jmlMeja,
        int jmlKursi,
        double tarif
    ){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jmlMeja = jmlMeja;
        this.jmlKursi = jmlKursi;
        this.tarif = tarif;
        jmlRuangDosen++;
    }

    public String getNamaDosen(){
        return this.namaDosen;
    }

    public int getJmlMeja(){
        return this.jmlMeja;
    }

    public int getJmlKursi(){
        return this.jmlKursi;
    }

    public double getTarif(){
        return this.tarif;
    }

    public static int getJmlRuangDosen(){
        return jmlRuangDosen;
    }

    public void setNamaDosen(String namaDosen){
        this.namaDosen = namaDosen;
    }

    public void setJmlMeja(int jmlMeja){
        this.jmlMeja = jmlMeja;
    }

    public void setJmlKursi(int jmlKursi){
        this.jmlKursi = jmlKursi;
    }

    public void setTarif(double tarif){
        this.tarif = tarif;
    }

    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Nama Dosen: " + this.namaDosen);
        System.out.println("Jumlah Meja: " + this.jmlMeja);
        System.out.println("Jumlah Kursi: " + this.jmlKursi);
        System.out.println("Tarif: " + this.tarif);
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang() * getLebar() * tarif;
    }
}
