import java.util.Scanner;

public class day41  {
	public static void main(String[] args) {
	    
	     Scanner input = new Scanner(System.in);
	    
	     System.out.print("Masukkan Angka : ");
	     int angka = input.nextInt();
	    
	    if(angka %2 == 0){
	        
	        for(int a = 2; a < angka; a += 2) {
	            System.out.println(a + 1 + " angka ganjil ");
	        }
	        
	        } else if(angka %2 != 0){
	        
	        for(int a = 1; a < angka; a += 2) {
	            System.out.println(a + 1 + " angka genap ");
	     }
   	}
	 }
}
	    