import java.util.Scanner;
import java.util.Random;

class SquareRootGame {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    int round, amountOfRounds, wins1, wins2;
    round = 1;
    wins1 = wins2 = 0;
    String name1, name2;
    double value, guess1, guess2, diff1, diff2, squareRoot;

    System.out.println("How many rounds will be played?");
    amountOfRounds = scan.nextInt();
    System.out.println("There will be " + amountOfRounds + " rounds");

    System.out.println("First Player, sign in-->");
    name1 = scan.next();
    System.out.println("Second Player, sign in-->");
    name2 = scan.next   ();

    while (round <= amountOfRounds) {
      value = 100 * rand.nextDouble();
      squareRoot = Math.sqrt(value);

      System.out.println("What is the square root of " + value + "?");

      System.out.println(name1 + ", your guess:");
      guess1 = scan.nextDouble();
      System.out.println(name2 + ", your guess:");
      guess2 = scan.nextDouble();

      diff1 = Math.abs(squareRoot - guess1);
      diff2 = Math.abs(squareRoot - guess2);

      System.out.println("The correct square root: " + squareRoot);
      System.out.println(name1 + " is " + diff1 + " away");
      System.out.println(name2 + " is " + diff2 + " away");

      if (diff1 < diff2) {
        System.out.println(name1 + " wins!");
        wins1 = wins1 + 1;
      } else {
        System.out.println(name2 + " wins!");
        wins2 = wins2 + 1;
      }

      round = round + 1;
    }

    System.out.println("---- Final Score ----");
    System.out.println(name1 + ":  " + wins1 + "  " + name2 + ":  " + wins2);

  }
}
