import java.util.Arrays;

public class day59  {
    public static void main(String[] args) {
        int[][] angka = new int[3][3];
        
        printArrays2D(angka);
        
        //looping secara manual
        for(int i = 0; i < angka.length; i++){
            System.out.print("{");
            for(int j = 0; j < angka[i].length; j++){
                System.out.print(angka[i][j] + ",");
            }
            System.out.print("}\n");
        }
    }

    private static void printArrays2D(int[][] dataArray) {
        for(int k = 0; k < dataArray.length; k++)
            System.out.println(Arrays.toString(dataArray[k])); 
    }
}
