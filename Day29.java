public class day29 {
    
    public static void main(String[] args) {
        
         double panjang = 10;
         double lebar = 15;
         double kampling = 30;
        double hargatanahpermeterpersegi = 500000;
        
        double luas = panjang * lebar;
        double totalLahan = luas * kampling;
        double harga = totalLahan*hargatanahpermeterpersegi;
        
        
        System.out.println("Luas lahan : " + luas + " meter persegi");
        System.out.println("Total lahan : "+kampling);
        System.out.println("harga permeter persegi : Rp. " +hargatanahpermeterpersegi);
        System.out.println("total harga lahan : Rp. " + harga);
    }
}
