public class Day97 {
    public static void main(String[] args) {
        int[][][][] data = new int[2][2][2][2];
        
        int nilai = 1;
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
        for (int l = 0; l < 2; l++) {
            data[i][j][k][l] = nilai;
            nilai++;
           }
         }
       }
     }
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
        for (int l = 0; l < 2; l++) {
        System.out.println("data[" + i + "][" + j + "][" + k + "][" + l + "] = " + data[i][j][k][l]);
            }
           }
          }
        }
      }
     }
