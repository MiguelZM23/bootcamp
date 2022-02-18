package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ReyTest {
	Movimiento mov;
	Tablero tablero;
	Posicion pos;
	
	@BeforeEach
	void setUp() throws Exception {
	pos = new Posicion(4,2);
	tablero = new Tablero();
	tablero.rellenarTablero();
	//Quitamos el peon para que no nos de error
	tablero.findEscaque(pos).quitaPieza();
	mov = new Movimiento("D1D2");
	}

	@Test
	void test_EsValido() throws JuegoException {
		Pieza pieza = null;
		pieza = tablero.findEscaque(mov.getPosIni()).getPieza();
		assertTrue(pieza.esValido(mov, tablero));
	}

}
