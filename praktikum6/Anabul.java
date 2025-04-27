public abstract class Anabul {
    private String nama;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama: " + nama);
    }

    public abstract void Gerak();

    public abstract void Bersuara();
}
