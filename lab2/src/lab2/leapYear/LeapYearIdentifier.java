package lab2.leapYear;

public class LeapYearIdentifier {
	int year;
	public LeapYearIdentifier(int year){
		this.year = year;
	}
	public boolean identifyLeapYear(int year){
		if(year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
}
