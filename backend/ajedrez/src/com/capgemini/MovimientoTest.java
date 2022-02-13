package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MovimientoTest {
	Movimiento mov;
	Movimiento mov2;
	Movimiento mov3;
	Posicion posIni;
	Posicion posFin;
	
	@BeforeEach
	void setUp() throws Exception {
		mov = new Movimiento("A1A4");
		mov2 = new Movimiento("A1C1");
		mov3 = new Movimiento("A1B2");
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
	void test_es_vertical() throws JuegoException {
		assertTrue(mov.esVertical());
		assertFalse(mov.esHorizontal());
		assertFalse(mov.esDiagonal());
	}
	
	@Test
	void test_es_horizontal() throws JuegoException {
		assertTrue(mov2.esHorizontal());
		assertFalse(mov2.esVertical());
		assertFalse(mov2.esDiagonal());
	}
	
	@Test
	void test_es_diagonal() throws JuegoException {
		assertFalse(mov3.esHorizontal());
		assertFalse(mov3.esVertical());
		assertTrue(mov3.esDiagonal());
	}
	
	@Test
	void test_delta_fila() {
		assertEquals(1, mov.deltaFila());
		assertEquals(0, mov2.deltaFila());
		assertEquals(1, mov3.deltaFila());
	}
	
	@Test
	void test_delta_col() {
		assertEquals(0, mov.deltaColumna());
		assertEquals(1, mov2.deltaColumna());
		assertEquals(1, mov2.deltaColumna());
	}
	
	
	
	

	

	

}
