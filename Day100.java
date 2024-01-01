
import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);

        System.out.print("MASUKKAN JUMLAH KOTAK : ");
        int kotak = yu.nextInt();

        System.out.print("MASUKKAN JUMLAH SISI : ");
        int sisi = yu.nextInt();

        System.out.print("MASUKKAN JUMLAH BARIS : ");
        int baris = yu.nextInt();

        System.out.print("MASUKKAN JUMLAH KOLOM : ");
        int kolom = yu.nextInt();

        System.out.println();

        int[][][][] Array4D = new int[kotak][sisi][baris][kolom];

        for (int i = 0; i < kotak; i++) {
            for (int j = 0; j < sisi; j++) {
                for (int k = 0; k < baris; k++) {
                    for (int l = 0; l < kolom; l++) {
                        System.out.print("Masukkan nilai untuk kotak " + (i + 1) +
                                ", sisi " + (j + 1) + ", baris " + (k + 1) +
                                ", kolom " + (l + 1) + ": ");
                        Array4D[i][j][k][l] = yu.nextInt();
                    }
                }
            }
        }

        System.out.println("\nIsi Array 4D:");
        for (int i = 0; i < kotak; i++) {
            for (int j = 0; j < sisi; j++) {
                for (int k = 0; k < baris; k++) {
                    for (int l = 0; l < kolom; l++) {
                        System.out.print(Array4D[i][j][k][l] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
