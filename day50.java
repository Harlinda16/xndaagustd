import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();

        int[] angka = new int[panjangArray];

        System.out.println("Masukkan nilai-nilai ke dalam array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Nilai index ke-" + i + ": ");
            angka[i] = scanner.nextInt();
        }

        System.out.println("Isi array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Nilai index ke-" + i + " adalah " + angka[i]);
        }

        scanner.close();
    }
}
