import java.util.Scanner;

 public class day11 {
     
    public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in); 
        
        // input data daŕi pengguna
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan gaji: ");
        double gaji = input.nextDouble();
        
        String peker1 = "PNS";
        String pejer2 = "buruh";
        
        System.out.print("Masukkan pekerjaan (PNS/buruh): ");
        String pekerjaan = input.nextLine();
        
           
    // Hitung gaji bersih berdasarkan kondisi pekerjaan

        if  (pekerjaan == "pns") {
          System.out.println("Pekerjaan anda adalah PNS dengan gaji : "+ gaji + " dengan pajak 10%");
              double  pajak = 0.1;
              double gajiBersih = gaji - (pajak * gaji);
            
            // Tampilkan hasil
        System.out.println("\n=== Hasil Perhitungan Gaji ===");
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Gaji Bersih: " + gajiBersih);
      }  
        
        else if (pekerjaan == "buruh") {
        System.out.println("pekerjaan anda adalah buruh dengan gaji : " + gaji + " dengan pajak 10% dan tunjangan 5%");
             double tunjangan =0.05;
             double gajiBersih = gaji + (tunjangan * gaji);
        
        // Tampilkan hasil
        System.out.println("\n=== Hasil Perhitungan Gaji ===");
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Gaji Bersih: " + gajiBersih);
         
        }else {
            double pajak = 0.05; //pajak 5% untuk pekerjaan lain
            double gajiBersih = gaji - (pajak * gaji);
            
          // Tampilkan hasil
        System.out.println("\n=== Hasil Perhitungan Gaji ===");
        System.out.println("Nama: " + nama);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("Gaji Bersih: " + gajiBersih);
        }
        
        
    

    }
 }