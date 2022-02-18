package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.capgemini.Tablero.Escaque;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class TableroTest {
	Tablero tablero;
	Escaque escaque;
	Juego juego;
	Posicion pos;

	@BeforeEach
	void setUp() throws Exception {
		juego = new Juego();
		tablero = new Tablero();
		tablero.rellenarTablero();
		escaque = tablero.new Escaque(1,3);
		pos = new Posicion(1,3);

		Rey rey = new Rey(Color.BLANCO);

	}

	@Test
	void test_hayPieza() throws JuegoException {
		assertFalse(tablero.findEscaque(3,4).hayPieza());
		assertTrue(tablero.findEscaque(1,2).hayPieza());
	}

	@Test
	void test_tamaño_tablero() {
		//tablero.piezas.forEach((n) -> System.out.println(n.getPieza()));
		assertEquals(64, tablero.piezas.size());

	}
	
	@Test
	void test_clone() throws CloneNotSupportedException {
		Tablero tableroCopy = new Tablero();
		tableroCopy = tablero.clone();
		//tableroCopy.piezas.forEach((n) -> System.out.println(n.getPieza()));
	}
	
	@Test
	void test_findEscaque() throws JuegoException {
			
		assertEquals(escaque, tablero.findEscaque(pos, tablero));
	}

}
