/**
 * 
 */
package com.capgemini;
import com.naipes.*;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;



/**
 * @author mizapata 
 * Ejercicios y juegos
 * version: 0.3
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String respuesta;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Elige opción introduciendo el nº correspondiente: ");
		System.out.println("1. Juego del Número ");
		System.out.println("2. Decodificar cadenas");
		System.out.println("3. Juego de cartas");
		respuesta = teclado.nextLine();

		if (respuesta.equals("1")) {

			JuegoDelNumero partida = new JuegoDelNumero();
			teclado.close();

			partida.inicializar();

			for (byte i = 1; i <= 10; i++) {

				partida.jugada(i);

			}

		} else if (respuesta.equals("2")) {

			DecodificarCadenas decodificar = new DecodificarCadenas();
			decodificar.inicializar();

		}else if(respuesta.equals("3")) {
			JuegoNaipes juego = new JuegoNaipes();
			juego.inicializar();
			
		}else {
			System.out.println("Vuelve a ejecutar e introduce un valor válido");
		}

	}

}
