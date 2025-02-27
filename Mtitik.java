/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat : Tsabita Syahida Khafid
 * Tanggal : 20 Februari 2025
 */

 public class Mtitik{
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T1.printTitik();
        T2.printTitik();

        System.out.println("\nJumlah Objek Titik = " + Titik.getCounterTitik());

        // Membuat titik
        Titik T3 = new Titik(3, 4);
        Titik T4 = new Titik(6, 8);
        
        // Menampilkan titik awal
        System.out.println("\nTitik Awal:");
        T3.printTitik();
        T4.printTitik();

        // getJarakPusat
        System.out.println("Jarak T3 ke pusat: " + T3.getJarakPusat());
        System.out.println("Jarak T4 ke pusat: " + T4.getJarakPusat());        

        // getJarak
        System.out.println("\nJarak T3 ke T4: " + T3.getJarak(T4));

        // geser
        System.out.println("\nGeser T3 (x+2, y-3):");
        T3.geser(2, -3);
        T3.printTitik();

        // getKuadran
        System.out.println("\nKuadran T3: " + T3.getKuadran());
        System.out.println("Kuadran T4: " + T4.getKuadran());

        // refleksi
        System.out.println("\nRefleksi T3 terhadap sumbu X:");
        T3.refleksiX();
        T3.printTitik();

        System.out.println("\nRefleksi T4 terhadap sumbu Y:");
        T4.refleksiY();
        T4.printTitik();

        // getRefleksiX dan getRefleksiY
        Titik refleksiXT3 = T3.getRefleksiX();
        Titik refleksiYT4 = T4.getRefleksiY();
        System.out.println("\nTitik refleksi T3 terhadap X:");
        refleksiXT3.printTitik();

        System.out.println("Titik refleksi T4 terhadap Y:");
        refleksiYT4.printTitik();

        // jumlah objek yang telah dibuat
        System.out.println("\nJumlah Objek Titik = " + Titik.getCounterTitik());
    }
}
