import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextManipulation {

	public static void main(String[] args) {

		String line="Hadoop is open source frame work ,Hadoop is good framework for handling big data";
		int op;		
		Scanner s = new Scanner(System.in); //scanner object for taking inputs
		
		do {	//Loop to make the program menu-driven. Will run till the user chooses to exit.
			
			System.out.println("Input String: Hadoop is open source frame work ,Hadoop is good framework for handling big data");
			System.out.println("\n1. Split the line by space and store in a new string array");
			System.out.println("2. Count number of occurrence of word Hadoop in the given string");
			System.out.println("3. Replace the ‘,’with space in the given string");
			System.out.println("4. Create an array list with generic string and store the splitted string inside it");
			System.out.println("5. Exit");
			System.out.print("\nEnter Your Option(1-5): ");
			op=s.nextInt();
			System.out.println("");
			
			switch(op) {
			
			case 1 : 
				String[] sarray = line.split(" "); //Split the input line using ' ' as delimiter
				int i=0;
				for (String str:sarray)
					System.out.println("\tString Array["+ (i++) +"]: "+str);
				System.out.println("");
				break;
				
			case 2 :
				Pattern p = Pattern.compile("Hadoop"); //define the string to be searched as a pattern
				Matcher m = p.matcher(line);	//match the pattern with the input string
				int count=0;
				while(m.find())
					count++;	//Increase the count whenever there is a match
				System.out.println("Count of word Hadoop in Input String: "+count+"\n");
				break;
				
			case 3 :
				System.out.println(line.replace(","," ")+"\n"); //using replace function to replace ',' with ' '.
				break;
				
			case 4 :
				ArrayList<String> list1 = new ArrayList<String>(); //creating an array list object with generic type String.
				
				for(String str:line.split(" ")) //splitting the string by space
					list1.add(str);	//adding every split string to the array list.
				
				System.out.println("Contents of ArrayList: "+list1);
				System.out.println("");
				break;
			
			case 5 :
				System.out.println("Thanks for trying out the Application. GOOD BYE !!!");	//Message displayed on Exit.
				break;	
				
			default :
				System.out.println("Invalid Option. Please Retry !!!\n");	//Message displayed on Invalid Input.
				break;
				
			}	//end of switch case
			
		} while (op!=5);	//end of do loop
		
		s.close();		//scanner object closed.
	}

}
