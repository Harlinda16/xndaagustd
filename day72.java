import java.util.Arrays;

public class day72   {
    public static void main(String[] args) {
       int[][] matrix_a = {
           {1,2,3},
           {4,5,6},
           {7,8,9},
       };
        
        int[][] matrix_b = {
            {11,12,13},
            {14,15,16},
            {17,18,19},
        };
        printArray(matrix_a);
        printArray(matrix_b);
        
        int[][] hasilTambah = tambah(matrix_a, matrix_b);     
        
        printArray(hasilTambah);
    }
    
    private static int[][] tambah(int[][] matrix_1, int[][] matrix_2){
        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;
        
        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length; 
        
        int[][] hasil = new int[baris_a][kolom_a];
        
        if(baris_a == baris_b && kolom_a == kolom_b){
            for (int i = 0; i < baris_a; i++){
                for (int j = 0; j < kolom_a; j++){
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }  
              }
           }else {
               System.out.println("jumlah baris dan kolom tidak sesuai");
           }
          return hasil;
    }       
     
    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        
        for (int i = 0; i < baris; i++){
            System.out.print("{");
            for (int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j]);
                
                if (j < (kolom - 1)){
                    System.out.print(",");
                }else {
                    System.out.print("}");
                }
            }
            
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
