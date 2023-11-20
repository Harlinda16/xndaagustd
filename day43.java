import java.util.Scanner;

public class day43  {
	public static void main(String[] args) {
	    
	     Scanner input = new Scanner(System.in);
	    
	    System.out.print("Angka Awal : ");
	    int awal = input.nextInt();
	    
	    System.out.print("Angka Akhir : ");
	    int akhir = input.nextInt();
	    
	    if(akhir > awal ){
	        System.out.print("Salah bang!");
	        
	    }else {
	        int a = awal;
	        while (a >= akhir ) {
	        System.out.print(a + " ");
	        
	        a--;
	        }
	      }
	    }
  }
	    
