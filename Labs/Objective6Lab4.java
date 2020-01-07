public class Objective6Lab4 {
  public static void main(String[] args){
    int csum = 0;
    int counter = 1;

    while ( counter <= 20){
      csum = csum + counter;
      System.out.println( "counter: "+counter+" current sum: "+csum);
      counter += 1;
    }
    System.out.println(csum);
  }
}
