public class Day29  {
    
    public static void main(String[] args) {
        
         int panjang = 10;
         int lebar = 15;
        int hargatanahpermeterpersegi = 5000000;
        
        int luas = panjang * lebar;
        int totalharga = luas * hargatanahpermeterpersegi;
        
        
        System.out.println("Luas lahan : " + luas + " meter persegi");
        System.out.println("harga permeter persegi : Rp. " +hargatanahpermeterpersegi);
        System.out.println("total harga lahan : Rp. " + totalharga);
    }
}