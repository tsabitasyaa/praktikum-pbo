/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class Persegi extends BangunDatar{
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double hitungKeliling(){
        return sisi*4;
    }
    
    @Override
    public double hitungLuas(){
        return sisi*sisi;
    }
}
