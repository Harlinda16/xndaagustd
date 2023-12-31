import java.util.Scanner;

public class day49  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        int max = a[0];
        int min = a[0];

        for (int num : a) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        if (angka % 2 == 0) {
            angka += max;
        } else {
            angka += min;
        }
        System.out.print("Angka setelah dimodifikasi: " + angka);
        
        System.out.println(" ");
  
        
        int newArray[] = new int[a.length + 1];

        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }

        newArray[newArray.length - 1] = angka;

        System.out.print("Array setelah nilai dimasukkan: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
