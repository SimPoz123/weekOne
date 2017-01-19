import java.util.Scanner;
class CircleArea {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int radius;
    double area;

    System.out.println("Input the radius:");
    radius = scan.nextInt();

    area = radius * radius * Math.PI ;

    System.out.println("The radius is:" + radius);
    System.out.println("The area is:" + area);

  }
}
