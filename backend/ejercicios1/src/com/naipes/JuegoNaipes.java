package com.naipes;

import java.util.Scanner;

import com.naipes.Baraja.Naipe;

public class JuegoNaipes {
	
	Scanner teclado = new Scanner(System.in);
	
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
		Naipe mano1[] = mazo.barajar(5);
		Naipe mano2[] = mazo.barajar(5);
		
		System.out.println("La mano uno es la siguiente:");
		for (int i=0; i<mano1.length; i++) {
			System.out.println(mano1[i].numero);
			System.out.println(mano1[i].palo);
		}
		System.out.println("La mano dos es la siguiente:");
		for (int i=0; i<mano2.length; i++) {
			System.out.println(mano2[i].numero);
			System.out.println(mano2[i].palo);
		}
		
	}
	
	
}
