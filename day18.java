
public class day18  {

    public static void main(String[] args) {
        
        double total = 200000;
        System.out.println("Belanja = Rp. "+total);
        
        if(total >=100000) {
            
            System.out.println("Dapat diskon 10%");
            double diskon = 10 * total / 100;
            total -= diskon;
            
        } else{
            System.out.println("Tidak Dapat Diskon");
        }
            System.out.println("Akhir = Rp. "+total);
    }
}