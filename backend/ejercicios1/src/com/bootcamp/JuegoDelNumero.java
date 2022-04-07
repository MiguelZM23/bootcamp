package com.bootcamp;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class JuegoDelNumero {
	String cad;
	int num;

	public void inicializar() {
		JOptionPane.showMessageDialog(null, "*****Adivina el número*****");
		// Ejercicio 3: Adivina el número
		var rnd = new Random();
		num = (int) rnd.nextInt(100);

	};

	public void jugada(byte i) {

		// try para capturar la excepcion al introducir datos el usuario
		try {
			// cad = teclado.nextLine();
			cad = JOptionPane.showInputDialog("Introduce un número del 1 al 100 \n Intento " + i + "/10");

			JOptionPane.showMessageDialog(null, "Has elegido el " + cad + "!Suerte... \n Calculando...");

			int cad2 = Integer.parseInt(cad);

			if (cad2 == num) {
				JOptionPane.showMessageDialog(null, "¡Acertaste! \n Fin del programa, ¡lo has conseguido!");
				
				System.exit(0);
			} else if (i == 10) {
				JOptionPane.showMessageDialog(null, "Fin del programa, no lo has conseguido");
				System.exit(0);
			}

			if (cad2 > num)
				JOptionPane.showMessageDialog(null, "¡Fallaste!, prueba de nuevo \n Prueba con un número menor");
			else
				JOptionPane.showMessageDialog(null, "¡Fallaste!, prueba de nuevo \n Prueba con un número mayor");

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Revisa el concepto que tienes de número");

		}

	};

}
