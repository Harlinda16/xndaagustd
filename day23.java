import java.util.Scanner;

public class day23  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama pekerja : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan penghasilan pekerja dalam /bulan : ");
        double penghasilan = input.nextDouble();
        
        System.out.print("Masukkan pekerjaan : ");
        String pekerjaan = input.next();
        
        double pajak = 0;
        double bantuan = 0;
        
        if (penghasilan > 3000000) {
            pajak = penghasilan*0.05;
            
        } else  if (penghasilan > 10000000){
            pajak = penghasilan * 0.15;
           }
        
        
        if (pekerjaan.equalsIgnoreCase ("petani")){
            bantuan = 1000000;
        } else if(pekerjaan.equalsIgnoreCase("PNS")) {
            bantuan = 0;
        } else {
            bantuan = 200000;
        }
        double gajibersih = penghasilan - pajak + bantuan;
        System.out.println("Gaji bersih : " + gajibersih);
        
    } 
}