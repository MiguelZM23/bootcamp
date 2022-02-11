package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Tablero implements Cloneable {

	public ArrayList<Escaque> piezas = new ArrayList<Escaque>();
	Escaque escaqueDummy = new Escaque(0, 0);
	int prueba = 1;
	Rey rey = new Rey(Color.BLANCO);

	/*
	 * public Pieza escaque(int col, int fila) {
	 * 
	 * hayPieza(col, fila);
	 * 
	 * return rey; } public Pieza escaque(Posicion pos) {
	 * 
	 * 
	 * return rey; }
	 */

	public void rellenarTablero() {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				piezas.add(new Escaque(i, j));
			}

		}

	}

	public class Escaque {
		int col;
		int fila;
		Color color;
		Posicion pos;
		Pieza pieza;

		public Escaque(int col, int fila) {
			this.col = col;
			this.fila = fila;
		}

		public Escaque(Posicion pos) {
			this.pos = pos;
		}

		public boolean hayPieza() {
			if (pieza != null)
				return true;
			return false;
		}

		public Pieza getPieza() {
			return pieza;
		}

		public void setPieza(Pieza pieza) {
			this.pieza = pieza;
		}


	private boolean esValido(int i) {
		return true;
	}

	public boolean hayPieza(Posicion pos) {
		escaqueDummy = new Escaque(pos);
		if (piezas.contains(escaqueDummy) && escaqueDummy.getPieza() != null) 
			return true;
		return false;
	}

	public boolean hayPieza(int col, int fila) throws JuegoException {
		Posicion pos = new Posicion(col, fila);
		return hayPieza(pos);
	}

	public void quitaPieza(int col, int fila) {
		
	}

	public void quitaPieza(Posicion pos) {
		escaqueDummy = new Escaque(pos);
		Escaque escaqueSeleccionado;
		if (hayPieza(pos) == false) System.out.println("No hay pieza, no puedo quitarla");
		//if (escaqueSeleccionado = (piezas.contains(escaqueDummy))) escaqueDummy.getPieza() != null
		
	}

	public void mover(Movimiento mov) {

	}

	public Object clone() {
		Object object = "";
		return object;
	}

	public Color colorEscaque(int col, int fila) {
		Color color = Color.BLANCO;
		return color;
	}

	public boolean hayPiezasEntre(Movimiento mov) {
		return true;
	}

	public ArrayList<Escaque> getPiezas() {
		return piezas;
	}

	/*public void setPiezas(ArrayList<Escaque> piezas) {
		this.piezas = piezas;
	}*/

}
	}
