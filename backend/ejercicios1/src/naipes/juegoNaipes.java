package naipes;

import java.util.Scanner;

public class juegoNaipes {
	Jugador jugador1 = new Jugador();
	Jugador jugador2 = new Jugador();
	
	Scanner teclado = new Scanner(System.in);
	
	public void inicializar() {
		System.out.println("***Juegos de cartas***");
		System.out.println("�Baraja 1.espa�ola o 2.francesa?");
		byte respuesta = teclado.nextByte();
		System.out.println("N�mero de cartas(escribe el n�)?: 40, 50, 52(con comodines)");
		byte numCartas = teclado.nextByte();
		if (respuesta == 1) {
			Baraja mazo = new Baraja("Espanola", numCartas);
		} else { 
			Baraja mazo = new Baraja("Francesa", numCartas);
		}
		
	}
	
	
}
