import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tglBerakhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate tglBerakhirKontrak) {
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }
    public LocalDate getBUP() {
        return tglBerakhirKontrak;
    }

    public double getTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDN: " + getNIDK());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + getFormattedDate(getTglLahir()));
        System.out.println("TMT: " + getFormattedDate(getTMT()));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("BUP: " + getFormattedDate(getBUP()));
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: 2,5% x Rp " + getGajiPokok() + " = Rp " + getTunjangan());
    }
}

