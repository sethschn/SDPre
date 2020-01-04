import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args){
    double a, b, c;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    a = input.nextDouble();

    System.out.println("Please enter another number: ");
    b = input.nextDouble();

    c = a + b;
    System.out.println("The sum of " + a + " + " + b + " = " + c );

    input.close();
  }
}
