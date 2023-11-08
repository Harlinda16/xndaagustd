import java.util.Scanner;

public class day31  {
	public static void main(String[] args) {
	    
		           String[] perlengkapansekolah = {"buku","pulpen","pensil","penghapus"};
	    
	    for(String perlengkapan : perlengkapansekolah ) {
	        System.out.println(perlengkapan);
	    }
	    
	    //variabel angka dan loop while
	        int angka = 0;
	    
	    Scanner input = new Scanner(System.in);
	          
	        while (true) {
	        System.out.print("Masukkan perlengkapan (lanjut / tidak) : ");
	        
	        String x = input.nextLine();
	        
	        if (x.equals("tidak")) {
	            System.out.println("Angka terakhir : " + angka);
	            break;
	        }else if (x.equals("lanjut")){
	            angka +=1;
	          System.out.println("Angka ditambah 1 : " + angka);
	        
	        }else{
	            System.out.println("Aksi tidak ada");
	          }
	       }
	    
	    
	    }
  	}
