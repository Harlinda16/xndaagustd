import java.util.Arrays;
public class Day87 {
    public static void main(String[] args) {
        double[][][] nilaiMahasiswa = {
            
            {{75, 80}, {60, 45}, {85, 90}, {50, 65}, {90, 30}},
            {{70, 55}, {80, 75}, {40, 85}, {55, 60}, {65, 70}}
        };

        double[][] nilaiGabungan = new double[10][3];

        int index = 0;
        for (double[][] mataKuliah : nilaiMahasiswa) {
            for (double[] nilai : mataKuliah) {
                nilaiGabungan[index][0] = nilai[0];
                nilaiGabungan[index][1] = nilai[1];
                nilaiGabungan[index][2] = (nilai[0] + nilai[1]) / 2.0;
                index++;
            }
        }
        
        System.out.println("Nilai Mahasiswa setelah Diurutkan dari Tertinggi ke Terendah berdasarkan Rata-rata Nilai:");
        for (double[] nilai : nilaiGabungan) {
            System.out.println("\tNilai Mata Kuliah 1: \t" + nilai[0] + ", \tNilai Mata Kuliah 2: \t" + nilai[1] + ", \tRata-rata: \t" + nilai[2]);
        }
    }
}
