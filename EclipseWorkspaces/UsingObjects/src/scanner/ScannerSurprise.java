package scanner;

import java.util.Scanner;


public class ScannerSurprise {

	public static void main(String[] args) {
		//create a Scanner for keyboard input
		Scanner sc = new Scanner(System.in);		

		IO.println("Enter a number");
		int number = sc.nextInt();	//read a number
		IO.println("You entered the number " + number);
		
		
		/* Progress to next line - this is needed otherwise the following
		 * call to the nextLine() method below will seemingly do nothing.
		 *  
		 * This is because the nextInt() method above reads the number 
		 * input but ignores the newline '\n' character which is added 
		 * to the input stream by pressing the enter key. When nextLine()
		 * is called it "advances the scanner past the current line and
		 * returns the input that was skipped".
		 */
		sc.nextLine(); 
		
		
		IO.println("Type a sentence");
		String sentence = sc.nextLine();	//read a whole line
		IO.println("You entered the sentence " + sentence);
		
		
		
		IO.println("Enter a number: ");
		double decimal = sc.nextDouble(); //read a number
		IO.println("You entered the decimal " + decimal);
		
		//CURRENTLY SENTENCE BELOW IS SKIPPED - FIX THIS BY CALLING nextLine() HERE

		IO.println("Type a sentence");
		sentence = sc.nextLine();	//read a whole line
		IO.println("You entered the sentence " + sentence);
		
		/* Alternatively, you could use IO.readln i.e.
		 * sentence = IO.readln("Type a sentence\n");
		 * 
		 * This doesn't suffer from the same issue and so 
		 * is simpler on this occasion. Obviously if we were
		 * reading data from file then this would not be an 
		 * option however. 
		 */
		
		sc.close(); //close the Scanner

	}

}
