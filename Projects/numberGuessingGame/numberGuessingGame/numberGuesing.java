package numberGuessingGame;

import java.util.Scanner;

public class numberGuesing {

    public static void numberGuessing() {
        Scanner sc = new Scanner(System.in);

        int k = 5;
        int i, guess;

        System.out.println("Guess the number form 1 to 100 ");

        int item = 1 + (int) (Math.random() * 100);

        for (i = 0; i < k; i++) {

            System.out.println("Guess the number from 1 to 100 ");
            guess = sc.nextInt();

            if (guess == item) {
                System.out.println("you guessed the right answeer congrulation!!!");

            } else if (item > guess) {
                System.out.println("The number you guessed is Bigger than" + " " + guess);

            } else if (item < guess) {
                System.out.println("The number you guessed is  Smaller than " + " " + guess);

            }
            sc.nextLine();
            System.out.println();

        }
        if (i == k) {
            System.out.println("The trial is exhausted");
        
            System.out.println("the number of trial:" + item);
        }

    }

    public static void main(String[] args) {

        numberGuessing();
    }
}
