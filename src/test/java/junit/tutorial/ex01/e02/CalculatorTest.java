package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void divide() {
		Calculator calculator = new  Calculator();
		
		try {
			calculator.divide(1,1);
			fail("例外が発生しませんでした");
		} catch (IllegalArgumentException e) {

			assertEquals("divide by zero.", e.getMessage(), "正しくありません");
		}
	

	}
}


