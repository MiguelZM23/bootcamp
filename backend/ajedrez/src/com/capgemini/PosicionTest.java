package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PosicionTest {
	Posicion posicion;
	Posicion posicionb;
	
	
	@BeforeEach
	void setUp() throws Exception {
		posicion = new Posicion(1, 2);
		posicionb = new Posicion('A', '1');
	}

	@Test
	void testPosicionIntInt() {
		
		assertEquals(1, posicion.getCol());
		assertEquals(2, posicion.getFila());
	}

	@Test
	void testPosicionCharChar() {
		assertEquals(1, posicionb.getCol());
		assertEquals(1, posicionb.getFila());
		
	}

	@Test
	void testEqualsPosicion() {
		fail("Not yet implemented");
	}

	@Test
	void testGetFila() {
		fail("Not yet implemented");
	}

	@Test
	void testSetFila() {
		fail("Not yet implemented");
	}

	@Test
	void testGetColumna() {
		fail("Not yet implemented");
	}

	@Test
	void testSetColumna() {
		fail("Not yet implemented");
	}

}
