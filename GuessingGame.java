import java.util.Scanner;
import java.util.Random;
class GuessingGame {
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

      if (guess == value){
        System.out.println("Correct!");
        count = 100;
      } else {
        System.out.println("Incorrect, try again!");
        count = count + 1;
      }

    }

    if (count == 100) {
      System.out.println("You have won the game");
    } else {
      System.out.println("The correct number was " + value);
      System.out.println("You have lost the game");
    }

  }
}
