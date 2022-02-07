package com.naipes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.naipes.Baraja.Naipe;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BarajaTest {

	@BeforeEach
	void setUp() throws Exception {
		Baraja mazo = new Baraja(TipoBaraja.ESPANOLA, 40);
		}

	
	@Test
	void testBaraja() {
		Baraja mazo = new Baraja(TipoBaraja.ESPANOLA, 40);
		ArrayList<Naipe> mazoTest = new ArrayList<Naipe>(40); 
		assertEquals(mazoTest.size(), mazo.numeroCartas);
	}

	@Test
	void testCreaMazo() {
		fail("Not yet implemented");
	}

	@Test
	void testBarajar() {
		fail("Not yet implemented");
	}

	@Test
	void testDameCarta() {
		fail("Not yet implemented");
	}

	@Test
	void testComparar() {
		fail("Not yet implemented");
	}

}
