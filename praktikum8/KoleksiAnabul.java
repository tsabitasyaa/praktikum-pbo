/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
import java.util.ArrayList;

public class KoleksiAnabul<T extends Anabul> {
    private ArrayList<T> wadah;
    private int nbelm; // banyak elemen yang terisi

    public KoleksiAnabul() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    // Mengembalikan jumlah elemen yang terisi
    public int getSize() {
        return nbelm;
    }

    // Mengatur jumlah elemen yang terisi (penggunaan terbatas, hati-hati)
    public void setSize(int x) {
        this.nbelm = x;
    }

    // Mengambil elemen pada indeks tertentu
    public T getIsi(int indeks) {
        return wadah.get(indeks);
    }

    // Menetapkan nilai elemen pada indeks tertentu
    public void setIsi(int indeks, T e) {
        wadah.set(indeks, e);
    }

    // Menambahkan elemen ke akhir koleksi
    public void add(T e) {
        wadah.add(e);
        nbelm++;
    }

    // Menghapus dan mengembalikan elemen terakhir koleksi
    public T delete() {
        T e = wadah.get(nbelm - 1);
        wadah.remove(nbelm - 1);
        nbelm--;
        return e;
    }
    
    public void showAll() {
        System.out.println("Isi Koleksi:");
        for (int i = 0; i < nbelm; i++) {
            T item = wadah.get(i);
            item.tampilData();
            System.out.println();
        }
    }
}
