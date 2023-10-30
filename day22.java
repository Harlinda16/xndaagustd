import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // area perpustakaan
        System.out.print("pilih area pengambilan buku (A/B/C) : ");
        String areapengambilan = input.nextLine();
        
        System.out.print("masukkan jenis buku (Novel/Komik/Majalah) : ");
        String jenisbuku = input.nextLine();
        
        // Kondisi
        if(areapengambilan.equals("A") && jenisbuku.equals("Novel")) {
           System.out.println("Benar");
        } else if(areapengambilan.equals("B") && jenisbuku.equals("Komik")) {
           System.out.println("Benar");
        } else if(areapengambilan.equals("C") && jenisbuku.equals("Majalah")) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
    }
}