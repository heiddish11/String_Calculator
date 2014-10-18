package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber(){
		asserEquals(1, Calculator.add("1"));	
	}
	@Test
        public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}
        public void testUnknownNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testNewLineAccepted() {
		assertEquals(6, Calculator.add("1,2\n3"));
	}
	@Test
	public void testAnyDelimiterAccepted() {
		assertEquals(3, Calculator.add("//:\n;2"));
	}
	@Test
	public void testNegativesNotAccepted() {
		try{
			Calculator.add("-1, 2, 3");
			fail("Exception expected.");
		}
		catch(RuntimeException ex) {
			assertEquals("Negatives not allowed: -1, -2", ex.getMessage());
		}
	}
	@Test
	public void testIgnoreBiggerThan1000() {
		assertEquals(20, Calculator.add("10,10,1001"));
	}
}
