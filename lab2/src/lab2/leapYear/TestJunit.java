package lab2.leapYear;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {
	int leapYear = 2054;
	LeapYearIdentifier ly = new LeapYearIdentifier(leapYear);
	
	@Test
	public void checkIfTrue(){
		assertEquals(true, ly.identifyLeapYear(leapYear));
	}
}
