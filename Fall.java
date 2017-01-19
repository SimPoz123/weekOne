import java.util.Scanner;
class Fall {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    final double G = 32.174;
    double distance, time;

    System.out.println("Enter the number of seconds:");
    time = scan.nextDouble();

    distance = 0.5 * G * time * time;

    System.out.println("Distance: " + distance);
  }
}
