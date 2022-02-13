package com.capgemini;

public class Peon extends Pieza{
	Peon peon;
	Color color;
	
	public Peon(Color color) {
		this.color = color;
	}
	/**
	 * Comprueba si el movimiento es válido.
	 */
	boolean esValido(Movimiento mov, Tablero tablero) {
		peon = new Peon(color);
		
		if(tablero.escaque.getPieza().equals(peon)) {
			
			if(mov.saltoVertical() == 1 && mov.deltaFila() == 1 && peon.color == Color.BLANCO) return true; 
			else if(mov.saltoVertical() == 1 && mov.deltaFila() == -1 && peon.color == Color.NEGRO) return true;
			else System.out.println("La pieza no se mueve o movimiento incorrecto");
		
		}
		
		return false;
	}
	
	private boolean avanza(Movimiento mov) {
		return true;
	}
	private boolean inicia (Posicion pos) {
		return true;
	}
	private boolean puedeComer(Movimiento mov, Tablero tablero) {
		return true;
	}
	private boolean necesitaPromocion(Posicion pos) {
		return true;
	}
	public void mover(Movimiento mov, Tablero tablero) {
		
	}
	void onPromocion(PromocionEventArgs event) {
		
	}
	public Color getColor() {
		return color;
	}
	
}
