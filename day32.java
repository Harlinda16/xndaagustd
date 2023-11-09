import java.util.Scanner;

public class day32  {
	public static void main(String[] args) {
	    
	          Scanner input = new Scanner(System.in);
	    
	    while(true){
	        System.out.print("__Silakan login ke akun anda__");
	        String login = input.nextLine();
	        
	        System.out.print("Masukkan username anda : ");
	        String username = input.nextLine();
	    
	        System.out.print("Masukkan password anda : ");
	        String password = input.nextLine();
	    
	    
	    if(username.equals("Harlinda") && password.equals("Xndaagustd16")){
	        System.out.print(username+  " Anda telah berhasil login " + "\n" );
	        System.out.print("Anda ingin keluar?" + "\n");
	        System.out.println("Silakan pilih menu exit yang berada di pojok kiri atas.");
	        break;
	        
	    }else{
	        System.out.println("Username dan password anda salah!");
	        
	    }
	        
	    }
	    
	    }
  	}
