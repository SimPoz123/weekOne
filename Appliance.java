import java.util.Scanner;

class Appliance {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    double cents, year, total ;

    System.out.println("Enter cost per kilowatt-hour in cents: ");
    cents = scan.nextDouble();

    System.out.println("Enter kilowatt-hours used per year: ");
    year = scan.nextDouble();

    cents = cents / 100;

    total = cents * year;

    System.out.println("Annual cost: " + total);

  }
}
