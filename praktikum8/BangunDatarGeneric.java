/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */
public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;
    
    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T1 get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
    
    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
    
}

/* Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti
dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !
=> Mengganti T dengan nama lain seperti T1, T2, atau T1234 tidak mempengaruhi fungsi atau perilaku program. 
Karakter seperti T, T1, atau T1234 hanyalah penamaan bebas untuk parameter tipe generik, 
yang bisa digunakan untuk meningkatkan keterbacaan jika punya banyak parameter generik 
atau ingin memberi nama yang lebih deskriptif.
*/

