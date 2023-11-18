import java.util.Scanner;

public class day35  {
	public static void main(String[] args) {
	    
	     Scanner input = new Scanner(System.in);
	    
	     System.out.print("Masukkan nilai Awal : ");
	     int nilaiawal = input.nextInt();
	    
	     System.out.print("Masukkan nilai Akhir : ");
	     int nilaiakhir = input.nextInt();
	    
	    for(int x = nilaiawal; x <= nilaiakhir; x++) {
	        
	        if(x %2 == 0){
	            System.out.println(x + " Angka genap");
	        } else {
	            System.out.println( x + " angka ganjil");{
	                
	            }
	    }
	    
	     
	    }
	    
	}
}
	    