package sqd3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertEquals(5, result);
	}

	@Test
	void testSubtract() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(5, 3);
		assertEquals(2, result);
	}

	@Test
	void testMultiply() {
		Calculator calculate = new Calculator();
		int result = calculate.multiply(5, 3);
		assertEquals(15, result);
	}

}
