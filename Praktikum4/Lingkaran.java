public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        super(1, warna, border);
        this.jari = diameter/2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return Math.PI * 2 * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari-jari: " + jari);
    }
}
