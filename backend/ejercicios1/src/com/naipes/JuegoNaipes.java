package com.naipes;

import java.util.Scanner;

import com.naipes.Baraja.Naipe;

/**
 * @author mizapata
 *
 */
public class JuegoNaipes {

	Scanner teclado = new Scanner(System.in);
	Naipe carta1;
	Naipe carta2;
	Naipe cartaGanadora;

	public void inicializar() {
		Baraja mazo;
		System.out.println("***Juegos de cartas***");
		System.out.println("¿Baraja 1.española o 2.francesa?");
		byte respuesta = teclado.nextByte();
		System.out.println("Número de cartas(escribe el nº)?: 40, 52");
		byte numCartas = teclado.nextByte();
		if (respuesta == 1) {
			mazo = new Baraja(TipoBaraja.ESPANOLA, numCartas);
		} else {
			mazo = new Baraja(TipoBaraja.FRANCESA, numCartas);
		}

		mazo.creaMazo(numCartas);
		mazo.barajar();
		carta1 = mazo.dameCarta();
		carta2 = mazo.dameCarta();
		
		System.out.println(carta1.getNumero());
		System.out.println(carta1.getPalo());
		System.out.println(carta2.getNumero());
		System.out.println(carta2.getPalo());
		
		cartaGanadora = mazo.comparar(carta1, carta2);
		
		if (cartaGanadora.getNumero() == 0) System.out.println("Empate");
		else {
			System.out.println("Carta Ganadora:");
			System.out.println(cartaGanadora.getNumero());
			System.out.println(cartaGanadora.getPalo());
			
		};
		
		// Naipe mano1[] = mazo.barajar(5);

		// Naipe mano2[] = mazo.barajar(5);
		/*
		 * System.out.println("La mano uno es la siguiente:"); for (int i=0;
		 * i<mano1.length; i++) { System.out.println(mano1[i].numero);
		 * System.out.println(mano1[i].palo); }
		 * System.out.println("La mano dos es la siguiente:"); for (int i=0;
		 * i<mano2.length; i++) { System.out.println(mano2[i].numero);
		 * System.out.println(mano2[i].palo); }
		 */
	}

}
