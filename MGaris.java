/* Nama File : MGaris.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat : Tsabita Syahida Khafid
 * Tanggal : 27 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(0, 0);
        Titik t2 = new Titik(3, 4);
        Titik t3 = new Titik(-2, 0);
        Titik t4 = new Titik(4, 8);
        
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);

        System.out.println("Panjang Garis 1: " + g1.getPanjang());
        System.out.println("Panjang Garis 2: " + g2.getPanjang());

        System.out.println("Gradien Garis 1: " + g1.getGradien());
        System.out.println("Gradien Garis 2: " + g2.getGradien());

        Titik tengah1 = g1.getTitikTengah();
        Titik tengah2 = g2.getTitikTengah();
        System.out.print("Titik tengah Garis 1: ");
        tengah1.printTitik();
        System.out.print("Titik tengah Garis 2: ");
        tengah2.printTitik();

        System.out.println("Apakah Garis 1 sejajar dengan Garis 2? " + g1.isSejajar(g2));

        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 2? " + g1.isTegakLurus(g2));

        System.out.println("Garis 1:");
        g1.printGaris();
        System.out.println("\nGaris 2:");
        g2.printGaris();

        System.out.println("\nPersamaan Garis 1: " + g1.getPersamaanGaris());
        System.out.println("Persamaan Garis 2: " + g2.getPersamaanGaris());

        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
