public class RuangKelas extends Ruang{
    private int jmlKursiTersedia;
    private int jmlKursiRusak;
    private double tarif;
    private static int jmlRuangKelas = 0;

    public RuangKelas(){
        jmlRuangKelas++;
    }
    public RuangKelas(
        String kode, 
        double panjang, 
        double lebar, 
        double tinggi, 
        int kapasitas, 
        int jmlKursiTersedia, 
        int jmlKursiRusak, 
        double tarif
    ){
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jmlKursiTersedia = jmlKursiTersedia;
        this.jmlKursiRusak = jmlKursiRusak;
        this.tarif = tarif;
        jmlRuangKelas++;
    }

    public int getJmlKursiTersedia(){
        return jmlKursiTersedia;
    }

    public int getJmlKursiRusak(){
        return jmlKursiRusak;
    }

    public static int getJmlRuangKelas(){
        return jmlRuangKelas;
    }

    public void setJmlKursiTersedia(int jmlKursiTersedia){
        this.jmlKursiTersedia = jmlKursiTersedia;
    }

    public void setJmlKursiRusak(int jmlKursiRusak){
        this.jmlKursiRusak = jmlKursiRusak;
    }

    public double getTarif(){
        return tarif;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah Kursi Tersedia: " + jmlKursiTersedia);
        System.out.println("Jumlah Kursi Rusak: " + jmlKursiRusak);
        System.out.println("Tarif: Rp" + tarif);
    }

    @Override
    public double hitungBiayaKebersihan(){
        return getPanjang() * getLebar() * tarif;
    }
}
