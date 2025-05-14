/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("luas lingkaran : " + bdg.hitungLuas());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
        
        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdg1 = new BangunDatarGeneric<Persegi>();
        bdg1.set(p);
        System.out.println("keliling persegi : " + bdg1.hitungKeliling());
        System.out.println("luas persegi : " + bdg1.hitungLuas());
        System.out.println("tipe generic : " + bdg1.get().getClass().getName());        
        
        Persegipanjang pp = new Persegipanjang(6, 8);
        BangunDatarGeneric<Persegipanjang> bdg2 = new BangunDatarGeneric<Persegipanjang>();
        bdg2.set(pp);
        System.out.println("keliling persegi panjang : " + bdg2.hitungKeliling());
        System.out.println("luas persegi panjang : " + bdg2.hitungLuas());
        System.out.println("tipe generic : " + bdg2.get().getClass().getName());    
        
        Segitiga s = new Segitiga(2, 3, 4);
        BangunDatarGeneric<Segitiga> bdg3 = new BangunDatarGeneric<Segitiga>();
        bdg3.set(s);
        System.out.println("keliling segitiga : " + bdg.hitungKeliling());
        System.out.println("luas segitiga : " + bdg3.hitungLuas());
        System.out.println("tipe generic : " + bdg3.get().getClass().getName());    
    }
}