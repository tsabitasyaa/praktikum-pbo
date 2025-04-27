import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        System.out.println("Nama: Tsabita Syahida Khafid");
        System.out.println("NIM: 24060123130071\n");

        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/* 
2. Jelaskan manfaat polimorfisme pada kasus ini.
=>  - Menyederhanakan kode: bisa menyimpan semua objek subclass (Programmer, Manajer) dalam satu ArrayList<Pegawai>.
    - Memudahkan perulangan: Tanpa perlu tahu tipe pastinya, cukup pakai emp.tampilData(); di dalam loop.
    - Fleksibilitas tinggi: Kalau nanti ada subclass baru misal Designer, kita tinggal buat objeknya dan tambahkan ke list tanpa ubah kode utama.
    - Maintainability lebih baik: Program jadi lebih mudah diperluas (extensible) dan dirawat.\

3. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa
permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
=>  - Tidak bisa menyimpan semua objek (Programmer, Manajer) dalam satu ArrayList<Pegawai>.
    - Harus membuat list terpisah atau variable terpisah untuk setiap tipe (Programmer, Manajer, dll.).
    - Setiap penambahan objek baru (seperti pegawai4, pegawai5) akan memerlukan perubahan besar di kode.
*/
