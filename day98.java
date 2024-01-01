public class day98  {
    public static void main(String[] args) {
        
        int jumlahKelas = 2;
        int jumlahMapel = 3;
        int jumlahUjian = 2;
        int jumlahSiswa = 4;

        int[][][][] nilaiSiswa = new int[jumlahKelas][jumlahMapel][jumlahUjian][jumlahSiswa];

        for (int kelas = 0; kelas < jumlahKelas; kelas++) {
            for (int mapel = 0; mapel < jumlahMapel; mapel++) {
                for (int ujian = 0; ujian < jumlahUjian; ujian++) {
                    for (int siswa = 0; siswa < jumlahSiswa; siswa++) {
                        
                        nilaiSiswa[kelas][mapel][ujian][siswa] = (int) (Math.random() * 101);
                    }
                }
            }
        }

        
        for (int kelas = 0; kelas < jumlahKelas; kelas++) {
            System.out.println("Kelas " + (kelas + 1) + ":");
            for (int mapel = 0; mapel < jumlahMapel; mapel++) {
                System.out.println("  Mata Pelajaran " + (mapel + 1) + ":");
                for (int ujian = 0; ujian < jumlahUjian; ujian++) {
                    System.out.println("    Ujian " + (ujian + 1) + ":");
                    for (int siswa = 0; siswa < jumlahSiswa; siswa++) {
                        System.out.println("      Nilai Siswa " + (siswa + 1) + ": " + nilaiSiswa[kelas][mapel][ujian][siswa]);
                    }
                }
            }
        }
    }
}
