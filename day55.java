public class day55  {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int total = 0;
        double rata_rata;
        int jml_index = a.length; 
        System.out.print("deret angka : ");
        
        for(int i = 0; i < jml_index; i++) {
            System.out.print(a[i] + " ");
            total += a[i];
        }
        
        System.out.println("");
        System.out.println("total : " + total);
        
        rata_rata = (double) total / jml_index; // Menggunakan double untuk rata-rata
        
        System.out.println("rata-rata : " + rata_rata);
    }
}
