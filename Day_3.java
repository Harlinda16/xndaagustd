package day3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        
        System.out.print("panjang = ");
        int panjang = userInput.nextInt();
        System.out.print("lebar = ");
        
        int lebar = userInput.nextInt();
        
        int luas = panjang * lebar;
        System.out.println("luas = " + luas);
    }



}
