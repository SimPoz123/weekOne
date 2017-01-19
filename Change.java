import java.util.Scanner;
class Change {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    int amount, dollars, quarters, dimes, nickels, pennies;

    System.out.println("How mich chanhe is due");
    amount = scan.nextInt();

    dollars = amount / 100;
    amount = amount % 100;

    quarters = amount / 25;
    amount = amount % 25;

    dimes = amount / 10;
    amount = amount % 10;

    nickels = amount / 5;
    amount = amount % 5;

    pennies = amount;

    System.out.println("Your change is " + dollars + " dollars, " + quarters + " quarters. " + dimes + " dimes, " + nickels + " nickels and " + pennies + " pennies.");

  }
}
