import java.util.Arrays;
public class day62   {
    public static void main(String[] args) {
        
        
        System.out.println("Mencetak isi Array menggunakan dengan for-each");
        
        int [][] data = new int [2][2];
        
        data[0][0] = 12;
        data[0][1] = 14;
        data[1][0] = 16;
        data[1][1] = 18;
        
        System.out.println("=================");
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                
              }
            
           }
        
        for (int[] angka : data){
            for(int elemen : angka){
                System.out.println(elemen+" ");
            }
        }
        System.out.println("");
        System.out.println("=================");
        
    }
    

}

