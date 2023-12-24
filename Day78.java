import java.util.Arrays;

public class Day78   {
    public static void main(String[] args) {                 
        
        int[][][] Array_3D = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}, },
            
            {
                {0, 3, 7},
                {5, 7, 10},
                {11, -23, 20}, },
            
            {
                {12, 17, 18},
                {3, 2, 9},
                {10, 600, 8}, },
            
        };
        
        System.out.print(Arrays.deepToString(Array_3D));
        System.out.println("\n");
        System.out.println("============");

        
        int nilaiTerendah = Array_3D[0][0][0];
        int nilaiTertinggi = Array_3D[0][0][0];
        
        for (int a = 0; a < Array_3D.length; a++) {
            for (int j = 0; j < Array_3D[a].length; j++) {
                for(int x = 0; x < Array_3D[a][j].length; x++) {
                    
                
                
                if(Array_3D[a][j][x] < nilaiTerendah){
                    nilaiTerendah = Array_3D[a][j][x];
                }
                
                if(Array_3D[a][j][x] > nilaiTertinggi){
                    nilaiTertinggi = Array_3D[a][j][x];
                    }
                }
            }
                
        }
        
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
    }
}