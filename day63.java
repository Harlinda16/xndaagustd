import java.util.Arrays;
import java.util.Scanner;
public class day63  {
    public static void main(String[] args) {
        
        Scanner yu = new Scanner(System.in);
        
        
        System.out.print("Masukan jumlah baris  : ");
        int baris = yu.nextInt();
        System.out.print("Masukan jumlah kolom  : ");
        int kolom = yu.nextInt();
        
        int [][] angka = new int [baris][kolom];
        
        System.out.println("=================");
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                
                System.out.print("Input elemen angka : ");
                angka[i][j] = yu.nextInt();
                
              }
            System.out.println("=================");
            
        }
            
        System.out.print("{");
        
        int a = 0;
        while(a < angka.length) {
            int b = 0;
            while(b < angka[a].length){
                System.out.print(angka[a][b] +",");
                   b++;
                    
                
            }
            a++;
            
        }
        System.out.print("}");
    }

}

