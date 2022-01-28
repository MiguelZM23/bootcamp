/**
 * 
 */
package com.capgemini;

import java.util.Random;
import java.util.Scanner;

/**
 * @author mizapata
 * Adivina el número 
 * version: 0.1
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejercicio 1: Adivina el número
		var rnd = new Random();
		int num = (int) rnd.nextInt(100);
		String cad;
		//Declarado null porque necesito inicializarlo para poder cerrarlo fuera del bucle for
		//Pendiente de encontrar mejor solución para cerrar teclado.
		Scanner teclado = null;

		System.out.println("*****Adivina el número****");
	
		for (byte i = 1; i <= 10; i++) {

			System.out.println("Introduce un número del 1 al 100.");
			System.out.println("Intento " + i + "/10");

			teclado = new Scanner(System.in);
			//try para capturar la excepcion al introducir datos el usuario
			try {
				cad = teclado.nextLine();

				System.out.println("Has elegido el " + cad + " ¡Suerte!...");
				System.out.println("Calculando...");
				int cad2 = Integer.parseInt(cad);

				if (cad2 == num) {
					System.out.println("¡Acertaste!");

					System.out.println("Fin del programa, ¡lo has conseguido!");
					break;
				} else if (i == 10) {
					System.out.println("Fin del programa, no lo has conseguido");
					break;
				}

				System.out.println("¡Fallaste!, prueba de nuevo");
				
				if (cad2 > num)
					System.out.println("Prueba con un número menor");
				else
					System.out.println("Prueba con un número mayor");
			
			} catch (NumberFormatException e) {
				System.out.println("Revisa el concepto que tienes de numero");

			}

		}
		
		teclado.close();

	}

}
