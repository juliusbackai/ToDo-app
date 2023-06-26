package com.bezkoder.spring.jpa.postgresql;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class SpringBootJpaPostgresqlApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.sum(1,1));
		assertNotEquals(3, calculator.sum(1,1));
	}

}
