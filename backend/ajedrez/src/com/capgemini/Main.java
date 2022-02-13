package com.capgemini;
/**
 * Aplicación Ajedrez
 * @author mizapata
 *
 */

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.run();
		
		System.out.println("Ajedrez");
		
		
	}

	private void run() {
		// TODO Auto-generated method stub
		Juego juego = new Juego();
		juego.inicializar();
	}
	
	

}
