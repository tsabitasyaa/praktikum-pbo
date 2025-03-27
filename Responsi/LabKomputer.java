public class LabKomputer extends RuangLaboratorium{
    private int jmlKomputer;
    private static int jmlLabKomputer = 0;

    public LabKomputer(){
        jmlKomputer++;
    }

    public LabKomputer(
        String kode, 
        double panjang, 
        double lebar, 
        double tinggi, 
        int kapasitas, 
        String namaLab,
        double hargaSewa,
        double tarif,
        int jmlKomputer
    ){
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, tarif);
        this.jmlKomputer = jmlKomputer;
        jmlLabKomputer++;
    }

    public int getJmlKomputer(){
        return jmlKomputer;
    }

    public static int getJmlLabKomputer(){
        return jmlLabKomputer;
    }

    public void setJmlKomputer(int jmlKomputer){
        this.jmlKomputer = jmlKomputer;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah komputer: " + jmlKomputer);
    }

}
