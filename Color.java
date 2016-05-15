import java.util.Scanner;

public class Color {
	public static void main(String[] args) {
	
	Scanner keyboard=new Scanner(System.in);
	
	System.out.println("What is your favorite color? (Choose from red, yellow, green, blue or purple.");
	String color=keyboard.nextLine();
	System.out.println(color);
	
	if(color.equals("Red")) {
		System.out.println("The ball is red.");
	}else if(color.equals("Yellow")) {
		System.out.println("The sun is yellow.");
	}else if(color.equals("Green")) {
		System.out.println("The grass is green.");
	}else if(color.equals("Blue")) {
		System.out.println("The sky is blue.");
	}else{
		System.out.println("The throne is purple.");
	}
	
	}
}
	
	