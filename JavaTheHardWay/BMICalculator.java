import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inches, pounds, feet;

    System.out.print( "Your height (feet only): ");
    feet = keyboard.nextDouble();
    inches = feet * 12;

    System.out.print( "Your height (inches): " );
    inches = inches + keyboard.nextDouble();
    m = inches * 0.0254;

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();
    kg = pounds * 0.4535924;
    
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
