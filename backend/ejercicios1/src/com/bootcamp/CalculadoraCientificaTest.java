package com.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CalculadoraCientificaTest {
	CalculadoraCientifica calculadora;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		calculadora = new CalculadoraCientifica();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Nested
	class Dividir {

		@Test
		void dividir_enteros() throws Exception {
			assertEquals(1.5, calculadora.dividir(3,2));
		}
		@Test
		void dividir_by_Zero() {
			assertThrows(ArithmeticException.class,() -> calculadora.dividir(3.0, 0));
		}
		@Test
		void dividir_no_permitido() {
			assertThrows(ArithmeticException.class,() -> calculadora.dividir(3.0, 2));
		}
	
	}
	
}
