import java.util.Arrays;

public class day74  {
    public static void main(String[] args) {                 
        
        int[][][] Array_3D = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}, },
            
            {
                {0, 3, 7},
                {5, 7, 10},
                {11, 23, 20}, },
            
            {
                {12, 17, 18},
                {3, 2, 9},
                {10, 6, 8}, },
            
        };
        
        System.out.println(Arrays.deepToString(Array_3D));
        
        for(int layer = 0; layer < Array_3D.length; layer++){
            System.out.println();
            System.out.println("=====================");
            System.out.println("Layer ke-" + layer);
            
            for(int baris = 0; baris < Array_3D[layer].length; baris++) {   
            for(int kolom = 0; kolom < Array_3D[layer][baris].length; kolom++){        
                System.out.print(Array_3D[layer][baris][kolom] + " ");
                
                }
                
                System.out.println();
                
                
            }
        }
    }
}    
       