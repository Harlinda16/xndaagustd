public class day94  {
    public static void main(String[] args) {
        
        int sisi = 2;
        int lapisan = 3;
        int baris = 4;
        int kolom = 5;

        
        int[][][][] Array4D = new int[sisi][lapisan][baris][kolom];

       for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < lapisan; j++) {
                for (int k = 0; k < baris; k++) {
                    for (int l = 0; l < kolom; l++) {
                        Array4D[i][j][k][l] = i + j + k + l;
                        System.out.print(Array4D[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
