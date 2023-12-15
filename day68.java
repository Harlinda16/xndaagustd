import java.util.Arrays;

public class day68  {
    public static void main(String[] args) {
        
        int[][] data = new int[3][3];
        
        System.out.println("========Nilai Array========");
        
        data[0][0] = 24;
        data[0][1] = 31;
        data[0][2] = 68;
        data[1][0] = 55;
        data[1][1] = 83;
        data[1][2] = 99;
        data[2][0] = 45;
        data[2][1] = 77;
        data[2][2] = 23;
        
        System.out.println(Arrays.deepToString(data));
        System.out.println("\n============");
        
        for (int a = 0; a < data.length; a++) {
            for (int j = 0; j < data[a].length; j++) {
                int angka = data[a][j];
                System.out.print(angka + " ");
                
                if(angka < 70){
                    System.out.println("Tidak Lulus ");
                } else {
                    System.out.println("Lulus ");
                }
            }
            System.out.println(); 
        }
    }
}
