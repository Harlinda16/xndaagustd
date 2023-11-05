import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Angka : ");
        int angka = input.nextInt();
        
        angka %= 2;
        
        if (angka == 1) {
            System.out.println("Angka Ganjil");
        }else{
            System.out.println("Angka genap");
        }
    }     
    
}