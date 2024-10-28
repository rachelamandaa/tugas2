Program GanjilGenap
Program ini dibuat untuk menentukan apakah suatu bilangan adalah ganjil atau genap. Program akan meminta input dari pengguna berupa bilangan bulat dan mengembalikan hasil berupa jenis bilangan (ganjil/genap) berdasarkan perhitungan sederhana.

Cara Kerja Program
Program menggunakan class Scanner untuk membaca input dari pengguna.
Setelah mendapatkan input, program mengecek apakah bilangan tersebut ganjil atau genap menggunakan operasi modulus (%).
Jika bilangan habis dibagi 2 (bilangan % 2 == 0), maka bilangan tersebut adalah genap.
Jika tidak, maka bilangan tersebut adalah ganjil.
Hasilnya akan dicetak ke layar dan scanner akan ditutup setelah input selesai diproses.
Cara Menjalankan Program
Pastikan Anda sudah menginstal Java Development Kit (JDK) di komputer Anda.

Simpan kode ke dalam file bernama GanjilGenap.java.

Buka terminal atau command prompt, navigasikan ke direktori tempat file GanjilGenap.java disimpan.

Jalankan perintah berikut untuk meng-compile program:

bash
Salin kode
javac GanjilGenap.java
Setelah berhasil dikompilasi, jalankan program dengan perintah:

bash
Salin kode
java GanjilGenap
Masukkan bilangan yang ingin Anda cek (ganjil/genap) ketika diminta, lalu tekan Enter.

Contoh Input dan Output
Input:

yaml
Salin kode
Masukkan bilangan: 7
Output:

Salin kode
7 adalah bilangan ganjil.
Input:

yaml
Salin kode
Masukkan bilangan: 10
Output:

Salin kode
10 adalah bilangan genap.
Struktur Program
java
Salin kode
public class GanjilGenap {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }
        
        input.close();
    }
}
Catatan
Program ini hanya memproses bilangan bulat (integer).
Tidak ada validasi untuk input selain bilangan bulat; jika input bukan integer, program akan mengalami error.
