import java.util.Scanner;
public class day53 {
    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = yu.nextInt();
        
        int[] a = new int[jumlah];
        for(int i = 0; i < jumlah; i++) {
            System.out.print("input nilai : ");
            a[i] = yu.nextInt();
        }
        
        for(int i = 0; i < jumlah; i++){
            System.out.print("("+ a[i]+ " "+")");
        }
    }
}
