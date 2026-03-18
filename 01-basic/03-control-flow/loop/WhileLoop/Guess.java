import java.util.Scanner;
import java.util.Random;
// Pick a "secret number" (like 7). Keep asking the user to guess until they get it right. Tell them "Higher" or "Lower" after each wrong guess.
public class Guess {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        Random rand = new Random();
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Can you guess it?");
        int sceratedNumber = rand.nextInt(100)+1;// generates a random number between 1 and 100
        int userGuess = 0;
        int attempts = 0; // Track the number of tries
        boolean hasWon = false;
        while (!hasWon) {
            System.out.print("Guess the number between 1 and 100: ");
            userGuess = sc.nextInt();
            attempts++;
            if (userGuess < sceratedNumber) {
                System.out.println("Higher!");
            } else if (userGuess > sceratedNumber) {
                System.out.println("Lower!");
            } else {
                hasWon = true;
                System.out.println("Congratulations! You've guessed the number!");
                System.out.println("Congrats! It took you " + attempts + " tries.");
            }
        }

    }

}
