public class day48 {

    public static void main(String[] args) {
        int a[] = {1, 2, 10, 0, -10, 3, 101, 4};
        int jml_index = a.length;
        int max = a[0], min = a[0];
        System.out.print("deret bil : ");
        for(int i = 0; i < jml_index; i++) {
            System.out.print(a[i] + " ");
            
            if(a[i] > max){
                max = a[i];
            }
            
            if(a[i] < min){
                min = a[i];
            }
        }
        
        System.out.println("");
        System.out.println("max : " +max);
        System.out.println("min : " +min);
        
    }
}
