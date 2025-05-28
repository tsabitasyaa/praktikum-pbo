/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;
import jdbc.service.MysqlMahasiswaService;
import jdbc.model.Mahasiswa;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author tsabi
 */
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author LENOVO
 */
public class Program {
    public static void main(String[] args) {
        MysqlMahasiswaService service = new MysqlMahasiswaService();

        // Tambah Mahasiswa baru
        Mahasiswa m1 = new Mahasiswa(1, "Nina");
        service.add(m1);
        System.out.println("Mahasiswa baru ditambahkan.");

        // Ambil semua mahasiswa
        List<Mahasiswa> daftar = service.getAll();
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m : daftar) {
            System.out.println("ID: " + m.getId() +  ", Nama: " + m.getNama());
        }

        // Ambil satu mahasiswa berdasarkan ID (misalnya ID = 1)
        Mahasiswa mhs = service.getById(2);
        if (mhs != null) {
            System.out.println("Mahasiswa ditemukan: " + mhs.getNama());
        } else {
            System.out.println("Mahasiswa dengan ID 1 tidak ditemukan.");
        }

        // Update mahasiswa
        System.out.println("===update");
        if (mhs != null) {
            System.out.println("Akan diupdate data lama: " + mhs.getNama());
            mhs.setNama("Dinaya");
            System.out.println("dengan data baru: " + mhs.getNama());
            service.update(mhs);
        }

        // Delete mahasiswa berdasarkan ID
        service.delete(2);
        System.out.println("Mahasiswa dengan ID 2 dihapus.");
    }
}