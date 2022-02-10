package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Tablero implements Cloneable {
	
	private ArrayList<Pieza> piezas = new ArrayList<Pieza>();
	Rey rey = new Rey(Color.BLANCO);
		
	/*public Pieza escaque(int col, int fila) {
		
		hayPieza(col, fila);
		
		return rey;
	}
	public Pieza escaque(Posicion pos) {
		
		
		return rey;
	}*/
	
	public class Escaque{
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
				if (pieza != null) return true;
				return false;
			}
			
			public Pieza getPieza() {
				return pieza;
			}

			public void setPieza(Pieza pieza) {
				this.pieza = pieza;
			}
			
		}
	
	private boolean esValido(int i) {
		return true;
	}
	public boolean hayPieza(Posicion pos) {
		return true;
	}
	
	public boolean hayPieza(int col, int fila) {
		return true;
	}
	public void quitaPieza(int col, int fila) {
		
	}
	public void quitaPieza(Posicion pos) {
		
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

	
}
