package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Tablero implements Cloneable {

	public ArrayList<Escaque> piezas = new ArrayList<Escaque>();
	Escaque escaque;

	public void rellenarTablero() {
		Pieza pieza = null;		
			
		Color color = Color.BLANCO;
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				
			if(j <= 2 || j >=7) {
			  
				color = Color.BLANCO;
				if(i ==1 && j==1 || i == 8 && j == 1) pieza = new Torre(color);
				if(i ==2 && j==1 || i == 7 && j == 1) pieza = new Caballo(color);
				if(i ==3 && j==1 || i == 6 && j == 1) pieza = new Alfil(color);
				if(i ==4 && j==1) pieza = new Rey(color);
				if(i ==5 && j==1) pieza = new Dama(color);
				if(i <=8 && j==2) pieza = new Peon(color);
				
				color = Color.NEGRO;
				if(i ==1 && j==8 || i == 8 && j == 8) pieza = new Torre(color);
				if(i ==2 && j==8 || i == 7 && j == 8) pieza = new Caballo(color);
				if(i ==3 && j==8 || i == 6 && j == 8) pieza = new Alfil(color);
				if(i ==4 && j==8) pieza = new Rey(color);
				if(i ==5 && j==8) pieza = new Dama(color);
				if(i <=8 && j==7) pieza = new Peon(color);
			}else pieza = null;
				Escaque escaque = new Escaque(i,j,pieza);
				int modulo = (i+j)%2;
				if( modulo == 0) escaque.setColor(Color.NEGRO);
				else escaque.setColor(Color.BLANCO);
				
				piezas.add(escaque);
			}
			

		}
	
		piezas.forEach(n -> System.out.println(n.color));
	}

	public class Escaque {
		private int col;
		private int fila;
		private Color color;
		private Posicion pos;
		private Pieza pieza;
		
	

		public Escaque(int col, int fila) {
			this.col = col;
			this.fila = fila;
		}

		public Escaque(Posicion pos) {
			this.pos = pos;
		}
		public Escaque(int col, int fila,  Pieza pieza) {
			this.col = col; 
			this.fila = fila;
			this.pieza = pieza;
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
		
		public void quitaPieza() throws JuegoException {
			
			if (hayPieza() == false) System.out.println("No hay pieza, no puedo quitarla");
			setPieza(null);
		}
		
		public Posicion getPos() {
			return pos;
		}

		public void setPos(Posicion pos) {
			this.pos = pos;
		}

		public Color getColor() {
			return color;
		}

		public void setColor(Color color) {
			this.color = color;
		}
		
		
	}

	public Escaque findEscaque(int col, int fila) throws JuegoException {
		Posicion pos = new Posicion(col, fila);
		findEscaque(pos);
		return escaque;
	}
	
	
	
	public Escaque findEscaque(Posicion pos) {
		Escaque escaque = (Escaque) piezas.stream()
				.filter(escaque1 -> escaque1.getPos() == pos);
		return escaque;
	}

	public boolean hayPieza(Posicion pos) {
		escaque = new Escaque(pos);
		if (piezas.contains(escaque) && escaque.getPieza() != null) 
			return true;
		return false;
	}

	public boolean hayPieza(int col, int fila) throws JuegoException {
		Posicion pos = new Posicion(col, fila);
		return hayPieza(pos);
	}

	

	public void quitaPieza(Posicion pos) {
		escaque = new Escaque(pos);
		Escaque escaqueSeleccionado;
		
		//if (escaqueSeleccionado = (piezas.contains(escaqueDummy))) escaqueDummy.getPieza() != null
		
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Color colorEscaque(int col, int fila) {
		Color color = Color.BLANCO;
		return color;
	}

	public boolean hayPiezasEntre(Movimiento mov) throws JuegoException {
		Escaque escaqueInicial;
		Escaque escaqueFinal;
		Pieza pieza;
		int salto = 0;
		
		
		escaqueInicial = findEscaque(mov.getPosIni());
		escaqueFinal = findEscaque(mov.getPosFin());
		
		if(mov.esHorizontal()) {
			salto = mov.saltoHorizontal();
			
			for(int i = 0; i< salto; i++) {
				if(findEscaque(mov.getPosIni().getFila()+mov.deltaFila(), mov.getPosFin().getFila()).hayPieza()) {
					return true;
				}
			}
		
		}else if(mov.esVertical()) {
			salto = mov.saltoVertical();
			for(int i = 0; i< salto; i++) {
				if(findEscaque(mov.getPosIni().getCol()+mov.deltaFila(), mov.getPosFin().getCol()).hayPieza()) {
					return true;
				}
			}
		}
		else if(mov.esDiagonal()) {
			salto = mov.saltoHorizontal();
			for(int i = 0; i< salto; i++) {
				if(findEscaque(mov.getPosIni().getFila()+mov.deltaFila(), (mov.getPosIni().getFila()+mov.deltaFila())+mov.deltaColumna()).hayPieza()) {
					return true;
				}
			}
		}
		return false;
	}

	public ArrayList<Escaque> getPiezas() {
		return piezas;
	}

	}


