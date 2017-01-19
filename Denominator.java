import java.util.Scanner;
class Denominator {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    int n, count;
    double value, sum;
    count = 1;
    sum = value = 0.0;

    System.out.println("Enter N");
    n = scan.nextInt();

    while (count <= n) {
      value = value + 1.0;

      sum = sum + (1 / value);

      count = count + 1;
    }

    System.out.println("Sum is: " + sum);

  }
}
