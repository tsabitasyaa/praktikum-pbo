/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class Anjing extends Anabul{
    public Anjing(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Jenis anabul: anjing");
        Gerak();
        Bersuara();
    }

    @Override
    public void Gerak(){
        System.out.println(getNama() + " bergerak dengan melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + " bersuara guk-guk");
    }
}

