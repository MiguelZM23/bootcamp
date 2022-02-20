package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class CaballoTest {
	Movimiento mov;
	Movimiento mov2;
	Tablero tablero;
	Posicion pos;
	
	@BeforeEach
	void setUp() throws Exception {
		pos = new Posicion(5, 2);
		tablero = new Tablero();
		tablero.rellenarTablero();		
		//Movimiento correcto
		mov = new Movimiento("B1C3");
		//Movimiento incorrecto
		mov2 = new Movimiento("B1C4");
	}

	@Test
	void test_EsValido() throws JuegoException {
		Pieza pieza = null;
		pieza = tablero.findEscaque(mov.getPosIni()).getPieza();
		assertTrue(pieza.esValido(mov, tablero));
		assertFalse(pieza.esValido(mov2, tablero));
	}

}
