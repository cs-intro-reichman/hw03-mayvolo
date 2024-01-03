
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for(int i = 1; i <= 12; i++) {
			int days = nDaysInMonth(i , year);
			System.out.println("Month " + i + " has " + days + " days");
		}
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		if ((year % 4) != 0) {
            return false;
        } else {
            if((year % 100 == 0) && (year % 400!= 0)) {
                return false;
            } else {
                return true;
            }
        }
		//return false;
	}
	 
	public static int nDaysInMonth(int month, int year) {
		int days;
		if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			days = 30;
		} else if (month == 2) {
			if(isLeapYear(year)) {
				days = 29;
			} else {
				days = 28;
			}
		} else {
			days = 31;
		}
		return days;
		//return 0;
	}
}

