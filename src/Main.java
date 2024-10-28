import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta input bilangan dari pengguna
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        // Menutup scanner
        input.close();
    }
}