import java.util.Arrays;

public class day65 {
    public static void main(String[] args) {
        
        int[][] angka = new int[2][2];
        System.out.println("===Nilai Array===");
        angka[0][0] = 12;
        angka[0][1] = 24;
        angka[1][0] = 32;
        angka[1][1] = 44;

        System.out.println(Arrays.deepToString(angka));
        
        int sum = 0;
        for (int a = 0; a < angka.length; a++) {
            for (int j = 0; j < angka[a].length; j++) {
                sum += angka[a][j];
            }
        }
        
        System.out.println("==============");
        System.out.println("Hasil penjumlahan :" + sum);
    }
}
