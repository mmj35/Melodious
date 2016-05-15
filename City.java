import java.util.Scanner;
public class City {
  public static void main (String args[]) {
  
   Scanner keyboard= new Scanner(System.in);  
   String city;

   
  System.out.print("Please enter the name of your favorite city");
  city=keyboard.nextLine();
  System.out.println();
  
  
  int cityNameLength = city.length();
  String newCity = city.toUpperCase();
  String newerCity = city.toLowerCase();
  

  System.out.println(cityNameLength);
  System.out.println(newCity);
  System.out.println(newerCity);
  System.out.println(city.charAt(0));
  
  }
}