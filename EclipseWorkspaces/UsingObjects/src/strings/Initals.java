package strings;

public class Initals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		name = "David Beckham";
		
		
		
		IO.println(name);
		
		char FirstInitial ;
		FirstInitial = (name.charAt(0));
		
		char SecondInitial ;
		SecondInitial = (name.charAt((name.indexOf(" "))+1));
		
		IO.println(FirstInitial + "" + SecondInitial );
		IO.println(FirstInitial.toLowerCase());
		IO.println(FirstInitial + "" + SecondInitial + "@email.dmu.ac.uk");

		
		
	}

}
