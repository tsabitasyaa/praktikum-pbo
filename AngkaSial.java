/**
 * File : AngkaSial.java
 * Deskripsi : program menggunakan exception buatan sendiri
 *             pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() tlah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/**
 * PERTANYAAN:
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
-> Tidak, karena jika terjadi eksepsi yaitu angka = 13 maka akan masuk ke kondisi eksepsi
kemudian program akan melempar (throw) new AngkaSialException();
setelah terjadi eksepsi program akan berhenti sehingga baris 12 tidak dieksekusi.

*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
-> Iya, karena pada baris 19 terjadi eksepsi angka = 13
throw new AngkaSialException(); dieksekusi, sehingga metode cobaAngka() langsung dihentikan.
Program langsung lompat ke blok catch (AngkaSialException ase) dalam main() dan dieksekusi.
 */
