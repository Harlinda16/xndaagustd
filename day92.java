import java.util.Scanner;

public class day92   {
    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);
        int a, b, c;

        System.out.print("MASUKAN NILAI LAPISAN = ");
        a = yu.nextInt();

        System.out.print("MASUKAN NILAI BARIS = ");
        b = yu.nextInt();

        System.out.print("MASUKAN NILAI KOLOM = ");
        c = yu.nextInt();

        System.out.println();
        System.out.println("=======HASIL CETAK=======");

        int[][][] Array3D = new int[a][b][c];

        for (int i = 0; i < Array3D.length; i++) {
            int angka = 1;
            System.out.println("Lapisan ke- " + (i + 1));
            for (int j = 0; j < Array3D[i].length; j++) {
                for (int k = 0; k < Array3D[i][j].length; k++) {
                    Array3D[i][j][k] = angka++;

                    System.out.print((Array3D[i][j][k]) + "\t");

                }
                System.out.println("");
            }

        }

        System.out.println("");
        System.out.println("======PROGRAM SELESAI======");

    }
}
