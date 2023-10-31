package DigitalRootCalculatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import DigitalRootCalculator.DigitalRootCalculator;

public class DigitalRootCalculatorTest {

	@Test
	@DisplayName("Teste para número com dois dígitos")
	public void testDigitalRootTwoDigitNumber() {
		assertEquals(7, DigitalRootCalculator.digitalRoot(16));
	}

	@Test
	@DisplayName("Teste para número com três dígitos")
	public void testDigitalRootThreeDigitNumber() {
		assertEquals(6, DigitalRootCalculator.digitalRoot(942));
	}

	@Test
	@DisplayName("Teste para número grande")
	public void testDigitalRootLargeNumber() {
		assertEquals(6, DigitalRootCalculator.digitalRoot(132189));
	}

	@Test
	@DisplayName("Teste para número grande")
	public void testDigitalRootLargeNumber2() {
		assertEquals(2, DigitalRootCalculator.digitalRoot(493193));
	}

	@Test
	@DisplayName("Teste para número negativo")
	public void testDigitalRootNegativeNumber() {
		assertEquals(-1, DigitalRootCalculator.digitalRoot(-123));
	}

	@Test
	@DisplayName("Teste passando null")
	public void testDigitalRootNull() {
		assertEquals(-1, DigitalRootCalculator.digitalRoot(null));
	}
}
