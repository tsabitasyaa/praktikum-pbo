public class Garis {
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    Garis() {
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik var1, Titik var2) {
        this.titikAwal = var1;
        this.titikAkhir = var2;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return this.titikAwal;
    }

    Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    void setTitikAwal(Titik var1){
        this.titikAwal = var1;
    }

    void setTitikAkhir(Titik var2){
        this.titikAkhir = var2;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double getPanjang(){
        return titikAwal.getJarak(titikAkhir);
    }

    double getGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;   
    }

    Titik getTitikTengah(){
        double tengahX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double tengahY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(tengahX, tengahY);       
    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien()*G.getGradien() == -1;
    }

    void printGaris(){
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    String getPersamaanGaris(){
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}