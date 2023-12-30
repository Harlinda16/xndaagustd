public class day86  {
    public static void main(String[] args) {
       
        double[][][] nilaiMahasiswa = {
            {
                {75, 80}, {60, 45}, {85, 90}, {50, 65}, {90, 30}
            },
            {
                {70, 55}, {80, 75}, {40, 85}, {55, 60}, {65, 70}
            }
        };


        int[][] jumlahLulusTidakLulus = new int[2][2]; 

        
        for (int mataKuliah = 0; mataKuliah < nilaiMahasiswa.length; mataKuliah++) {
            for (int mahasiswa = 0; mahasiswa < nilaiMahasiswa[mataKuliah].length; mahasiswa++) {
                boolean lulusMatkul1 = nilaiMahasiswa[mataKuliah][mahasiswa][0] >= 60;
                boolean lulusMatkul2 = nilaiMahasiswa[mataKuliah][mahasiswa][1] >= 60;

                if (lulusMatkul1) {
                    jumlahLulusTidakLulus[mataKuliah][0]++;
                } else {
                    jumlahLulusTidakLulus[mataKuliah][1]++;
                }

                if (lulusMatkul2) {
                    jumlahLulusTidakLulus[mataKuliah][0]++;
                } else {
                    jumlahLulusTidakLulus[mataKuliah][1]++;
                }
            }
        }
        
        System.out.println("Jumlah mahasiswa yang lulus dan tidak lulus di setiap mata kuliah:");
        for (int mataKuliah = 0; mataKuliah < jumlahLulusTidakLulus.length; mataKuliah++) {
            System.out.println("Mata Kuliah " + (mataKuliah + 1) + ":");
            System.out.println("Lulus: " + jumlahLulusTidakLulus[mataKuliah][0]);
            System.out.println("Tidak Lulus: " + jumlahLulusTidakLulus[mataKuliah][1]);
            System.out.println();
        }
    }
}
