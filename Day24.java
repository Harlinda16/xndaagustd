public class Day24 {
    
    public static void main(String[] args) {
        
        //berat dari buah yg dibeli ucup
        double beratapelkg = 20;
        double beratanggurkg = 18;
        double beratrambutankg = 17;
        double beratjerukkg = 29;
        
        //Harga dan berat buah yg dibeli ucup
        double hargaapeldibeli = 5000; //harga 1 buah apel
        double beratapel = 0.2; //200 gram/buah
        double hargaanggur = 3000; //harga anggur dalam/100 garam
        double hargarambutan = 15000; // harga rambutan dalam 1kg
        double hargajeruk = 45000; // harga jeruk dalam/3 kilo
        
        //total harga dari buah yang dibeli
        double totalhargaapel = (hargaapeldibeli * (beratapelkg / beratapel));
        double totalhargaanggur = (hargaanggur * (beratanggurkg / 1000));
        double totalhargarambutan = (hargarambutan * (beratrambutankg / 1000));
        double totalhargajeruk = (hargajeruk * (beratjerukkg / 3));
        
        double totalharga = totalhargaapel + totalhargaanggur + totalhargarambutan + totalhargajeruk;
        
        // bonus yg didapat ucup setiap membeli buah 5kg
        double bonus = 0.5; 
        
        //menghitung total bonus dari masing2 buah-buahan
        double bonusapel = (beratapelkg / 5) * bonus;
        double bonusanggur = (beratanggurkg / 5) * bonus;
        double bonusrambutan = (beratrambutankg / 5) * bonus;
        double bonusjeruk = (beratjerukkg / 5) * bonus;
        
        //menghitung total bonus
        double totalbonus = bonusapel + bonusanggur + bonusrambutan + bonusjeruk;
        
        double totalhargasetelahbonus = totalharga + totalbonus;
        
        //menghitung diskon
        double diskon = totalharga * 0.002;
        double hargaakhir = totalharga- diskon;
        
        
        
        double totalhargasetelahdiskon = totalhargasetelahbonus - diskon;
        
        
        //Output program
        System.out.println("Harga apel adalah :Rp. " + totalhargaapel + " ribu rupiah");
        System.out.println("Harga anggur adalah : Rp. " + totalhargaanggur + " ribu rupiah");
        System.out.println("Harga rambutan adalah :Rp. " + totalhargarambutan + " ribu rupiah");
        System.out.println("Harga jeruk adalah : Rp. " + totalhargajeruk + " ribu rupiah");
        System.out.println("total harga setelah diskon : Rp. " + totalhargasetelahdiskon + " ribu rupiah");
        System.out.println("total Bonus : " + totalbonus + " kg");
        System.out.println("total Diskon : Rp. " + diskon + " ribu rupiah");
        System.out.println("Total yang harus dibayar : Rp. " + hargaakhir + " ribu rupiah");
        
        
        
        
    }
}
