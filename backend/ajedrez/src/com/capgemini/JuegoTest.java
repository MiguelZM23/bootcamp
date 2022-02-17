package com.capgemini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class JuegoTest {
	//Tablero tablero = new Tablero();
	Posicion pos;
	Juego juego = new Juego();
	Movimiento mov;
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		//tablero.rellenarTablero();
		
		mov = new Movimiento("A2A3");
		pos = new Posicion (1,3);
		juego.inicializar();
		
	}

	@Test
	void testMover() throws JuegoException {
		
		juego.jugada("A2A3");
		juego.mover(mov);
		Pieza pieza = new Caballo(Color.BLANCO);
		try {
			assertEquals(pieza, juego.getTablero().findEscaque(pos).getPieza());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}

}
