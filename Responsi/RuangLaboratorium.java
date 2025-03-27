public class RuangLaboratorium extends Ruang{
    private String namaLab;
    private double hargaSewa;
    private double tarif;
    private static int jmlRuangLab = 0;

    public RuangLaboratorium(){
        jmlRuangLab++;
    }

    public RuangLaboratorium(
        String kode, 
        double panjang, 
        double lebar, 
        double tinggi, 
        int kapasitas, 
        String namaLab,
        double hargaSewa,
        double tarif
    ){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        this.tarif = tarif;
        jmlRuangLab++;
    }

    public String getNamaLab(){
        return namaLab;
    }

    public double getHargaSewa(){
        return hargaSewa;
    }

    public double getTarif(){
        return tarif;
    }

    public static int getJmlRuangLab(){
        return jmlRuangLab;
    }

    public void setNamaLab(String namaLab){
        this.namaLab = namaLab;
    }

    public void setHargaSewa(double hargaSewa){
        this.hargaSewa = hargaSewa;
    }

    public void setTarif(double tarif){
        this.tarif = tarif;
    }

    @Override
    public void tampilkanInfo(){
        System.out.println("Nama Lab: " + namaLab);
        super.tampilkanInfo();
        System.out.println("Harga Sewa: " + hargaSewa);
        System.out.println("Tarif: " + tarif);
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang() * getLebar() * tarif;
    }
}
