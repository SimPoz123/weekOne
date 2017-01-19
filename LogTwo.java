import java.util.Scanner;
class LogTwo {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    double num, logTwo;

    System.out.println("Enter a double:");
    num = scan.nextDouble();

    logTwo = Math.log(num) / Math.log(2);

    System.out.println("Base 2 log of " + num + " is " + logTwo);

  }
}
