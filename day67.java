import java.util.Arrays;

public class day67  {
    public static void main(String[] args) {
        
        int[][] data = new int[3][3];
        
        System.out.println("========Nilai Array========");
        
        data[0][0] = 24;
        data[0][1] = 31;
        data[0][2] = 68;
        data[1][0] = 55;
        data[1][1] = 83;
        data[1][2] = 99;
        data[2][0] = 45;
        data[2][1] = 77;
        data[2][2] = 23;
        
        System.out.print(Arrays.deepToString(data));
        System.out.println("\n");
        System.out.println("============");

        
        int nilaiTerendah = data[0][0];
        int nilaiTertinggi = data[0][0];
        
        for (int a = 0; a < data.length; a++) {
            for (int j = 0; j < data[a].length; j++) {
                
                if(data[a][j] < nilaiTerendah){
                    nilaiTerendah = data[a][j];
                }
                
                if(data[a][j] > nilaiTertinggi){
                    nilaiTertinggi = data[a][j];
                }
            }
        }
        
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
    }
}
