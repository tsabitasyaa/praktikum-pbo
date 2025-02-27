/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat : Tsabita Syahida Khafid
 * Tanggal : 20 Februari 2025
 */

 public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }    

    //konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }    

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    void printCounterTitik(){
        System.out.println(counterTitik);
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        this.absis = x;
    }

    //mengeset absis titik dengan nilai baru y
    void setOrdinat(double y){
        this.ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //menentukan kuadran titik
    double getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        }
        else if (absis < 0 && ordinat > 0){
            return 2;
        }
        else if (absis < 0 && ordinat < 0){
            return 3;
        }
        else if (absis > 0 && ordinat < 0 ){
            return 4;
        }
        return 0;
    }

    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(T.absis-this.absis, 2) + Math.pow(T.ordinat-this.ordinat, 2));
    }

    void refleksiX(){
        ordinat = ordinat * (-1);
    }

    void refleksiY(){
        absis = absis * (-1);
    }

    Titik getRefleksiX(){
        return new Titik(getAbsis(), getOrdinat()*(-1));
    }

    Titik getRefleksiY(){
        return new Titik(getAbsis()*(-1), getOrdinat());
    }
}