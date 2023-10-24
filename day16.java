public class day16  {

    public static void main(String[] args) {
        
        // Operator logika
        
        // OR / atau (||)
        
        System.out.println("______OR ( || )_______");
        System.out.println("_______INTEGER_______");
        
            int angka1 = 180; 
            int angka2 = 270;

        System.out.println("apakah 180 <= 270 || 180 >= 270 hasilnya adalah : " +(angka1 <= angka2 || angka1 >= angka2));
        System.out.println("apakah 180 == 270 || 180 == 270 hasilnya adalah : " +(angka1 == angka2 || angka1 == angka2));
        
             byte nilai1 = 50;
             byte nilai2 = 100;
        System.out.println("apakah 150 == 100 || 150 >= 100 hasilnya adalah : " +(nilai1 == nilai2 || nilai1 >= nilai2));
        System.out.println("apakah 180 == 270 || 180 == 270 hasilnya adalah : " +(angka1 >= angka2 || angka1 >= angka2));
        
        
        // AND / atau (&&)
        System.out.println("______AND (&&)_______");
            long tebal1 = 12000;
            long tebal2 = 13000;
        System.out.println("apakah 12000 <= 13000 && 12000 <= 13000 hasilnya adalah : " +(tebal1 <= tebal2 && tebal1 <= tebal2));
        System.out.println("apakah 12000 >= 13000 && 12000 >= 13000 hasilnya adalah : " +(tebal1 >= tebal2 && tebal1 <= tebal2));
      
        //  not / negasi (!)
        
        System.out.println("______NOT/NEGASI (!)_______");
        
            long hal1 = 14000;
            long hal2 = 15000;
            
        
        System.out.println("jika ! 14000 >= 15000 hasilnya adalah : " + !(hal1 >= hal2));
        System.out.println("jika ! 14000 == 15000 hasilnya adalah : " + !(hal1 == hal2));
        
    }
}