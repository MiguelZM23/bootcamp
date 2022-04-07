package com.bootcamp.juegoAdivinaNumeroYTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.bootcamp.CalculadoraCientifica;

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
				() -> assertTrue(0 < juego.numeroBuscado && juego.numeroBuscado <=100, "rango entre 1 y 100")
				);
	}
	
	@Nested
	class Jugadas {
		@Test
		void test_es_mayor() throws JuegoException {
			juego.jugada(51);
			assertAll("Jugada", 
			() -> assertEquals("Mi número es menor.", juego.getResultado()),
			()-> assertEquals(1, juego.getJugada())
			
			);
		}
		@Test
		void test_es_menor() throws JuegoException {
			juego.jugada(49);
			assertAll("Jugada", 
			() -> assertEquals("Mi número es mayor.", juego.getResultado()),
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
		@Test
		void test_terminado() throws JuegoException{
			for (int i=1; i<=10; i++) {
				juego.jugada(10);
			}
			assertAll("Jugada", 
			() -> assertEquals(true, juego.getFinalizado()),
			() -> assertEquals("Upsss! Se acabaron los intentos, el número era el 50", juego.getResultado())
			);
		}
		@Test
		void test_exception_jugadas() throws JuegoException{
			for (int i=1; i<=15; i+=1) {
				juego.jugada(10);
			}
			assertThrows(JuegoException.class, ()-> juego.getFinalizado());
		
	}
		@Test
		void test_exception_no_es_un_numero() throws JuegoException{
			juego.jugada("a");
			assertThrows (JuegoException.class, ()-> juego.getFinalizado());
		}
		
		@Test
		void test_exception_negativo() throws JuegoException{
			juego.jugada(-1);
			assertThrows (JuegoException.class, ()-> juego.getFinalizado());
		}
		
		
		


	}
}
