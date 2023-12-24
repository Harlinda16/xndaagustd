import java.util.Arrays;

public class day81 {
    public static void main(String[] args) {
        int data[][][] = new int[3][3][3];


        int value = 1; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    data[i][j][k] = value;
                    value += 2;                }
            }
        }


        System.out.println("Isi array tiga dimensi:");
        System.out.println(Arrays.deepToString(data));

        
        System.out.println("\nNilai Genap:");
        for (int[][] i : data) {
            for (int[] j : i) {
                for (int val : j) {
                    if (val % 2 == 0) {
                        System.out.print(val + " ");
                    }
                }
            }
        }

        System.out.println("\nNilai Ganjil:");
        for (int[][] i : data) {
            for (int[] j : i) {
                for (int val : j) {
                    if (val % 2 != 0) {
                        System.out.print(val + " ");
                    }
                }
            }
        }
    }
}
