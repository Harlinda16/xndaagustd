import java.util.Arrays;
import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);

        System.out.print("Masukan jumlah baris  : ");
        int baris = yu.nextInt();
        System.out.print("Masukan jumlah kolom  : ");
        int kolom = yu.nextInt();

        String[][] nama = new String[baris][kolom];

        System.out.println("=================");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Input elemen nama : ");
                nama[i][j] = yu.next();
            }
            System.out.println("=================");
        }

        System.out.print("{");
        System.out.print(Arrays.deepToString(nama));
        System.out.print("}");
    }
}










