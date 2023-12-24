import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah layer = ");
        int layer = input.nextInt();

        System.out.print("Masukkan jumlah baris = ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom = ");
        int kolom = input.nextInt();

        int[][][] Array_3D = new int[layer][baris][kolom];
        
        System.out.println();
        System.out.println("\tMEMASUKKAN NILAI ARRAY_3D\t");
        int a = 0;
        while (a < layer) {
            int b = 0;
            while (b < baris) {
                int c = 0;
                while (c < kolom) {
                    System.out.print("Masukkan nilai untuk Array_3D[" + a + "][" + b + "][" + c + "] = ");
                    Array_3D[a][b][c] = input.nextInt();
                    c++;
                }
                b++;
            }
            a++;
        }

        System.out.println();
        System.out.println("\tMENAMPILKAN NILAI ARRAY_3D\t");
        a = 0;
        while (a < layer) {
            System.out.println("Layer ke-" + a + ":");
            int b = 0;
            while (b < baris) {
                int c = 0;
                while (c < kolom) {
                    System.out.print(Array_3D[a][b][c] + " ");
                    c++;
                }
                System.out.println();
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
