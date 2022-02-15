package com.capgemini;

import java.util.Scanner;

import com.capgemini.Tablero.Escaque;

/**
 * 
 * @author mizapata
 *
 */

public class Juego {

	Tablero tablero;
	Color turno = Color.BLANCO;
	boolean partidaActiva = false;

	/**
	 * Inicializa el juego
	 */
	public void inicializar() {

		Tablero tablero = new Tablero();
		tablero.rellenarTablero();
		partidaActiva = true;
	}
	/**
	 * Procesa la jugada
	 * @param jugada
	 * @throws JuegoException
	 */
	public void jugada(String jugada) throws JuegoException {
		Scanner teclado = new Scanner(System.in);
		String jugada1 = "";
		Movimiento mov;
		Posicion posInicial;
		Posicion posFinal;

		while (partidaActiva) {
			jugada1 = teclado.nextLine();
			mov = new Movimiento(jugada1);
			Pieza pieza;
			Escaque escaqueInicial = tablero.findEscaque(mov.getPosIni());

			if (escaqueInicial.hayPieza()) {
				pieza = escaqueInicial.getPieza();
				if (pieza.esValido(mov, tablero)) {
					mover(mov);
				} else
					System.out.println("Movimiento no v�lido");

			} else {
				System.out.println("No hay pieza en la posicion inicial");
				continue;
			}

			cambiaTurno();
		}

	}

	/**
	 * Mueve la pieza
	 * @param mov
	 * @throws JuegoException
	 */
	public void mover(Movimiento mov) throws JuegoException {

		Pieza pieza;
		pieza = tablero.findEscaque(mov.getPosIni()).getPieza();
		tablero.findEscaque(mov.getPosFin()).quitaPieza();
		tablero.findEscaque(mov.getPosFin()).setPieza(pieza);

	}

	/**
	 * Cambia el turno
	 */
	public void cambiaTurno() {

		if (turno == Color.BLANCO)
			turno = Color.NEGRO;
		else
			turno = Color.BLANCO;

	}

	public void promocionaPeon(Object o, PromocionEventArgs e) {

	}
	
	public Tablero getTablero() throws CloneNotSupportedException {
		return tablero.clone();
	}

	public void setTablero(Tablero tablero) {
		this.tablero = tablero;
	}

	public Color getTurno() {
		return turno;
	}

	public void setTurno(Color turno) {
		this.turno = turno;
	}

}
