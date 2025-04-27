public class Burung extends Anabul{
    public Burung(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Jenis anabul: burung");
    }

    @Override
    public void Gerak(){
        System.out.println(getNama() + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + " bersuara cuit");
    }
}
