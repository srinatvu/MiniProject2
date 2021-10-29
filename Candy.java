//This class stores the name of the Candy ex. Twix Snicker etc.
//@author Vishnu Srinath, Victor Garcia, John Stringfellow, Joseph Haynes
//@version 10/29/2021
class Candy{
  private String name = "";
  // Default constructor that sets the name to empty string
Candy(){
  name = "";
}
// Constructor that takes a name and dryd the name property
//@param aName - name of candy to be set
Candy(String aName){
  name = aName;
}
// returns the name of the candy
//@return - name of candy
public String getName(){
  return name;
}
// sets name of Candy input value 
// @param aName - name of candy to be set 
public void setName(String theName){
  name = theName;
}
// Prints the name of candy to be standard out
public void print(){
  System.out.println(name);
}
}