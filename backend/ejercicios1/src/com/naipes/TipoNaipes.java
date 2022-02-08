package com.naipes;

import java.util.ArrayList;
import java.util.List;

import com.naipes.TipoNaipes.Naipe;

public abstract class TipoNaipes<T> {
	private int numeroCartas;
	private List<Naipe> mazo;
	private NaipeValor numeroCarta;
	
	
	
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
}
