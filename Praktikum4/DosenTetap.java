import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }
    public LocalDate getBUP() {
        LocalDate bupDate = getTglLahir().plusYears(65);
        return bupDate.plusMonths(1).withDayOfMonth(1);
    }

    public double getTunjangan() {
        return 0.02 * (int) ChronoUnit.YEARS.between(getTMT(), LocalDate.now()) * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDN: " + getNIDN());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + getFormattedDate(getTglLahir()));
        System.out.println("TMT: " + getFormattedDate(getTMT()));
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("BUP: " + getFormattedDate(getBUP()));
        System.out.println("Gaji Pokok: Rp " + getGajiPokok());
        System.out.println("Tunjangan: 2% x " + (int) ChronoUnit.YEARS.between(getTMT(), LocalDate.now()) + " x Rp " + getGajiPokok() + " = Rp " + getTunjangan());
    }
}
