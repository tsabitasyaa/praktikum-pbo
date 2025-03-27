import java.util.List;

public class LabFisika extends RuangLaboratorium{
    private List<String> matakuliah;
    private static int jmlLabFisika = 0;

    public LabFisika(){
        jmlLabFisika++;
    }

    public LabFisika(
        String kode, 
        double panjang, 
        double lebar, 
        double tinggi, 
        int kapasitas, 
        String namaLab,
        double hargaSewa,
        double tarif,
        List<String> matakuliah
    ){
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, tarif);
        this.matakuliah = matakuliah;
        jmlLabFisika++;
    }

    public static int getJmlLabBiologi(){
        return jmlLabFisika;
    }

    public List<String> getMatakuliah(){
        return matakuliah;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Matakuliah : ");
        for(String matakuliah : matakuliah){
            System.out.println(matakuliah);
        }
    }

}
