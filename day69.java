import java.util.Arrays;
import java.util.Scanner;

public class day69  {
    public static void main(String[] args) {
        
        Scanner yu = new Scanner(System.in);

        System.out.print("Masukan jumlah baris  : ");
        int baris = yu.nextInt();
        System.out.print("Masukan jumlah kolom  : ");
        int kolom = yu.nextInt();

        int[][] data = new int[baris][kolom];

        System.out.println("============");
        
        for (int a = 0; a < baris; a++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Input nilai Array : ");
                data[a][j] = yu.nextInt();
                
                System.out.print(data[a][j] + " ");
                
                if(data[a][j] % 2 == 0){
                    System.out.println("Genap ");
                } else {
                    System.out.println("Ganjil ");
                }
            }
            System.out.println(); 
        }
    }
}
