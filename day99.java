import java.util.Scanner;

public class day99  {
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
                        Array4D[i][j][k][l] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < kotak; i++) {
            System.out.println("Kotak : " + i);
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
