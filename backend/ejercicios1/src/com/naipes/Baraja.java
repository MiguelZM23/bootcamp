package com.naipes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @author mizapata
 *
 */
public class Baraja {
	
	private int numeroCartas;//Numero de cartas de la baraja
	private TipoBaraja tipoBaraja;//Francesa o Española
	private Palo palo;
	private List<Naipe> mazo;

	public Baraja(TipoBaraja tipoBaraja, int numeroCartas) {
		this.tipoBaraja = tipoBaraja;
		this.numeroCartas = numeroCartas;
	};
	
	public int getNumeroCartas() {
		return numeroCartas;
	}

	public void setNumeroCartas(int numeroCartas) {
		this.numeroCartas = numeroCartas;
	}

	public TipoBaraja getTipoBaraja() {
		return tipoBaraja;
	}

	public void setTipoBaraja(TipoBaraja tipoBaraja) {
		this.tipoBaraja = tipoBaraja;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public List<Naipe> getMazo() {
		return mazo;
	}

	public void setMazo(List<Naipe> mazo) {
		this.mazo = mazo;
	}

	// Anidamos la clase Naipe dentro de Baraja
	public static class Naipe {
		private Enum palo;
		private int numero;

		Naipe(Enum palo, int numero) {
			this.palo = palo;
			this.numero = numero;
		}

		public Enum getPalo() {
			return palo;
		}

		public int getNumero() {
			return numero;
		}
	}

	/**
	 * Crea un mazo de cartas con el número de cartas que recibe
	 * @param numCartas
	 */
	public void creaMazo() {
		
		mazo = new ArrayList<Naipe>();

		System.out.println(tipoBaraja.toString());
		for (int j = 0; j < Palo.values().length; j++) {
			for (int i = 1; i <= (mazo.size() / 4); i++) {
				//Si la baraja es francesa sumamos 4 a j
				if (tipoBaraja == TipoBaraja.FRANCESA && j == 0)
					j += 4;
				//Si la baraja es española finalizamos cuando j=4 ya que a partir de ahí
				//vienen los palos franceses en el enum palo.
				else if (tipoBaraja == TipoBaraja.ESPANOLA && j == 4) {
					j = 7;
					break;
				}
				// Agregamos los naipes al mazo
				mazo.add(new Naipe(Palo.getEnum(j), i));

			}

		}
		System.out.println("El mazo es el siguiente:");
		mazo.forEach(palo -> {
			System.out.println(palo.palo);
			System.out.println(palo.numero);
		});

	}
	
	/**
	 * Baraja el mazo de cartas.
	 */
	public void barajar() {
		int num;
		ArrayList<Naipe> mazodes = new ArrayList<>();
		for (int i = 0; i < numeroCartas; i++) {
			var rnd = new Random();
			num = (int) rnd.nextInt(mazo.size());
			// Asignamos una carta aleatoria al mazo desordenado
			mazodes.add(mazo.get(num));
			// Quitamos la carta del mazo de origen
			mazo.remove(num);
		}
		
		mazo = mazodes;
		System.out.println("El mazo barajado es el siguiente:");
		mazodes.forEach(carta -> {
			System.out.println(carta.palo);
			System.out.println(carta.numero);
		});

	}
	
	public Naipe dameCarta() {
		Naipe cartaJugador = mazo.get(mazo.size()-1);
		mazo.remove(mazo.size()-1);	
		
		return cartaJugador;
	}
	
	public Naipe comparar(Naipe carta1, Naipe carta2) {
		Naipe cartaGanadora;
		
		cartaGanadora = (carta1.numero>carta2.numero) ? carta1: carta2; 
		if (carta1.numero == carta2.numero) cartaGanadora.numero = 0; cartaGanadora.palo = carta1.palo;
		
		return cartaGanadora;
	
		}

}
