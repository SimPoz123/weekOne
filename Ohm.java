import java.util.Scanner;
class Ohm {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int voltage, resistance ;
    double current ;

    System.out.println("Enter the voltage:");
    voltage = scan.nextInt();

    System.out.println("Enter the resistance:");
    resistance = scan.nextInt();

    current = (voltage + 0.0) / (resistance);

    System.out.println("The current is " + current);
  }
}
