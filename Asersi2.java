/**
 * File : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak inout jari-jari lingkaran yang bernilai nol
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/**
 * PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
 * -> Asersi bukan untuk validasi input pengguna, melainkan untuk debugging kode internal.
 * assert lebih baik diletakkan di metode, bukan di main().
 * code yang lebih baik:
 * 
 * class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        setJariJari(jariJari); // Gunakan setter untuk validasi
    }
    public void setJariJari(double jariJari) {
        assert jariJari > 0 : "Jari-jari harus lebih dari nol!";
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}
    public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        
        Lingkaran l = new Lingkaran(jariJari);
        System.out.println("Keliling lingkaran = " + l.hitungKeliling());
    }
}
 */
