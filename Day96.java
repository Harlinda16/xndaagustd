

public class Day96  {
    public static void main(String[] args) {

        String[][][][] Nama = {
            {
                {{"Alice", "Bob"}, {"Charlie", "David"}},
                {{"Ella", "Frank"}, {"Grace", "Henry"}}
            },
            {
                {{"Isabel", "Jack"}, {"Katie", "Liam"}},
                {{"Mia", "Noah"}, {"Olivia", "Peter"}}
            }
        };

       
        for (int i = 0; i < Nama.length; i++) {
            for (int j = 0; j < Nama[i].length; j++) {
                for (int k = 0; k < Nama[i][j].length; k++) {
                    for (int l = 0; l < Nama[i][j][k].length; l++) {
                        System.out.println(Nama[i][j][k][l]);
                    }
                }
            }
        }
    }
}
