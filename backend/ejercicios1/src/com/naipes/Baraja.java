package com.naipes;

import java.util.Random;

public class Baraja {
	int numeroCartas;
	TipoBaraja tipoBaraja;
	Naipe mazo[];

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

	public void creaMazo(int numCartas) {

		mazo = new Naipe[numCartas];

		int cont = 0;

		for (byte j = 0; j < PaloE.values().length; j++) {
			for (int i = 0; i < (numCartas / 4); i++) {

				mazo[cont] = new Naipe(PaloE.values()[j], i + 1);
				cont += 1;
			}

		}

		for (int h = 0; h < mazo.length; h++) {
			System.out.println(mazo[h].palo);
			System.out.println(mazo[h].numero);
		}

	}

	public Naipe[] barajar(int cartasARepartir) {
		int num;
		Naipe mano[] = new Naipe[cartasARepartir];
		for (int i = 0; i < cartasARepartir; i++) {
			var rnd = new Random();
			num = (int) rnd.nextInt(mazo.length);
			mano[i] = mazo[num];
		}

		return mano;

	}

	/*
	 * public String dimePalo(byte j) { if (j == 1) return "BASTOS"; if (j == 2)
	 * return "ESPADAS";
	 * 
	 * }
	 * 
	 */

}
