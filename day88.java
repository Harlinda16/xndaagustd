public class day88  {
    public static void main(String[] args) {
       
        int X = 3;
        int Y = 3;
        int Z = 3;

        
        int[][][] array3D = new int[X][Y][Z];

        
        int value = 1;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                for (int k = 0; k < Z; k++) {
                    array3D[i][j][k] = value;
                    value++;
                }
            }
        }


        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                for (int k = 0; k < Z; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
