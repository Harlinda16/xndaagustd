

public class day85 {
    public static void main(String[] args) {
        int[][][] matrix = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        System.out.println("Matriks:");

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Matriks " + (i + 1) + ":");
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
