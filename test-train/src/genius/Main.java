package genius;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] mass = new int[10];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < mass.length; i++){
            mass [i] = scan.nextInt();
            max = Math.max(max, mass[i]);
        }
        System.out.println("Наибольшee число: " + max );



    }
}
