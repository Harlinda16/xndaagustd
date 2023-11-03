import java.util.Scanner;

public class day26  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama Jasmin/Nana/Clara : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan pekerjaan (Guru/Dokter/URT) : ");
        String pekerjaan  = input.nextLine();
        
        System.out.print("Masukkan status (Janda/Sudah Menikah/Belum Menikah) : ");
        String status = input.nextLine();
        
        
        if(nama.equals("jasmin") && pekerjaan.equals("Guru") && status.equals("janda")) {
           System.out.println("Benar");
            
        }else if(nama.equals("Nana") && pekerjaan.equals("Dokter") && status.equals("Sudah menikah")) {
            System.out.println("Benar");
        
        }else if(nama.equals("Clara") && pekerjaan.equals("URT") && status.equals("Belum nikah")) {
            System.out.println("Benar");
        
        }else{
            System.out.println("Salah");
        }
    }     
}
