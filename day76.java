import java.util.Scanner;

public class day76  {
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
            for(int j = 0; j < baris; j++){
                for(int x = 0; x < kolom; x++){
                    System.out.println();
                    System.out.print("Masukkan nilai untuk Array_3D[" + i + "][" + j + "][" + x + "] = ");
                    Array_3D[i][j][x] = input.nextInt();
                }
            }
        }
        System.out.println();
        System.out.println("====MENAMPILKAN NILAI ARRAY_3D====");
        for(int i = 0; i < layer; i++){
            System.out.println();
            System.out.println("=================");
            System.out.println("layer ke-" + i);
        
            for(int j = 0; j < baris; j++){
                for(int x = 0; x < kolom; x++){
                    System.out.print(Array_3D[i][j][x] + " ");
                    
                    
                }
                System.out.println();
            }
        }
    }
}
