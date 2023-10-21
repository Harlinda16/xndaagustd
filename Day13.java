import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("harga pc gaming : ");
        int harga = Integer.parseInt(input.nextLine());

        System.out.print("masukkan penghasilan sambo dalam perbulan  : ");
        int penghasilan = Integer.parseInt(input.nextLine());

        System.out.print("masukkan maksimal uang yang dapat ditabung oleh sambo dalam/bulan : ");
        int tabungan = Integer.parseInt(input.nextLine());

        System.out.print("masukkan tagihan rumah/bulan : ");
        int tagihanrumah = Integer.parseInt(input.nextLine());

        System.out.print("masukkan biaya pengeluaran anak pertama dalam/bulan : ");
        int biayaanakpertama = Integer.parseInt(input.nextLine());

        System.out.print("masukkan biaya 2 anak lainnya dalam/perbulan : ");
        int biaya2anak = Integer.parseInt(input.nextLine());

        // hitung sisa uang untuk kebutuhan sehari-hari yang diberikan pada istrinya
        int sisauang = penghasilan - tagihanrumah - biayaanakpertama - (2 * biaya2anak);

        // hitung berapa tahun sambo menabung untuk bisa membeli pc gaming
        int tahundibutuhkan = harga / (tabungan * 12); // Assuming tabungan is in per month
        System.out.print("Sambo memerlukan sekitar " + tahundibutuhkan + " tahun atau lebih untuk bisa membeli pc gaming");

    }
}
