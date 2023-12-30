public class day91  {
    public static void main(String[] args) {

        String[][][] Nama = new String[3][2][2];

        Nama[0][0][0] ="Alex";
        Nama[0][0][1] ="Nunu";
        Nama[0][1][0] ="Nini";
        Nama[0][1][1] ="Bayu";
        Nama[1][0][0] ="Bara";
        Nama[1][0][1] ="Aldo";
        Nama[1][1][0] ="Dina";
        Nama[1][1][1] ="Amel";
        Nama[2][0][0] ="Alda";
        Nama[2][0][1] ="Angel";
        Nama[2][1][0] ="Novi";
        Nama[2][1][1] ="Nuna";

        for(int i = 0; i < Nama.length; i++){
            System.out.println("Kelompok ke- " + (i + 1));   
            for(int j = 0; j < Nama[i].length; j++){
                for(int x = 0; x < Nama[i][j].length; x++){
                    System.out.println(Nama[i][j][x]);
                }
            }
        }
    }
}
