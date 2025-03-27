import java.util.List;

public class LabKimia extends RuangLaboratorium{
    private List<String> matakuliah;
    private static int jmlLabKimia = 0;

    public LabKimia(){
        jmlLabKimia++;
    }

    public LabKimia(
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
        jmlLabKimia++;
    }

    public static int getJmlLabBiologi(){
        return jmlLabKimia;
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
