import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PEGAWAI =====");
        Pegawai pegawai1 = new Pegawai("12345", "Adi Santoso", LocalDate.of(1985, 5, 20), LocalDate.of(2010, 1, 1), 5000000);
        pegawai1.printInfo();
        System.out.println();

        System.out.println("===== DOSEN =====");
        Dosen dosen1 = new Dosen("67890", "Ana Yati", LocalDate.of(1980, 10, 15), LocalDate.of(2008, 5, 1), 7000000, "Teknik");
        dosen1.printInfo();
        System.out.println();

        System.out.println("===== DOSEN TETAP =====");
        DosenTetap dosenTetap1 = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        dosenTetap1.printInfo();
        System.out.println();

        System.out.println("===== DOSEN TAMU =====");
        DosenTamu dosenTamu1 = new DosenTamu("44556", "Joko Widodo", LocalDate.of(1982, 8, 30), LocalDate.of(2007, 11, 1), 6000000, "Sastra", "987654321", LocalDate.of(2015, 2, 2));
        dosenTamu1.printInfo();
        System.out.println();

        System.out.println("===== TENDIK =====");
        Tendik tendik1 = new Tendik("77889", "Dewi Lestari", LocalDate.of(1990, 3, 12), LocalDate.of(2015, 7, 1), 4500000, "Administrasi");
        tendik1.printInfo();
    }
}