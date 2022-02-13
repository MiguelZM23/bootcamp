package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Tablero.Escaque;

class TableroTest {
	Tablero tablero;
	Escaque escaque;
	Escaque escaque2;
	
	@BeforeEach
	void setUp() throws Exception {
	tablero = new Tablero();
	tablero.rellenarTablero();
	
	Rey rey = new Rey(Color.BLANCO);
	
	}

	@Test
	void test_hayPieza() {
		assertFalse(escaque.hayPieza());
		assertTrue(escaque2.hayPieza());
	}
	
	@Test
	void test_tamaño_tablero(){
		tablero.piezas.forEach((n)-> System.out.println(n.getPieza()));
		assertEquals(64, tablero.piezas.size());
		
	}

}
