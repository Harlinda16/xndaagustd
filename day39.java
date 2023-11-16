public class day39  {

    public static void main(String[] args) {
        int[] numbers = {14, 25, 7, 36, 42};

          int max = numbers[0];
       for (int i = 1; i < numbers.length; i++) {
           
         if (numbers[i] > max) {
            max = numbers[i];
          }
       }
       System.out.println("Nilai maksimum dalam array adalah: " + max);

    }
}