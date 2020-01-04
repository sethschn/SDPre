import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;


    System.out.print( "How much is the purchase price? ");
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item prices:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax );
    System.out.println( "Total cost:\t" + total );

    //1. it wont compile since price hasnt been defined
    //2. yes
    //3. no error price will be defined by keyboard input.
  }
}
