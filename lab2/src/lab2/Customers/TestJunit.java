package lab2.Customers;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestJunit {
	@Test
	public void checkTaxes(){
		TaxOnSalary person = new TaxOnSalary(true);
		person.inputSalary();
		assertEquals(person.getPANSubmitted() == true ? 0.0 : person.getSalary() * 0.05, person.calculateTax(), 0.01);
	}
}
