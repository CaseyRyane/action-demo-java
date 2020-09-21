import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void AddPositive() {
		Calculator c = new Calculator();
		double result = c.add(2, 5);
		assertEquals(7.0, result);
	}
	
	@Test
	void AddNegative() {
		Calculator c = new Calculator();
		double result = c.add(-2, -5);
		assertEquals(-7.0, result);
	}

}
