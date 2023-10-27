import java.util.Scanner;
public class day19  {

    public static void main(String[] args) {
        // menggunakan pengelompokan operasi dengan ()
        
        System.out.println("__PENGELOMPOKAN OPERASI ARITMATIKA__");
        int hasil = 60 / (2 + 10);
        System.out.println(hasil);
        hasil = 5 + 20 / 4 - (2 + 6) * 5;
        System.out.println(hasil);
        hasil = 20 / (2 * 5) - 2 * 5;
        System.out.println(hasil);
        
        // perhitungan persamaan kuadrat
        Scanner input = new Scanner(System.in);
        System.out.println("__MENGHITUNG PERSAMAAN KUADRAT__");
        int m,x,c;
        
        System.out.print("nilai x = ");
        x = input.nextInt();
        System.out.print("gradient m = ");
        m = input.nextInt();
        System.out.print("bias c = ");
        c = input.nextInt();
        int y = (m * x * x) + c;
        
        System.out.println("nilai y = " + y);
 }
}