
import java.util.Arrays;
public class day58  {
    public static void main(String[] args) {
        int[][] angka = new int[3][3];
        
        angka[0][0] = 24;
        angka[0][1] = 31;
        angka[0][2] = 68;
        angka[1][0] = 55;
        angka[1][1] = 83;
        angka[1][2] = 99;
        angka[2][0] = 45;
        angka[2][1] = 77;
        angka[2][2] = 23;
        
        System.out.println(Arrays.deepToString(angka));
    }
}
