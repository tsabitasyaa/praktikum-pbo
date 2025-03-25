public class Lingkaran extends BangunDatar implements IResize{
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

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return Math.PI * 2 * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent/100;
    }
}
