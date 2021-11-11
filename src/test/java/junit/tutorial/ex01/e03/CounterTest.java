package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	void increment() {
		Counter counter = new Counter();

		int result = counter.increment();
		assertEquals(1, result, "1回目の実行で1が出ないエラー");

	}

	@Test
	void increment2() {
		Counter counter = new Counter();

		int result = counter.increment();
		int result2 = counter.increment();
		assertEquals(2, result2, "2回目の実行で2が出ないエラー");

	}

	@Test
	void increment3() {
		Counter counter = new Counter();
		
		for(int i =0 ; i<50; i++) {
			counter.increment();

		}
		int result3 = counter.increment();
		assertEquals(51, result3, "51回目の実行で51が出ないエラー");

	}

}
