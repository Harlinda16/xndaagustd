import java.util.Scanner;
public class day42 {
     
    public static void main(String[] args) {
        
        Scanner yu = new Scanner(System.in);
        
        int awal,akhir;
        
        System.out.println("===Range Angka===");
        System.out.print("Awal  : ");
        awal = yu.nextInt();
        System.out.print("Akhir : ");
        akhir = yu.nextInt();
        
        
        for(int a = awal; a <= akhir; a++){
            System.out.print(a + " ");
            
        }
        
        System.out.println("");
        
    }
 }