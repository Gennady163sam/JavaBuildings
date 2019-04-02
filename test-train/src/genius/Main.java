package genius;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayNumber = scan.nextInt();

        int[] mass = new int[arrayNumber];
        int mmax = Integer.MIN_VALUE;
        for(int i = 0; i < mass.length; i++){
            mass [i] = scan.nextInt();
            mmax = Math.max(mmax, mass[i]);
        }
        System.out.println("Наибольшee число: " + mmax );



    }
}
