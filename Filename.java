import java.io.File;
import java.io.PrintWriter;
public class Filename {
	public static void main(String[] args) throws IOException {
	
	Scanner keyboard= new Scanner(System.in);
	File file = new file("input.txt");
	Scanner inputFile= new Scanner(file);
	ArrayList<String> nameList= new ArrayList<String>();
	while(inputFile.hasNext())	{
		nameList.add(inputFile.nextLine();
	}
	
	inputFile.close();
	
	String max=nameList.get(0);
	for(int i=0; i<=max;x++) {
		if(nameList.get(i).length()>max.length())
			max= nameList.get(i);
		}
	}
	
	PrintWriter outputFile = new PrintWriter("input.txt");
	outputFile.println(max);
	outputFile.close();
	}
		
