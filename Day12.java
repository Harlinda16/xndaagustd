public class Day12 {

    public static void main(String[] args) {
        
        int[] nilai = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] % 2 == 0) {
                System.out.println(nilai[i] + " adalah angka genap");
            } else {
                System.out.println(nilai[i] + " adalah angka ganjil");
            }
        }
    }
}
