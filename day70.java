import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n======= Data Mahasiswa ======\n");
        
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();


        String[][] data = new String[jumlahData][3];


        for (int i = 0; i < jumlahData; i++) {
            
            System.out.println(); 
            System.out.println("============");
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            data[i][0] = input.next();
            System.out.print("Masukkan NIM: ");
            data[i][1] = input.next();
            System.out.print("Masukkan nilai: ");
            data[i][2] = input.next();
        }

        // Menampilkan hasil
        System.out.println("\n ===========Mencetak Data===========\n");
        System.out.println("Nama\t\tNIM\t\tNilai");
          for (int i = 0; i < jumlahData; i++) {
           System.out.println(String.format("%-15s %-15s %-5s", data[i][0], data[i][1], data[i][2]));
         }
       }
    }






