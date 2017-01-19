import java.util.Scanner;
class Dollar {
  public static void main (String[] args) {

    Scanner scan = new Scanner(System.in);

    int amount, dollars, cents ;

    System.out.println("Input the cents");
    amount = scan.nextInt() ;

    dollars = amount / 100 ;
    cents = amount % 100 ;

    System.out.println("That is " + dollars + " dollars and " + cents + " cents");

  }
}
