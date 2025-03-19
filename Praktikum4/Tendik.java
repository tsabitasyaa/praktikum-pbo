import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }
    public LocalDate getBUP() {
        return getTglLahir().plusYears(55).withDayOfMonth(1).plusMonths(1);
    }

    public double getTunjangan() {
        return 0.01 * (int) ChronoUnit.YEARS.between(getTMT(), LocalDate.now()) * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + getFormattedDate(getTglLahir()));
        System.out.println("TMT: " + getFormattedDate(getTMT()));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang: " + getBidang());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("BUP: " + getFormattedDate(getBUP()));
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
