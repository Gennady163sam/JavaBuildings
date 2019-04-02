package genius;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int thirdNumber = scan.nextInt();
        int fourthNumber = scan.nextInt();
        int fifthNumber = scan.nextInt();
        int sixthNumber = scan.nextInt();
        int seventhNumber = scan.nextInt();
        int eighthNumber = scan.nextInt();
        int ninthNumber = scan.nextInt();
        int tenthNumber = scan.nextInt();

        int[] mass = {firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber, seventhNumber, eighthNumber, ninthNumber, tenthNumber};

        int max = Integer.MIN_VALUE;
        for(int i = 1; i < mass.length; i++){
            max = Math.max(max, mass[i]);
        }
        System.out.println("Наибольшee число: " + max );



    }
}
