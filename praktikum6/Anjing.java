public class Anjing extends Anabul{
    public Anjing(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Jenis anabul: anjing");
    }

    @Override
    public void Gerak(){
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + " bersuara meong");
    }
}
