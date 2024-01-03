
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	public static void main(String args[]) {
	    int debugDaysCounter = 0; 
		System.out.println(dayOfMonth + "/" + month + "/" + year);
		int specialDay = 0;
	 	while (year <= 1999) {
	 		advance();
			if (year >= 2000) {
				break; // Exit the loop if the year is 2000 or greater
			}	
			if(dayOfWeek == 1) {
					System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
				if(dayOfMonth == 1){
						specialDay++;
					}
				} else {
					System.out.println(dayOfMonth + "/" + month + "/" + year);
				}
	 		debugDaysCounter++;
	 		

	 		/*if (debugDaysCounter == 1550) { 
	 			break;
	 		} */
        }
		System.out.println("During the 20th century, " + specialDay + " Sundays fell on the first day of the month");
	 }
	
	// Advances the date and day-of-the-week.
    // Side effects: changes dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		dayOfMonth++;
		if(dayOfMonth > nDaysInMonth(month, year)) {
			dayOfMonth = 1;
			month++;
			if(month > 12) {
				month = 1;
				year++;
			}
		}
		dayOfWeek++;
		if(dayOfWeek > 7) {
			dayOfWeek = 1;
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
