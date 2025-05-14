/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class MKoleksi {
    public static void main(String[] args) {
        // Membuat objek koleksi untuk karakter
        Koleksi<Character> karakterKoleksi = new Koleksi<>();
        
        // Menambahkan 10 karakter ke dalam koleksi
        System.out.println("Menambahkan 10 karakter ke dalam koleksi:");
        karakterKoleksi.add('A');
        karakterKoleksi.add('B');
        karakterKoleksi.add('C');
        karakterKoleksi.add('D');
        karakterKoleksi.add('E');
        karakterKoleksi.add('F');
        karakterKoleksi.add('G');
        karakterKoleksi.add('H');
        karakterKoleksi.add('I');
        karakterKoleksi.add('J');
        
        // Menampilkan semua elemen dalam koleksi
        karakterKoleksi.showAll();
        
        // Menampilkan ukuran koleksi
        System.out.println("\nUkuran koleksi: " + karakterKoleksi.getSize());
        
        // Mengambil elemen pada indeks tertentu
        System.out.println("\nMengambil elemen pada indeks 3: " + karakterKoleksi.getIsi(3));
        
        // Mengubah elemen pada indeks tertentu
        System.out.println("\nMengubah elemen pada indeks 5 dari 'F' ke 'Z'");
        karakterKoleksi.setIsi(5, 'Z');
        System.out.println("Elemen pada indeks 5 sekarang: " + karakterKoleksi.getIsi(5));
        
        // Menampilkan semua elemen setelah perubahan
        System.out.println("\nIsi koleksi setelah perubahan:");
        karakterKoleksi.showAll();
        
        // Menghapus beberapa elemen
        System.out.println("\nMenghapus 3 elemen terakhir:");
        System.out.println("Elemen yang dihapus: " + karakterKoleksi.delete());
        System.out.println("Elemen yang dihapus: " + karakterKoleksi.delete());
        System.out.println("Elemen yang dihapus: " + karakterKoleksi.delete());
        
        // Menampilkan semua elemen setelah penghapusan
        System.out.println("\nIsi koleksi setelah penghapusan:");
        karakterKoleksi.showAll();
        
        // Menampilkan ukuran koleksi setelah penghapusan
        System.out.println("\nUkuran koleksi setelah penghapusan: " + karakterKoleksi.getSize());
    }
}

