import java.util.Scanner;
	public class Middle {
		public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in); 
		
		String name;
		
		System.out.println("What is your name?");
		name= keyboard.nextLine();
		System.out.println();
		
		//the number of the middleIndex is equal to length of the name divided by 2
		
		int middleIndex= name.length()/2;
		
		// find the middleindex of the name and print it out
		System.out.println(name.charAt(middleIndex));
		
	}
}