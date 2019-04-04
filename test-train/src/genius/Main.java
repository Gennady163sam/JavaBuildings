package genius;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        makeQuestion();
    }

    private static void calcMax() {
        Scanner scan = new Scanner(System.in);

        int arrayNumber = scan.nextInt();

        int[] mass = new int[arrayNumber];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scan.nextInt();
            max = Math.max(max, mass[i]);
        }
        System.out.println("Наибольшee число: " + max);
    }

    private static void makeQuestion() {
        Scanner scan = new Scanner(System.in);

        do { System.out.println("Кто первый человек, полетевший в космос?");
            String answer = scan.next();
            String gagarin = "Гагарин";

            if(answer.equalsIgnoreCase(gagarin)) {
                System.out.println("Молодец, верно!");
                break;
            } else System.out.println("Не верно");

        } while (true);



    }
}
