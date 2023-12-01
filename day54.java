public class day54 {

    public static void main(String[] args) {
        
        int[] datanilai = {45, 78, 71, 89, 93, 58, 62, 63, 34, 78};
        
        for(int i = 0; i < datanilai.length; i++) {
            
            if ( datanilai[i] < 70 ) {
                System.out.println(datanilai[i]+ " Tidak Lulus ");
            } else {
                System.out.println(datanilai[i]+ " Lulus ");
            }
        }
        
    }
}
