package scanner;

/* Program to show how to read input from the keyboard using a Scanner.
 *
 * The program prompts the user for some information, reads the input 
 * from the keyboard, and then echoes it back.
 */

import java.util.Scanner;  //remember to import the Scanner

public class ScannerDemo
{
	public static void main(String[] arg)  
	{
		//create a Scanner object for keyboard input
		Scanner sc = new Scanner(System.in);		

		IO.println("Type your address, and press Enter");
		String address = sc.nextLine();	//read a whole line
		//or... String address = IO.readln("Type your address, and press Enter\n");
		IO.println("You live at " + address);
		
		/* It turns out that as of Java 25 you can read a line of
		 * text from the standard input via the IO class.
		 * Try uncommenting the line above and then comment out the
		 * two lines above of that.
		 * 
		 * However the Scanner allows you to read different types
		 * of data, and also from different sources, such as a file.
		 */

		IO.println("Type your 1st name, and press Enter");
		String name = sc.next();	//read next token as String
		IO.println("Hello " + name);

		IO.println("Enter your age: ");
		int age = sc.nextInt();		//read next token as an int
		IO.println("You are " + age + " years old");

		//...prompt for some other information and process it,
		// e.g. last name, gender...

		sc.close(); //close the Scanner
	}
}

