import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama anda : ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai anda : ");
        int nilai = input.nextInt();

        if (nilai >= 0 && nilai <= 45) {
            System.out.print("D");
        } else if (nilai >= 46 && nilai <= 50) {
            System.out.print("D+");
        } else if (nilai >= 51 && nilai <= 60) {
            System.out.print("C");
        } else if (nilai >= 61 && nilai <= 65) {
            System.out.print("C+");
        } else if (nilai >= 66 && nilai <= 75) {
            System.out.print("B");
        } else if (nilai >= 76 && nilai <= 80) {
            System.out.print("B+");
        } else if (nilai >= 81 && nilai <= 85) {
            System.out.print("A-");
        } else if (nilai >= 86 && nilai <= 100) {
            System.out.print("A");
        } else {
            System.out.println("Kondisi yang anda masukkan salah");
        }
    }
}
