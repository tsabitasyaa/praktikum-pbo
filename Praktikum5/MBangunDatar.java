public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); -> tidak bisa karena class abstract tidak bisa dibuat object
        BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
        Persegi P2 = new Persegi(5, "Kuning", "Putih");
        BangunDatar L1 = new Lingkaran(7, "Biru", "Putih");
        Lingkaran L2 = new Lingkaran (14, "Hijau", "Hitam");
        // P1 dan L1 bisa bertipe BangunDatar karena subclass dari BangunDatar
        // *tambahkan parameter pada konstruktor
        System.out.println("=== Info P1 ===");
        P1.printInfo();
        System.out.println("\n=== Info P2 ===");
        P2.printInfo();
        System.out.println("\n=== Info L1 ===");
        L1.printInfo();
        System.out.println("\n=== Info L2 ===");
        L2.printInfo();

        System.out.println("\n=== isEqualLuas ===");
        if(P1.isEqualLuas(P2)){
            System.out.println("Luas P1 sama dengan P2");
        } else{
            System.out.println("Luas P1 tidak sama dengan P2");
        }

        System.out.println("\n=== isEqualKeliling ===");
        if(P1.isEqualKeliling(L1)){
            System.out.println("Luas P1 sama dengan L1");
        } else{
            System.out.println("Luas P1 tidak sama dengan L1");
        }
        /*5
        Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek bangun datar yang berbeda? 
        -> Iya, karena method terdapat di superclass yang bisa diakses subclass yang berbeda.
           Metode isEqualLuas(BangunDatar X) bisa digunakan untuk membandingkan objek BangunDatar 
           yang berbeda karena konsep polimorfisme dalam OOP. Saat isEqualLuas() dipanggil dari persegi, 
           parameter X bisa berisi objek dari subclass lain.
           Karena X adalah BangunDatar, kita bisa menggunakan metode getLuas() pada X, meskipun tipe sebenarnya adalah Lingkaran.

        Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas() dan isEqualKeliling pada class BangunDatar? Mengapa?
        -> Tidak bisa, karena untuk membuat isEqualLuas() dan isEqualKeliling memerlukan getLuas() dan getKeliling()
           yang diimplementasikan langsung di class BangunDatar tetapi class BangunDatar tidak memiliki informasi 
           untuk diimplementasikan sehingga perlu dibuat menjadi class abstract.

        Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
        -> - Abstract class tidak bisa diinstansiasi langsung, sehingga tidak memungkinkan membuat objek BangunDatar secara langsung.
            BangunDatar hanyalah konsep umum, sedangkan bentuk konkret seperti Persegi dan Lingkaran yang harus diimplementasikan.
           - Metode getLuas() dan getKeliling() dideklarasikan sebagai abstract. Ini memaksa setiap subclass (Persegi, Lingkaran, dll.) 
            untuk memberikan implementasi spesifik.
           - BangunDatar masih bisa memiliki metode yang sudah diimplementasikan seperti printInfo(), isEqualLuas(), dan isEqualKeliling().
            Subclass dapat menggunakan metode ini tanpa harus mengulang implementasinya.
        */ 

        System.out.println("\n=== after resize ===");
        P2.zoomIn();
        System.out.println("Sisi P2: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Sisi P2: " + P2.getSisi());
        L2.zoom(20);
        System.out.println("Jari L2: " + L2.getJari());
        
        /*
        Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize
        dibanding dijadikan sebagai abstract method dalam class BangunDatar?
        -> Dengan menggunakan interface, kelas mana pun (termasuk kelas yang bukan turunan BangunDatar) bisa mengimplementasikan fitur zoom. 
        Misalnya, jika nanti ada kelas BangunRuang (seperti Kubus atau Bola), kelas tersebut bisa menggunakan IResize tanpa harus menjadi turunan BangunDatar.
        Jika zoomIn() dan zoomOut() ada dalam BangunDatar, maka hanya subclass BangunDatar yang dapat menggunakannya.
         */
    }
}
