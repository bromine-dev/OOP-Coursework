package primitives;


public class Converter {

	public static void main(String[] args) {
		//declare two variables of type int
		double f, c;
		//assign 21 to c
		c = 21;
		//assign the result of the formula to f
		f = c*9/5+32;
		//print out the results
		System.out.println(c + " degrees Centigrade = " 
				+ f + " degrees Fahrenheit");
		
		/* It turns out that as of Java 25 you can more easily
		 * print to the standard output via the IO class.
		 * Try replacing System.out above with IO i.e. IO.println(...)
		 * 
		 * In general where you see System.out.println you may use
		 * IO.println - both do the same thing.
		 */

	}

}
