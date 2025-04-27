public class Kucing extends Anabul{
    public Kucing(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Jenis anabul: kucing");
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
