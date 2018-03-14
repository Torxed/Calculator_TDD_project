package calctests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import calclogic.CalcLogic;

class CalcTests {
	
	public static CalcLogic calc;
	
	@BeforeAll
	static void Init() {
		calc = new CalcLogic();
	}

	@Test
	void testAddition_additionCheckResult() {
		
		double actual = calc.add(2.5d, 5d);
		
		assertEquals(7.5d, actual, 0.01);
		
	}
	
	@Test
	void testSubtraction_subtractionCheckResult() {
		
		double actual = calc.sub(4.5d, 5d);
		
		assertEquals(-0.5d, actual, 0.01);
		
	}
	
	@Test
	void testDivision_divisionCheckResult() {
		
		double actual = calc.div(20.5d, 2d);
		
		assertEquals(10.25d, actual, 0.01);
		
	}
	
	@Test
	void testMultiplication_multiplicationCheckResult() {
		
		double actual = calc.multi(20d, 2d);
		
		assertEquals(40d, actual, 0.01);
		
	}
	
	@Test
	void testModulus_modulusCheckResult() {
		
		double actual = calc.mod(10d, 3d);
		
		assertEquals(1d, actual, 0.01);
		
	}

}
