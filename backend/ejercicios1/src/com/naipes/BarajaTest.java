package com.naipes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import com.naipes.Baraja.Naipe;

import junit.framework.Assert;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class BarajaTest {
	Baraja mazo;
	Baraja.Naipe carta1;
	Baraja.Naipe carta2;
	@BeforeEach
	void setUp() throws Exception {
		mazo = new Baraja(TipoBaraja.ESPANOLA, 40);
		
		}

	
	@Test
	void testBaraja() {
		Baraja mazo = new Baraja(TipoBaraja.ESPANOLA, 40);
		ArrayList<Naipe> mazoTest = new ArrayList<Naipe>(40); 
		assertEquals(mazoTest.size(), mazo.getNumeroCartas());
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
		Naipe carta1 = new Baraja.Naipe(Palo.BASTOS, 5);
		Naipe carta2 = new Baraja.Naipe(Palo.BASTOS, 8);
		assertTrue(carta2.equals(mazo.comparar(carta1, carta2)));
		assertTrue(carta2.getPalo() == mazo.comparar(carta1, carta2).getPalo());
		assertTrue(carta2.getNumero() == mazo.comparar(carta1, carta2).getNumero());
	}
	
	@Test
	void testReferencias() {
		Naipe carta1 = new Baraja.Naipe(Palo.BASTOS, 5);
		Naipe carta2 = new Baraja.Naipe(Palo.BASTOS, 8);
		assertTrue(carta2 == mazo.comparar(carta1, carta2));
	}

}
