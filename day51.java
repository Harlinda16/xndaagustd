public class day51  {

    public static void main(String[] args) {
        
        System.out.println("=====Nilai dalam Array=====");
       int nilai[] = {70, 90, 86, 95, 78};
        
        int jumlah = 0;
           for(int i = 0; i < nilai.length; i++) {
            jumlah += nilai[i];
               
               System.out.println(nilai[i]);
               System.out.println("");
        }
        
        System.out.println("=====Nilai setelah di jumlah=====");
        
        System.out.println(jumlah);
    }
}
