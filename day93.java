public class day93  {
    public static void main(String[] args) {
        
        int lapisan = 5;
        int baris = 6;
        int kolom = 6;
        
        System.out.println("");
        System.out.println("======CETAK NILAI======\n");
        
        int[][][] Array3D = new int[lapisan][baris][kolom];

        for (int i = 0; i < Array3D.length; i++) {
            int angka = 1;
            System.out.println("Lapisan ke- " + (i + 1));
            for (int j = 0; j < Array3D[i].length; j++) {
                for (int k = 0; k < Array3D[i][j].length; k++) {
                    Array3D[i][j][k] = angka++;
                    System.out.print((Array3D[i][j][k]) + "\t");
                }
                System.out.println("");
            }
        }

        System.out.println("");
        System.out.println("======PROGRAM SELESAI======");
    }
}
