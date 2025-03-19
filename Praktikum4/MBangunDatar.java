public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(6, "Merah", "Tebal");
        System.out.println("===== PERSEGI =====");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(14, "Kuning", "Tipis");
        System.out.println("===== LINGKARAN =====");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
        System.out.println();

        // Menampilkan jumlah objek BangunDatar yang telah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}

/*
1. Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas
Persegi dan Lingkaran?
-> Maka kelas Persegi dan Lingkaran yang sebelumnya merupakan subclass dari BangunDatar akan mengalami error, karena kelas final tidak dapat diwarisi.
2. Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
kelas Persegi dan Lingkaran?
-> Method printInfo() di kelas Persegi dan Lingkaran akan error jika mencoba override.
-> final pada method berarti method tidak bisa diubah (di-override) oleh subclass.
*/
