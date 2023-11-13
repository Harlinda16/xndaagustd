public class Day36 {
    
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi = true;
        
        System.out.println("__Awal program__");
        
        while (kondisi) {
            System.out.println(a + ". Harlinda ");
            
            if (a == 20) {
                kondisi = false;
            }
            a++;
        }
        
        System.out.println("__Akhir program__");
        System.out.println("Sekian dan terima kasih");
    }
}
