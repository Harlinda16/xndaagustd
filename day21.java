import java.util.Scanner;

public class day21  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai panjang : ");
        double panjang = input.nextDouble();
        
        System.out.print("masukkan nilai lebar : ");
        double lebar = input.nextDouble();
        
        
        double luas = panjang * lebar;
        System.out.print("luas persegi panjang adalah : " + luas );
        
        
    }
}
        