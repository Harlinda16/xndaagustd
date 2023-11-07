import java.util.Scanner;

public class day30  {
	public static void main(String[] args) {
		
		          Scanner input = new Scanner(System.in);
		
          		System.out.println("__Deret angka kelipatan Lima__");
		
	          System.out.print("Masukkan nilai awal : ");
	            	long nilai = input.nextLong();
	           	System.out.print("Masukkan nilai akhir : ");
		           long nilai2 = input.nextLong();
		
		           System.out.print("deret nilai kelipatan lima adalah = ");
		
	           	for (long x = nilai; x <= nilai2; x+=5 ) {
			
	           	    System.out.print(x+", ");
	           	}
  	}
}