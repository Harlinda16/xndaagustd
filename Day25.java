
import java.util.Scanner;
public class Day25 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        int nilaiBenar = 10;
        
        System.out.print("Masukkan nilai tebakan anda : ");
        int nilaiTebakan = input.nextInt();
        System.out.println("Nilai tebakan anda adalah : " + nilaiTebakan );
        
        //Operasi logika
        boolean statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda : " + statusTebakan);
        
        
        
    }
}
