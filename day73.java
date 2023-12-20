public class day73  {
    
    public static void main(String[] args){
        
        String[][] kontak = {
            {"Alex", "\t (*123#)"},
            {"Budi", "\t (*555#)", " - Call Center"},
            {"Susanti", "\t (*888#)"},
            {"Mail", "\t (*777#)", " - Paket Data"},
        };
        
        for (int i = 0; i < kontak.length; i++){
            for (int j = 0; j < kontak[i].length; j++){
                System.out.print(kontak[i][j]);
            }
            System.out.println();
        }
    }
}
