import java.util.Scanner;
public class Cookies {
	public static void main(String[] args) {
	Scanner keyboard= new Scanner(System.in);
	
	double totalCookies=40;
	double servings= 10; 
	double caloriesPerServing= 300;
	
	System.out.println("Enter the amount of cookies that you ate?");
	double cookiesEaten=keyboard.nextDouble(); 
	System.out.println();
	
	double servingsEaten= (cookiesEaten/servings);
	double calories= (servingsEaten/caloriesPerServing);
	
	System.out.println("The number of calories in " + cookiesEaten + "your calorie intake was" + calories);
	}
}
	
	
	
	