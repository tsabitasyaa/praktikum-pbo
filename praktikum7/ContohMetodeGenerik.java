/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class ContohMetodeGenerik {
    public static <T extends Anabul> 
        void tampilkanPerilaku(Datum<T> datum) {
            datum.getIsi().Gerak();
            datum.getIsi().Bersuara();
    }
}
