/**
 * 
 */
package com.bootcamp;
import com.capgemini.juegoAdivinaNumeroYTest.Juego;
import com.capgemini.juegoAdivinaNumeroYTest.JuegoException;
import com.naipes.*;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.junit.validator.PublicClassValidator;



/**
 * @author mizapata 
 * Ejercicios y juegos
 * version: 0.3
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int x = 5;

		double y = 5;

		y *= x++;

		System.out.println(x);
		Main app = new Main();
		app.run();
		String respuesta;
		Scanner teclado = new Scanner(System.in);

		
		
		
		
		
		System.out.println("Elige opción introduciendo el nº correspondiente: ");
		System.out.println("1. Juego del Número ");
		System.out.println("2. Decodificar cadenas");
		System.out.println("3. Juego de cartas");
		System.out.println("4. Juego del Número con Clase");
		System.out.println("5. Calculadora");
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
			//decodificar.inicializar();

		}else if(respuesta.equals("3")) {
			JuegoNaipes juego = new JuegoNaipes();
			juego.inicializar();
			
		}else if(respuesta.equals("4")) {
			app.juegoConClase();
			
		}else if(respuesta.equals("5")) {
			Calculadora calculadora = new Calculadora();
			calculadora.leerFichero();
			calculadora.escribirFichero();
			
		}else {
			System.out.println("Vuelve a ejecutar e introduce un valor válido");
		}

	}

	private void run() {
		
	}
	
	public void juegoConClase() {
		Scanner teclado = new Scanner(System.in);

		try {
			Juego<String> juego = new com.capgemini.juegoAdivinaNumeroYTest.JuegoAdivinaNumero();
			juego.inicializar();
			for (int intentos = 1; intentos <= 10; intentos++) {
				System.out.print("Dame tu número del 1 al 100 (" + (juego.getJugada() + 1) + " de 10): ");

					juego.jugada(teclado.nextLine());
					System.out.println(juego.getResultado());
					if (juego.getFinalizado())
						break;

			}
		} catch (JuegoException e) {
			e.printStackTrace();
		}

		teclado.close();
	}

}
