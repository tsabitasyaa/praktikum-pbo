import java.util.List;

public class LabBiologi extends RuangLaboratorium{
    private List<String> matakuliah;
    private static int jmlLabBiologi = 0;

    public LabBiologi(){
        jmlLabBiologi++;
    }

    public LabBiologi(
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
        jmlLabBiologi++;
    }

    public static int getJmlLabBiologi(){
        return jmlLabBiologi;
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
