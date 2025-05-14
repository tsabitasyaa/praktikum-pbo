/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class MDatum {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Cemong"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Blacky"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Odi"));
        
        System.out.println("=== Perilaku Kucing ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumKucing);
      
        System.out.println("=== Perilaku Anjing ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumAnjing);
        
        System.out.println("=== Perilaku Burung ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}
