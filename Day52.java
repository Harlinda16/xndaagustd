import java.util.Arrays;
public class Day52 {
    public static void main(String[] args) {
        String[] nilai = {"Ferdy", "Alby", "Rina", "Robis", "Fandy"};
        
        for(int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]+ ",");
        }
        
        System.out.println("");
        
        for(String i : nilai) {
            System.out.println(Arrays.toString(nilai));
        }
    }
}
