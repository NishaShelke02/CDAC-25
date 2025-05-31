public class DayofWeek {
     public static void main(String[] args){
		int day = 6;

		switch (day) {
                    case 1:
                        System.out.println("Monday - weekday");
                        break;
                    case 2:
                        System.out.println("Tuesday - weekday");
                        break;
                    case 3:
                        System.out.println("Wednesday - weekday");
                        break;
                    case 4:
                        System.out.println("Thursday - weekday");
                        break;
                    case 5:			
                        System.out.println("Friday - Weekday");
			break;

		    case 6:
			System.out.println("Saturday - weekend");
                        break;
		    case 7:
			System.out.println("Sunday - weekend");
                        break;
		    default:
			System.out.println("Invalid day number");
                        break;
		    }
	}
}

//INPUT - 5
/*C:\Nishajava\Day 2\Ass 2\Section 2> java DayofWeek
Friday - Weekday

INPUT - 6

C:\Nishajava\Day 2\Ass 2\Section 2> javac DayofWeek.java

C:\Nishajava\Day 2\Ass 2\Section 2> java DayofWeek
Saturday - weekend
*/