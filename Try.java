//Melody Jolly
import java.util.Scanner;
public class Try {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		
	
		int brick;
		int brickNeeded=1;
		int wood;
		int woodNeeded=1;
		int sheep=1;
		int sheepNeeded=1;
		int grain;
		int grainNeeded=1;
		int grainNeeded2=3;
		int ore;
		int oreNeeded=2;
		String build;
		
		
		System.out.println("How many bricks do you have?");
		brick=keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much wood do you have?");
		wood=keyboard.nextInt();
		System.out.println();
		
		System.out.println("How many sheep do you have?");
		sheep=keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much grain do you have?");
		grain=keyboard.nextInt();
		System.out.println();
		
		System.out.println("How much ore  do you have?");
		ore=keyboard.nextInt();
		System.out.println();
		keyboard.nextLine();
		
		
		System.out.println("What would you like to build?");
		build=keyboard.nextLine();
		System.out.println();
		
		do { 

		if(build.equals("road")) {
			System.out.println("You would like to build a road.");
			
			if(build.equals("road") && brick>=1 && wood>=1) {
				System.out.println("You have enough resources for a road.");
		
		}else{
		
			System.out.println("You do not have enough resources for a road.");	
			 
			 if(!(brick>=1 && wood>=1)) {
			 	System.out.println("You still need " + ( brickNeeded - brick ) + " brick" + " and" + " " + ( woodNeeded - wood ) + " piece of wood" );
			 	}
			 }
		}
			 
					
	
			
		if(build.equals("settlement")) {
			System.out.println(" would like to build a settlement.");
			
		if(build.equals("settlement") && brick>=1 && wood>=1 && grain>=1 && sheep>=1) {
			System.out.println("You have enough resources for a settlement.");
			
		}else{
			System.out.println("You do not have enough for a settlement.");
			
			if(!(brick>=1 && wood>=1 && grain>=1 && sheep>=1)) {
				System.out.println("You still need " +  " " + ( brickNeeded - brick ) + " brick" + " and" + " " + ( woodNeeded - wood ) + " piece of wood"  + " " + ( grainNeeded - grain ) + " grain" +  " " + "and" + " " + ( sheepNeeded - sheep ) + " " + "sheep" );
				 }
			}
		}
			 
			
			
			
		if(build.equals("city")) {
			System.out.println("You would like to build a city.");		
						
		if(build.equals("city") && grain>=3 && ore>=2) {
				System.out.println("You have enough to build a city.");
		
		}else{
		
			System.out.println("You do not have enough to build a city.");
			
			if(!(build.equals("city") && grain>=3 && ore>=2)) {
				System.out.println("You still need" + " " + ( grainNeeded2 - grain ) +  " " + "grain" + " " + "and" + " " + ( oreNeeded - ore ) + " " + "ore" );
					}
			}
		}
			
	}
}
			


			
				
		
		
		
		
	
		
		
	

						
		