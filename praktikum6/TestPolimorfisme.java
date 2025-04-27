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
