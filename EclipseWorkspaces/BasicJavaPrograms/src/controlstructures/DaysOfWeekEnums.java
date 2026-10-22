package controlstructures;


public class DaysOfWeekEnums {

	public enum Day {
	    MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY, SUNDAY 
	}
	
	public static void main(String[] args) {
		Day day = Day.MONDAY;

		switch (day) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> IO.println("Weekday");
			case SATURDAY, SUNDAY -> IO.println("Weekend");
			default -> IO.println("Unknown day");
		}
		
	}

}
