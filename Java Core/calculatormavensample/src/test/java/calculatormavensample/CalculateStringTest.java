package calculatormavensample;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateStringTest {

	@Test
	public void test_Calculate_GivenEmptyString_ShouldReturnZeroAsNumber() {
		CalculatorString cal=new CalculatorString();
		int result=cal.calculateString("");
		assertEquals(0,result);
		
	}

}
