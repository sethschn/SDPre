public class CreatingVariables{
  public static void main( String[] args){
    int x, y, age, z;
    double seconds, e, checking, minutes;
    String firstName, lastName, title, productName, manufacturer;

    x = 10;
    y = 400;
    age = 39;
    z = 99;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    minutes = 5.1;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    productName = "Soda";
    manufacturer = "fake brand";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds.");
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "Study Drill " + z + " " + minutes + " " + productName + " " + manufacturer );
  }
}
