import java.util.Scanner;
public class day45  {
    
    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda : ");
        String nama = yu.nextLine();
        
        
        System.out.println("===================");
        
        String menusatu = "Nasi Goreng";
        System.out.println("1." + menusatu);
        
        String menudua = "Bakso Bakar";
        System.out.println("2." + menudua);
        
        String menutiga = "Somay Goreng";
        System.out.println("3." + menutiga);
        
        String menuempat = "Es teh";
        System.out.println("4." + menuempat);
        
        System.out.println("=====================");
        
        System.out.print("Masukkan pesanan anda : ");
        int pesanan = yu.nextInt();
        
        if( pesanan == 1 ) {
            System.out.println("Pesanan anda adalah : " + menusatu);
            System.out.println("10.000");
            
        }else if( pesanan == 2 ) {
            System.out.println("Pesanan anda adalah : " + menudua);
            System.out.println("10.000");
        
        }else if( pesanan == 3 ) {
            System.out.println("Pesanan anda adalah : " + menudua);
            System.out.println("7.000");
        
        }else if( pesanan == 4 ) {
            System.out.println("Pesanan anda adalah : " + menuempat);
            System.out.println("5.000");
        
       }else{
           System.out.println(" Kondisi yang anda masukkan salah ");
           
       }
        
        
        System.out.println("Nama : " + nama);
     }
  }
