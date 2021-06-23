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
	public void testSummeZweiNegativeIsOk() {
		assertTrue(testee.summe(-200, -150) == -350);
	}

	@Test
	public void testSummePostiveZahlMitNullIsOk() {
		assertTrue(testee.summe(0, 25) == 25);
	}

	@Test
	public void testSummeNegativeZahlMitNullIsOk() {
		assertTrue(testee.summe(0, -25) == -25);
	}

	@Test
	public void testSummeGleichNullIsOk() {
		assertTrue(testee.summe(10, -10) == 0);
	}

	@Test
	public void testSummeEinSummandIstMaxIntIsOk() {
		assertTrue(testee.summe(Integer.MAX_VALUE, 50) == -2147483599);
	}

	@Test
	public void testSummeEinSummandIstMinIntUndDerAndereIstEineNegativeZahlIsOk() {
		assertTrue(testee.summe(Integer.MIN_VALUE, -50) == 2147483598);
	}

	/**
	 * 	Um eine Private-Methode zu testen muss man von Github
	 * 	die .jar-Datei dp4j-1.2-jar-with-dependencies.jar herunterladen.
	 * 	Diese muss man die in den CLASSPATH des Projekts einfuegen.
	 * 	Danach kann man den Test so schreiben, als waere die Private-Methode eine Public-Methode.
	 * 	Die heruntergeladene .jar-Datei sorgt dafuer, dass der Test dann funktioniert.
 	 */
	@Test
	public void testSummePrivate() {
		assertTrue(true);
	}

	@Test
	public void testSummeAlsSatzFunktioniert() {
		assertTrue(testee.resultatSumme(10, 25).equals("Die Summe ist: 35."));
	}

	@Test
	public void testSummeAlsSatzOhnePunktFunktioniert() {
		assertTrue(testee.resultatSummeOhnePunkt(10, 25).equals("Die Summe ist: 35"));
	}

	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25, 10) == 15);
	}

}
