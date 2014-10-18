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

}
