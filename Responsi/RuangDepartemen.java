public class RuangDepartemen extends Ruang{
    private int jmlMeja;
    private int jmlKursi;
    private int jmlLemari;
    private double tarif;
    private String namaDepartemen;
    private String KetuaDepartemen;
    private static int jmlRuangDepartemen = 0;

    public RuangDepartemen(){
        jmlRuangDepartemen++;
    }

    public RuangDepartemen(
        String kode, 
        double panjang, 
        double lebar, 
        double tinggi, 
        int kapasitas,
        int jmlMeja, 
        int jmlKursi, 
        int jmlLemari, 
        double tarif, 
        String namaDepartemen, 
        String KetuaDepartemen
    ){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jmlMeja = jmlMeja;
        this.jmlKursi = jmlKursi;
        this.jmlLemari = jmlLemari;
        this.tarif = tarif;
        this.namaDepartemen = namaDepartemen;
        this.KetuaDepartemen = KetuaDepartemen;
        jmlRuangDepartemen++;
    }

    public int getJmlMeja(){
        return jmlMeja;
    }

    public int getJmlKursi(){
        return jmlKursi;
    }

    public int getJmlLemari(){
        return jmlLemari;
    }

    public double getTarif(){
        return tarif;
    }

    public String getNamaDepartemen(){
        return namaDepartemen;
    }

    public String getKetuaDepartemen(){
        return KetuaDepartemen;
    }

    public static int getRuangDepartemen(){
        return jmlRuangDepartemen;
    }

    public void setJmlMeja(int jmlMeja){
        this.jmlMeja = jmlMeja;
    }

    public void setJmlKursi(int jmlKursi){
        this.jmlKursi = jmlKursi;
    }

    public void setJmlLemari(int jmlLemari){
        this.jmlLemari = jmlLemari;
    }

    public void setTarif(double tarif){
        this.tarif = tarif;
    }

    public void setNamaDepartemen(String namaDepartemen){
        this.namaDepartemen = namaDepartemen;
    }

    public void setKetuaDepartemen(String KetuaDepartemen){
        this.KetuaDepartemen = KetuaDepartemen;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Nama Departemen: " + namaDepartemen);
        System.out.println("Ketua Departemen: " + KetuaDepartemen);
        super.tampilkanInfo();
        System.out.println("Jumlah Meja: " + jmlMeja);
        System.out.println("Jumlah Kursi: " + jmlKursi);
        System.out.println("Jumlah Lemari: " + jmlLemari);
        System.out.println("Tarif: " + tarif);
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang() * getLebar() * tarif;
    }
}
