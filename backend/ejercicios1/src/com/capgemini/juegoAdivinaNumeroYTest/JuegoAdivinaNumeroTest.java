package com.capgemini.juegoAdivinaNumeroYTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.capgemini.CalculadoraCientifica;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class JuegoAdivinaNumeroTest {
	JuegoAdivinaNumero juego;
	
	@BeforeEach
	void setUp() throws Exception {
		juego = new JuegoAdivinaNumero();
		juego.numeroBuscado = 50;
	}
	
	
	@Test
	void test_Constructor() {
		assertNotNull(new JuegoAdivinaNumero());
	}

	@Test
	void test_Inicializar() {
		juego.numeroBuscado = -1;
		juego.inicializar();
		assertAll("Inicializar", 
				() -> assertEquals("Pendiente de empezar", juego.getResultado()),
				() -> assertEquals(0, juego.getJugada()),
				() -> assertEquals(0 < juego.numeroBuscado && juego.numeroBuscado <=100, juego.getResultado(), "rango entre 1 y 100")
				);
	}
	
	@Nested
	class Jugadas {
		@Test
		void test_es_mayor() throws JuegoException {
			juego.jugada(51);
			assertAll("Jugada", 
			() -> assertEquals("Mi n�mero es menor.", juego.getResultado()),
			()-> assertEquals(1, juego.getJugada())
			
			);
		}
		@Test
		void test_es_menor() throws JuegoException {
			juego.jugada(49);
			assertAll("Jugada", 
			() -> assertEquals("Mi n�mero es mayor.", juego.getResultado()),
			()-> assertEquals(1, juego.getJugada())
			
			);
		}
		@Test
		void test_es_igual() throws JuegoException {
			juego.jugada(50);
			assertAll("Jugada", 
			() -> assertEquals("Bieeen!!! Acertaste.", juego.getResultado()),
			()-> assertEquals(1, juego.getJugada())
			
			);
		}
	}


}