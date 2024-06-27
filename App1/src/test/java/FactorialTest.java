import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		assertEquals(120, Factorial.getFactorial(5));
	}

}
