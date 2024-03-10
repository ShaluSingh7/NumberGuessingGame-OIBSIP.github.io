import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int lowerBound = 1;
    int upperBound = 100;
    int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    int numberOfAttempts = 0;
    int maxAttempts = 10; 
    boolean hasGuessedCorrectly = false;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have selected a number between " + lowerBound + " and " + upperBound
        + ". Try to guess it.");

    while (!hasGuessedCorrectly && numberOfAttempts < maxAttempts) {
      System.out.print("Enter your guess (or enter 0 to exit): ");
      int userGuess = scanner.nextInt();

      if (userGuess == 0) {
        System.out.println("Thanks for playing. Goodbye!");
        System.exit(0);
      }

      numberOfAttempts++;

      if (userGuess == numberToGuess) {
        hasGuessedCorrectly = true;
      } else if (userGuess < numberToGuess) {
        System.out.println("Try again. The number is greater than your guess.");
      } else {
        System.out.println("Try again. The number is less than your guess.");
      }
    }

    if (hasGuessedCorrectly) {
      System.out.println(
          "Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
    } else {
      System.out.println(
          "Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
    }
  }
}