package com.capgemini;
/**
 * Aplicación Ajedrez
 * @author mizapata
 *
 */

public class Main {

	public static void main(String[] args) throws JuegoException {
		Main app = new Main();
		app.run();
		
		System.out.println("Ajedrez");
		
		
	}

	private void run() throws JuegoException {
		// TODO Auto-generated method stub
		
		
		Juego juego = new Juego();
		juego.inicializar();
	}
	
	

}
