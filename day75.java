import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah layer = ");    
        int layer = input.nextInt();
        
        System.out.print("Masukkan jumlah baris = ");
        int baris = input.nextInt();
        
        System.out.print("Masukkan jumlah kolom = ");
        int kolom = input.nextInt();
        
        
        int[][][] Array_3D = new int[layer][baris][kolom];           
        
        for(int i = 0; i < layer; i++){
           System.out.println("=================");
           System.out.println("layer ke-" + i);
        
        for(int j = 0; j < baris; j++){
        for(int x = 0; x < kolom; x++){
        
        System.out.println(Array_3D[i][j][x] +" ");
            
        
            }
            System.out.println();
          }
        }
    }
}
