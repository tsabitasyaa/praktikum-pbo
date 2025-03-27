import java.util.Arrays;

public class Mruang {
    public static void main(String[] args){
        RuangDepartemen ruang1 = new RuangDepartemen(
            "RD-101", 10.5, 8.2, 3.5, 30, 
            10, 30, 5, 5000, "Teknik Informatika", "Dr. Budi Santoso"
        );

        RuangKelas kelas1 = new RuangKelas(
            "RK-201", 8.0, 6.0, 3.0, 25, 
            20, 5, 3000
        );

        RuangDosen dosen1 = new RuangDosen(
            "RDN-301", 6.0, 5.0, 3.0, 1, "Prof. Siti Rahma",
            1, 1, 2000
        );

        LabKomputer labKomputer1 = new LabKomputer("LK001", 14, 10, 3.5, 25, "Lab Komputer", 750000, 2500, 20);

        LabBiologi labBiologi1 = new LabBiologi("LB001", 16, 12, 4, 35, "Lab Biologi", 600000, 1800, Arrays.asList("Biologi Molekuler", "Mikrobiologi", "Genetika"));

        LabFisika labFisika = new LabFisika(
            "LF01", 16.0, 10.0, 4.5, 30, "Lab Fisika", 130000, 5500,
            Arrays.asList("Fisika Dasar", "Fisika Lanjut", "Optik")
        );

        LabKimia labKimia = new LabKimia(
            "LK01", 15.5, 9.5, 4.0, 32, "Lab Kimia", 125000, 5200,
            Arrays.asList("Kimia Organik", "Kimia Anorganik", "Kimia Fisik")
        );

        // Menampilkan informasi ruang1
        System.out.println("Informasi Ruang Departemen 1:");
        ruang1.tampilkanInfo();
        System.out.println("Biaya Kebersihan: Rp " + ruang1.hitungBiayaKebersihan());
        System.out.println();

        // Menampilkan informasi ruang kelas
        System.out.println("Informasi Ruang Kelas 1:");
        kelas1.tampilkanInfo();
        System.out.println("Biaya Kebersihan: Rp " + kelas1.hitungBiayaKebersihan());
        System.out.println();

        // Menampilkan informasi ruang dosen
        System.out.println("Informasi Ruang Dosen 1:");
        dosen1.tampilkanInfo();
        System.out.println("Biaya Kebersihan: Rp " + dosen1.hitungBiayaKebersihan());
        System.out.println();

        labKomputer1.tampilkanInfo();
        System.out.println("Biaya Kebersihan: Rp" + labKomputer1.hitungBiayaKebersihan());
        
        labBiologi1.tampilkanInfo();
        System.out.println("Biaya Kebersihan: Rp" + labBiologi1.hitungBiayaKebersihan());

        labFisika.tampilkanInfo();
        System.out.println("Biaya Kebersihan: Rp" + labFisika.hitungBiayaKebersihan());

        labKimia.tampilkanInfo();
        System.out.println("Biaya Kebersihan: Rp" + labKimia.hitungBiayaKebersihan());

        System.out.println("Jumlah Ruang: " + Ruang.getJmlRuang());
        System.out.println("Jumlah Ruang Departmen: " + RuangDepartemen.getRuangDepartemen());
        System.out.println("Jumlah Ruang Kelas: " + RuangKelas.getJmlRuangKelas());
        System.out.println("Jumlah Ruang Lab: " + RuangLaboratorium.getJmlRuangLab());
        System.out.println("Jumlah Ruang Lab Komputer: " + LabKomputer.getJmlLabKomputer());
        System.out.println("Jumlah Ruang Dosen: " + RuangDosen.getJmlRuangDosen());
    }
}
