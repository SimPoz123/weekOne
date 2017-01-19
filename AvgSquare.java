import java.util.Scanner;
class AvgSquare {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    int n, count;
    double value, sum, sumSquare, avg, avgSquare, sd;
    count = 1;
    sum = sumSquare = 0.0;

    System.out.println("Enter N");
    n = scan.nextInt();

    while (count <= n) {
      System.out.println("Enter value");
      value = scan.nextDouble();

      sum = sum + value;
      sumSquare = sumSquare + (value * value);

      count = count + 1;
    }

    avg = sum / n;
    avgSquare = sumSquare / n;

    sd = Math.sqrt(avgSquare - (avg * avg));

    System.out.println("Standard Deviation:" + sd);

  }
}
