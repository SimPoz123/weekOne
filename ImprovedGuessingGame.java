import java.util.Scanner;
import java.util.Random;
class ImprovedGuessingGame {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int value, guess, count;
    guess = 0;
    count = 1;

    value = (rand.nextInt(10) + 1);

    System.out.println("I am thinking of a number between 1 and 10.");
    System.out.println("You must guess what is is in three tries.");

    while (count <= 3) {
      guess = scan.nextInt();

      int difference = Math.abs(guess - value);

      if (guess == value){
        System.out.println("Correct!");
        count = 100;
      } else if (difference <= 3) {
        System.out.println("Warm");
      } else {
        System.out.println("Cold");
      }

      count = count + 1;

    }

    if (count == 101) {
      System.out.println("You have won the game");
    } else {
      System.out.println("The correct number was " + value);
      System.out.println("You have lost the game");
    }

  }
}
