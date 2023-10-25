import java.util.Scanner;
public class day17  {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        
        //menghitung luas dan keliling persegi
        
        int s, L, K;
        System.out.print("masukkan s = ");
        s = input.nextInt();
        
        L = s * s;
        K = 4 * s;
        
        //Narasi luas persegi
        System.out.println("L = s × s");
        System.out.println("L = "+s+" × " +s);
        System.out.println("L = "+ L + " cm²\n");
        
        //Narasi Keliling persegi
        System.out.println("K = 4 × s");
        System.out.println("K = 4" + " × "+s);
        System.out.println("K = "+ K + " cm\n");
    }
}