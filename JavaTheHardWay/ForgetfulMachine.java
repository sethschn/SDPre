import java.util.Scanner;

public class ForgetfulMachine{
  public static void main( String[] args ){
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?" );
    keyboard.next();

    System.out.println( "what is 6 multiplied by 7?" );
    keyboard.nextInt();

    System.out.println( "Enter a number between 0.0 and 1.0" );
    keyboard.nextDouble();

    System.out.println( "Is there anything else you would like to say?" );
    keyboard.next();
    // the 2nd question blows up when i type 3.14
    // I typed a string in the third question and it can't convert a string to a double
  }
}
