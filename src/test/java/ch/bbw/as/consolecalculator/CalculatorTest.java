package ch.bbw.as.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Class Calculator
 * 
 * 
 * @author Alex Schaub
 * @version 0.0.1
 */
public class CalculatorTest {
	private Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}

	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25, 10) == 15);
	}

}
