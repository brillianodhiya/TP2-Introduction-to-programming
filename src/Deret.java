import java.util.Scanner;

public class Deret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan banyak angka (min 2, max 10): ");
            n = input.nextInt();
        } while (n < 2 || n > 10);

        int beda;
        do {
            System.out.print("Masukkan beda antar angka (min 2, max 9): ");
            beda = input.nextInt();
        } while (beda < 2 || beda > 9);

        int[] aritmatika = new int[n];
        int[] geometri = new int[n];

        // menghitung deret aritmatika dan geometri
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                aritmatika[i] = 1;
                geometri[i] = 1;
            } else {
                aritmatika[i] = aritmatika[i-1] + beda;
                geometri[i] = geometri[i-1] * beda;
            }
        }

        // menampilkan deret aritmatika
        System.out.println("===================================");
        System.out.println("Deret Aritmatika:");
        for (int i = 0; i < n; i++) {
            System.out.print(aritmatika[i] + " ");
        }
        System.out.println();

        // menampilkan deret geometri
        System.out.println("Deret Geometri:");
        for (int i = 0; i < n; i++) {
            System.out.print(geometri[i] + " ");
        }
        System.out.println();

        // menghitung faktorial
        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        // menampilkan hasil faktorial
        System.out.println("Faktorial dari " + n + ":");
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
            if (i != 1) {
                System.out.print("* ");
            } else {
                System.out.print("= ");
            }
        }
        System.out.println(faktorial);

        // menanyakan apakah user ingin mengulang perhitungan
        System.out.print("Anda mau ulang [y/t]: ");
        char ulang = input.next().charAt(0);
        if (ulang == 'y' || ulang == 'Y') {
            main(args);
        } else {
            System.out.println("Program selesai.");
        }
    }
}
