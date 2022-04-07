package com.bootcamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PeonTest {
	Movimiento mov;
	Movimiento mov2;
	Tablero tablero;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		tablero = new Tablero();
		tablero.rellenarTablero();
		//Movimiento correcto
		mov = new Movimiento("E2E3");
		//Movimiento incorrecto
		mov2 = new Movimiento("E2E5");
	}
	
	@Test
	void test_EsValido() throws JuegoException {
		Pieza pieza = null;
		
		pieza = tablero.findEscaque(mov.getPosIni()).getPieza();
		assertTrue(pieza.esValido(mov, tablero));
		assertFalse(pieza.esValido(mov2, tablero));
	}
	

}
