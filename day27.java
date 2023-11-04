import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama (Harlinda/Sahamia) : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nim (D0223345/H0223324) : ");
        String Nim = input.nextLine();
        
        System.out.print("Masukkan pengumuman kip-k (Lulus/penetapan sementara) : ");
        String pengumuman = input.nextLine();
        
        if (nama.equals("Harlinda") && Nim.equals("D0223345") && pengumuman.equalsIgnoreCase("penetapan sementara")) {
            System.out.println("Penetapan anda sebagai penerima kip-k belum pasti, sewaktu-waktu bisa berubah.");
            
        } else if (nama.equals("Sahamia") && Nim.equals("H0223324") && pengumuman.equalsIgnoreCase("lulus")) {
            System.out.println("Selamat anda dinyatakan penerima kip-k, tunggu informasi lanjut dari kampus masing-masing.");
        
        } else {
            System.out.println("Data yang Anda masukkan tidak sesuai dengan kondisi yang ada.");
        }
    }     
}