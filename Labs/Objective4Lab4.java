import java.util.Scanner;

public class Objective4Lab4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numIn;

    System.out.println("Please enter a number: ");
    numIn = scanner.nextInt();

    if (numIn % 2 == 0){
      System.out.println(numIn + " is an even number.");
    }
    else {
      System.out.println(numIn + " is an odd number.");
    }

  }
}
