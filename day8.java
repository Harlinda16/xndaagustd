
public class day8 {
    


    public static void main(String[] args) {
       
       // program untuk konversi data
        
        int nilaiInt = 450; //32-bit
        System.out.println("nilai int = " + nilaiInt);
        
        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);
        
        // Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);
        
        // casting pembagian
        float x = 10;
        int y = 4;
        
        float z = x/y;
        
        System.out.printf("%f / %d = %f \n",x,y,z);
        
        

      
    }
}