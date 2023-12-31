public class day84  {
    public static void main(String[] args) {
        
        int[][][] Suhukota = {
            {
                {28, 30, 29, 31, 33, 32, 30},
                {29, 31, 30, 32, 33, 34, 31}
            },
            {
                {26, 27, 28, 29, 30, 29, 28},
                {27, 28, 29, 30, 31, 30, 29}
            },
            {
                {30, 32, 33, 35, 36, 34, 33},
                {31, 33, 34, 36, 37, 35, 34}
            },
            {
                {25, 26, 27, 28, 29, 28, 27},
                {26, 27, 28, 29, 30, 29, 28}
            }
        };

        System.out.println("Data Suhu Harian untuk Setiap Kota:");

        for (int city = 0; city < Suhukota.length; city++) {
            System.out.println("\nKota " + (city + 1) + ":");
            for (int week = 0; week < Suhukota[city].length; week++) {
                System.out.print("Minggu " + (week + 1) + ": ");
                for (int day = 0; day < Suhukota[city][week].length; day++) {
                    System.out.print(Suhukota[city][week][day] + " ");
                }
                System.out.println();
            }
        }
    }
}
