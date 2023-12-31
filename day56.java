import java.util.Arrays;

public class day56 {

    public static void main(String[] args) {
        
        int[] arrayAngka1 = {1, 2, 3, 4, 5};
        
        // Merubah Array menjadi String
        System.out.println("\nMerubah Array menjadi string\n============");
        printArray(arrayAngka1);
        
        // Mengkopi Array
        System.out.println("\nmengkopi Array\n============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        System.out.println("\nMengkopi dengan looping\n============");
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1); 
        printArray(arrayAngka2); 
    }
    
    private static void printArray(int[] dataArray){ // Memperbaiki penulisan static
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}
