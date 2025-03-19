import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tglLahir;
    private LocalDate TMT;
    private double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getFormattedDate(LocalDate date) {
        int day = date.getDayOfMonth();
        String month = date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID"));
        int year = date.getYear();
        return day + " " + month + " " + year;
    }
    public String getNIP() { 
        return NIP; 
    }
    public String getNama() { 
        return nama; 
    }
    public LocalDate getTglLahir() { 
        return tglLahir; 
    }
    public LocalDate getTMT() { 
        return TMT;
    }
    public double getGajiPokok() { 
        return gajiPokok; 
    }
    public String getMasaKerja() {
        LocalDate now = LocalDate.of(2025, 3, 10); // Sesuai contoh perhitungan
        long years = ChronoUnit.YEARS.between(TMT, now);
        long months = ChronoUnit.MONTHS.between(TMT.plusYears(years), now);
        return years + " tahun " + months + " bulan";
    }

    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + getFormattedDate(tglLahir));
        System.out.println("TMT: " + getFormattedDate(TMT));
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Gaji Pokok: Rp " + getGajiPokok());
    }
}
