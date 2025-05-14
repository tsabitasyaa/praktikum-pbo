/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class Segitiga extends BangunDatar {
    private double a;
    private double b;
    private double c;
    
    public Segitiga(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double hitungKeliling(){
        return a + b + c;
    }
    
    @Override
    public double hitungLuas(){
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
