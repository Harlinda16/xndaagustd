import java.util.Arrays;

public class day82  {
    public static void main(String[] args) {
        
        int data[][][] = new int[2][2][2];

        data[0][0][0] = 24;
        data[0][1][0] = 31;
        data[0][0][1] = 68;
        data[1][0][0] = 55;
        data[1][1][0] = 83;
        data[1][1][1] = 99;

        System.out.println("Isi array tiga dimensi:");
        System.out.println(Arrays.deepToString(data));
    }
}
