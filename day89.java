public class day89   {
    public static void main(String[] args) {
        int X = 3;
        int Y = 3;
        int Z = 3;

        int[][][] array3D = new int[X][Y][Z];

        int B = 1;
        System.out.println("Nilai awal array:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                for (int k = 0; k < Z; k++) {
                    array3D[i][j][k] = B;
                    System.out.print(array3D[i][j][k] + " ");
                    B++;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("\nNilai setelah dikurangi:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                for (int k = 0; k < Z; k++) {
                    array3D[i][j][k] -= 1; 
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
