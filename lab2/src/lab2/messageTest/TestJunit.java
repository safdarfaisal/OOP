package lab2.messageTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	String message = "Hello World";
	Message messageUtil = new Message(message);
	@Test
	public void testPrintMessage(){
		assertEquals(message, messageUtil.printMessage());
	}
}
