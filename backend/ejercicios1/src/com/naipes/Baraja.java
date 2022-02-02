package com.naipes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author mizapata
 *
 */
public class Baraja {
	
	int numeroCartas;//Numero de cartas de la baraja
	TipoBaraja tipoBaraja;//Francesa o Española
	Palo palo;
	List<Naipe> mazo;

	public Baraja(TipoBaraja tipoBaraja, int numeroCartas) {
		this.tipoBaraja = tipoBaraja;
		this.numeroCartas = numeroCartas;
	};

	// Anidamos la clase Naipe dentro de Baraja
	public class Naipe {
		Enum palo;
		int numero;

		Naipe(Enum palo, int numero) {
			this.palo = palo;
			this.numero = numero;
		}

	}

	/**
	 * Crea un mazo de cartas con el número de cartas que recibe
	 * @param numCartas
	 */
	public void creaMazo(int numCartas) {
		
		mazo = new ArrayList<Naipe>();

		System.out.println(tipoBaraja.toString());
		for (int j = 0; j < Palo.values().length; j++) {
			for (int i = 1; i <= (numCartas / 4); i++) {
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
		System.out.println("El mazo barajado es el siguiente:");
		mazodes.forEach(palo -> {
			System.out.println(palo.palo);
			System.out.println(palo.numero);
		});

	}

	/*
	 * public Naipe[] barajar(int cartasARepartir) { int num; Naipe mano[] = new
	 * Naipe[cartasARepartir]; for (int i = 0; i < cartasARepartir; i++) { var rnd =
	 * new Random(); num = (int) rnd.nextInt(mazo.length); mano[i] = mazo[num]; }
	 * 
	 * return mano;
	 * 
	 * }
	 */

	/*
	 * public String dimePalo(byte j) { if (j == 1) return "BASTOS"; if (j == 2)
	 * return "ESPADAS";
	 * 
	 * }
	 * 
	 */

}
