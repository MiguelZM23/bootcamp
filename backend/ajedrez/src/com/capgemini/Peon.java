package com.capgemini;

public class Peon extends Pieza{
	Peon peon;
	Color color;
	
	public Peon(Color color) {
		this.color = color;
	}
	/**
	 * Comprueba si el movimiento es válido.
	 * @throws JuegoException 
	 */
	boolean esValido(Movimiento mov, Tablero tablero) throws JuegoException {
		Color colorPiezaEscaque = Color.NEGRO;
		Pieza pieza = tablero.findEscaque(mov.getPosFin()).getPieza();
		peon = new Peon(color);
		
		if (pieza != null)
			colorPiezaEscaque = pieza.getColor();

		if (tablero.findEscaque(mov.getPosIni()).getPieza().getClass() == Peon.class) {
			
			if (peon.getColor() == colorPiezaEscaque) {
				System.out.println("No te puedes comer una pieza de tu color");
				return false;
			}
			
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
