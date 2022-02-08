package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	Movimiento mov;
	Posicion posIni;
	Posicion posFin;
	
	@BeforeEach
	void setUp() throws Exception {
		mov = new Movimiento("A1A4");
		posIni = new Posicion(1,1);
		posFin = new Posicion(1,4);
	}
	
	@Test
	void test_Movimiento_constructor() {
		assertEquals(posIni.getCol(), mov.getPosIni().getCol());
		assertEquals(posIni.getFila(), mov.getPosIni().getFila());
		assertEquals(posFin.getCol(), mov.getPosFin().getCol());
		assertEquals(posFin.getFila(), mov.getPosFin().getFila());
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
