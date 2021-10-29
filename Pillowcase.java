//This class gets and collects the candies and stores the different types in an ArrayList
//It knows to print a count of each type of candy
//@author Vishnu Srinath, Victor Garcia, John Stringfellow, Joseph Haynes
//@version 10/29/2021
import java.util.ArrayList;
import java.util.Random;
class Pillowcase{
public static final int MAX_CANDIES = 1000;
public static final int CANDIES_TYPES = 7;
private ArrayList<Candy> candies;
private int numberOfCandies;

// Constructor initializes class variables

Pillowcase(){
  candies = new ArrayList<Candy>();
  numberOfCandies = 0;
}

//return the number of candies 
//@return number of candies

public int getNumberOfCandies(){
  return numberOfCandies;
}

// Get a candy (a random number between 1 and 100) Categorize the candy based getNumberOfCandies
// Create a Candy object based on derived name and store it in  candies ArrayList.
// Incriment the number of candies in the pillowcase and prin an error if full.
public void getCandy() {
  if (numberOfCandies<MAX_CANDIES) {
    System.out.println("Trick or Treat! ");

    Random r = new Random();
    int candyType = r.nextInt(100) + 1;
    String candyName = "";

    if (candyType >= 1 && candyType < 6) {
      candyName = "Kit Kat";
    }
    else if (candyType >= 6 && candyType < 16){
      candyName = "M&Ms";
    }
    else if (candyType >= 16 && candyType < 26){
      candyName = "Milky Way";
    }
    else if (candyType >= 26 && candyType < 41){
      candyName = "Hershy's Bar";
    }
    else if (candyType >= 41 && candyType < 56){
      candyName = "Twix";
    }
    else if (candyType >= 56 && candyType < 76){
      candyName = "Pink Starburst";
    }
    else if (candyType >= 76 && candyType < 101){
      candyName = "Reese's";
    }
    Candy candy = new Candy(candyName);
    candies.add(candy);
    System.out.println("We got " + candyName + "!");
    numberOfCandies++;
  }
  else{
    System.out.println("Bag is full!! Cannot get anymore candy");
  }
}
// Print the number of each type of candy 
public void printNumCandies(){
  int[] candyCount = new int [CANDIES_TYPES];

  // Count candies of each type into an array 
  for(int i = 0; i<numberOfCandies; i++){
    String candyName = candies.get(i).getName();
    if (candyName.equals("Kit Kat")) {
      candyCount[0]++;
    }
    else if (candyName.equals("M&Ms")) {
      candyCount[1]++;
    }
    else if (candyName.equals("Milky Way")) {
      candyCount[2]++;
    }    
    else if (candyName.equals("Hersy's bar")) {
      candyCount[3]++;    
  }
    else if (candyName.equals("Twix")) {
      candyCount[4]++;
  }
    else if (candyName.equals("Pink Starburst")) {
      candyCount[5]++;
  }
    else if (candyName.equals("Reese's")) {
      candyCount[6]++;
  }
}

//Print candies of each type we got. 7 is the number of candy types
System.out.println("We got...");
for (int i = 0; i<CANDIES_TYPES; i++){
  if(candyCount[i] > 0){
    System.out.print(candyCount[i] + " ");
    switch(i) {
      case 0:
            System.out.println("Kit Kat");
            break;
      case 1:
            System.out.println("M&Ms");
            break;
      case 2:
            System.out.println("Milky Way");
            break;
      case 3:
            System.out.println("Hershy's bar");
            break;
      case 4:
            System.out.println("Twix");
            break;
      case 5:
            System.out.println("Pink Startburst");
            break;
      case 6:
            System.out.println("Reese's");
            break;
    }
  }
}
}
}
