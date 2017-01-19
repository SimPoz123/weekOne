import java.util.Scanner;
class AddingUpIntegers {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    int count, value, sum;
    sum = 0;

    System.out.println("How many integers will be added?");
    count = scan.nextInt();

    while (count > 0) {
      System.out.println("Enter an integer");
      value = scan.nextInt();

      sum = sum + value;

      count = count - 1;
    }

    System.out.println("The sum is " + sum);

  }
}
