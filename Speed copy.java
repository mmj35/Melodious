import java.util.Scanner;
public class Speed {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);

	System.out.println("What is the speed of the vehicle?");
	int speed=keyboard.nextInt();

	System.out.println("What are the number of hours the vehicle has traveled?");
	int hours=keyboard.nextInt();

	int distance=0;
		for(int i=1;i<=hours;i++) {

		distance=speed*i;
		}


		System.out.println("If you traveled " + hours + "hour/hours, the distance traveled is " + distance + " miles");

	}
}