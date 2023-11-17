public class day40 {
     	public static void main(String[] args) {
     	    
     	    int[] nilai = {1,2,3,4,5,6,7,8,9};
     	    
     	    System.out.println(nilai[6]);
     	    nilai[6] = 8;
     	    
     	    System.out.println(nilai[6]);
     	       
     	    float[] nilai1 = {1.0f, 2.0f, 3.0f};
     	    System.out.println(nilai1[1]);
     	    
     	    nilai1[1] -= 0.5f;
     	    nilai1[2] %= 0f;
     	    
     	    System.out.println(nilai1[1]);
     	    System.out.println(nilai1[2]);
     	}
}