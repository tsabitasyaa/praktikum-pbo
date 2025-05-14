/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class MKoleksiAnabul {
     public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>();

        koleksiAnabul.add(new Kucing("Cemong"));
        koleksiAnabul.add(new Anjing("Jack"));
        koleksiAnabul.add(new Burung("Pipit"));
        koleksiAnabul.add(new Anjing("Maeumi"));
        koleksiAnabul.add(new Kucing("Mona"));
        koleksiAnabul.add(new Kucing("Sumbul"));
        koleksiAnabul.add(new Burung("Cicit"));
        koleksiAnabul.add(new Kucing("Oren"));
        koleksiAnabul.add(new Burung("Odi"));
        koleksiAnabul.add(new Anjing("Bisco"));

        koleksiAnabul.showAll();
 
     }
}

