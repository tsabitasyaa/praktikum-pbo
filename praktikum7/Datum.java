/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class Datum<Generik> {
    private Generik isi;
    
    public Datum(Generik isi){
        this.isi = isi;
    }
    
    public Generik getIsi(){
        return this.isi;
    }
    
    public void setIsi(Generik x){
        this.isi = x;
    }
    
}
