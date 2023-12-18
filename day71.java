import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {

        Scanner yu = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String Nama = yu.nextLine();

        System.out.print("Nomor Hp : ");
        long Nomorhp = yu.nextLong();

        String alamatsatu = "bandung";
        System.out.println("1." + alamatsatu);

        String alamatdua = "jakarta";
        System.out.println("2." + alamatdua);

        String alamattiga = "semarang";
        System.out.println("3." + alamattiga);

        System.out.print("Pilih 1/2/3 : ");
        int alamat = yu.nextInt();
        
        double hargaPerKg = 0;
        String namaAlamat = "";

        if (alamat == 1) {
            System.out.println(alamatsatu);
            namaAlamat = alamatsatu;
            hargaPerKg = 10000;
        } else if (alamat == 2) {
            System.out.println(alamatdua);
            namaAlamat = alamatdua;
            hargaPerKg = 20000;
        } else if (alamat == 3) {
            System.out.println(alamattiga);
            namaAlamat = alamattiga;
            hargaPerKg = 30000;
        } else {
            System.out.println("Pilihan tidak valid");
            namaAlamat = "Tidak valid";
        }

        String Jenissatu = "REGULER";
        System.out.println("1." + Jenissatu);

        String Jenisdua = "EKSPRES";
        System.out.println("2." + Jenisdua);

        System.out.print("Pilih 1/2 : ");
        int JenisPengiriman = yu.nextInt();
        double harga = 0;
        String jenisPengiriman = "";

        if (JenisPengiriman == 1) {
            System.out.println(Jenissatu);
            jenisPengiriman = Jenissatu;
            harga = hargaPerKg;
        } else if (JenisPengiriman == 2) {
            System.out.println(Jenisdua);
            jenisPengiriman = Jenisdua;
            harga = hargaPerKg * 1.2;
        } else {
            System.out.println("Pilihan tidak valid");
            jenisPengiriman = "Tidak valid";
        }

        System.out.print("Berat barang (kg) : ");
        double berat = yu.nextDouble();

        double totalBiaya = harga * berat;
        double biayaAsuransi = 0;
        double totalBiayaAsuransi = 0;

        System.out.println("Total biaya pengiriman: Rp." + totalBiaya);

        System.out.println("Apakah Anda ingin mengasuransikan pengiriman? (ya/tidak)");
        yu.nextLine();
        String asuransi = yu.nextLine();

        if (asuransi.equalsIgnoreCase("ya")) {
            biayaAsuransi = totalBiaya * 0.07;
            totalBiayaAsuransi = totalBiaya + biayaAsuransi;
            System.out.println("Biaya asuransi: Rp." + biayaAsuransi);
            System.out.println("Total biaya pengiriman termasuk asuransi: Rp." + totalBiayaAsuransi);
        }

        System.out.println("\n========OUTPUT========\n");
        System.out.println("Nama pengirim : " + Nama);
        System.out.println("No Telepon : " + Nomorhp);
        System.out.println("Tujuan pengiriman : " + namaAlamat);
        System.out.println("Jenis pengiriman : " + jenisPengiriman);
        System.out.println("Berat Barang : " + berat);
        System.out.println("Asuransi : " + asuransi);

        System.out.println();
        System.out.println("Bayar : " + totalBiaya);
        System.out.println("Biaya Asuransi  : " + biayaAsuransi);
        System.out.println("Total Biaya : " + totalBiayaAsuransi);
    }
}
