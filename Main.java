import java.util.Scanner;
//Main class to do trick or treating 
//@author Vishnu Srinath, Victor Garcia, John Stringfellow, Joseph Haynes
//@version 10/29/2021
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Happy Halloween!");
    System.out.println("How many houses should we trick or treat at?");

    int numHouses = in.nextInt();
    if (numHouses == 0) {
      System.out.println("No trick or trating this year!");
    }
    else{
      Pillowcase p = new Pillowcase();

      for(int i = 0; i<numHouses; i++){
        p.getCandy();
      }
      int numCandies = p.getNumberOfCandies();
      double percent = ((double)numCandies/(double)Pillowcase.MAX_CANDIES) * 100;
      System.out.println("We have " + numCandies + " candies, " + percent + "% pf our pillowcase");

      p.printNumCandies();
      in.close();
    }
  }
}