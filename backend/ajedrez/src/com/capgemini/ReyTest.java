package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ReyTest {
	Movimiento mov;
	Movimiento mov2;
	Tablero tablero;
	Posicion pos;

	@BeforeEach
	void setUp() throws Exception {
		pos = new Posicion(5, 2);
		tablero = new Tablero();
		tablero.rellenarTablero();
		// Quitamos el peon para que no nos de error
		tablero.findEscaque(pos).quitaPieza();
		//Movimiento correcto
		mov = new Movimiento("E1E2");
		//Movimiento incorrecto
		mov2 = new Movimiento("E1E4");
	}

	@Test
	void test_EsValido() throws JuegoException {
		Pieza pieza = null;
		pieza = tablero.findEscaque(mov.getPosIni()).getPieza();
		assertTrue(pieza.esValido(mov, tablero));
		assertFalse(pieza.esValido(mov2, tablero));
	}

}
