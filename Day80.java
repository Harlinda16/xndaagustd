public class Day80 {
    public static void main(String[] args) {
        
        
        
        int[][][] Array_3D = {
                {
                        {1, 2, 2},
                        {9, 2, 9},
                        {5, 8, 5}, },

                {
                        {0, 3, 7},
                        {10, 7, 10},
                        {20, 4, 20}, },

                {
                        {12, 12, 180},
                        {9, 10, 9},
                        {10, 6, 9}, },

        };

        for (int[][] a : Array_3D) {
            for (int[] b : a) {
                for (int i = 0; i < b.length - 1; i++) {
                    for (int j = i + 1; j < b.length; j++) {
                        if (b[i] == b[j]) {
                            System.out.println("Angka yang sama: " + b[i]);
                        }
                    }
                }
            }
        }

        System.out.println("Selesai.");
    }
}
