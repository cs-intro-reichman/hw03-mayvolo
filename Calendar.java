public class Calendar {
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
    static int dayOfWeek = 2; // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	

	public static void main(String args[]) {       
       int givenYear = Integer.parseInt(args[0]);
	 	while (year < givenYear) {
	 		advance();
        }	
        while (year == givenYear){
			if(dayOfWeek == 1) {
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			} else {
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}
            advance();
        }
    }

	// Advances the date and day-of-the-week.
    // Side effects: changes dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
        dayOfWeek = (dayOfWeek % 7) + 1; // Update day of the week
        dayOfMonth++;
		if(dayOfMonth > nDaysInMonth(month, year)) {
			dayOfMonth = 1;
			month++;
			if(month > 12) {
				month = 1;
				year++;
			}
		}
	 } 
	
	// Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if ((year % 4) != 0) {
            return false;
        } else {
            if((year % 100 == 0) && (year % 400!= 0)) {
                return false;
            } else {
                return true;
            }
        }
	}

	// Returns the number of days in the given month and year.
	private static int nDaysInMonth(int month, int year) {
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
	}
}
