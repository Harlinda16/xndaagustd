public class day14 {
     
    public static void main(String[] args) {
        
        
        int a,b;
        boolean hasilKomparasi;
        
        
         System.out.println("______PERSAMAAN_______");
        
           a = 5;
           b = 5;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);
        
           a = 7;
           b = 5;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);
        
        System.out.println("______PERTIDAKSAMAAN_______");
        
           a = 5;
           b = 5;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);
        
        a = 8;
           b = 5;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);
        
                System.out.println("______LEBIHDARI_______");
        
           a = 9;
           b = 5;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);
        
           a = 3;
           b = 5;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);
        
        System.out.println("______KURANGDARI_______");
        
           a = 4;
           b = 5;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);
        
           a = 6;
           b = 5;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);
        


    }
 }