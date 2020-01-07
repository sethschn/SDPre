import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String input, password = "password";

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("Please enter your PASSWORD: " );
    input = keyboard.next();

    while ( !input.equals(password) ){
      System.out.println("\nINCORRECT PASSWORD. Please try again.\n");
      System.out.print("Please enter your PASSWORD: " );
      input = keyboard.next();
    }

    System.out.print("\nENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while( entry != pin ) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.\n");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
