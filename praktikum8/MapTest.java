/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7;

/**
 *
 * @author tsabi
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        // kunci-> integer, nilai-> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        
        // bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci?
        for (Integer k : key) {
            String nilai = map.get(k);
            System.out.println(k + " : " + nilai);
        }
    }
}
