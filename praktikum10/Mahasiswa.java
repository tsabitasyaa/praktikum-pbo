/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author tsabi
 */

public class Mahasiswa {
    private int id;
    private String nama;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
    }

    // Konstruktor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter untuk id
    public int getId() {
        return id;
    }

    // Setter untuk id
    public void setId(int id) {
        this.id = id;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Override toString untuk representasi string
    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}

