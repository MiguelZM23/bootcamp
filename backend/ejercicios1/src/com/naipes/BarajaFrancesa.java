package com.naipes;

import java.util.ArrayList;
import java.util.List;

import com.naipes.Baraja.Naipe;

public class BarajaFrancesa extends TipoNaipes {
	private List<Naipe> mazo;
	private int numeroCartas;
	private String tipoBaraja = "Francesa";
	private enum PaloFrancesa {
		PICAS(0), DIAMANTES(1), TREBOLES(2), CORAZONES(3);
		
		private int value;
		PaloFrancesa(int value){this.value = value;}
		//Añadir un método
	    public int getPalo(){return value;}
	    public static Palo getEnum(int value) {
			switch (value) {
			case 0: return Palo.PICAS;
			case 1: return Palo.DIAMANTES;
			case 2: return Palo.TREBOLES;
			case 3: return Palo.CORAZONES;
			default:
				throw new IllegalArgumentException("Unexpected value: " + value);
			}
		}
	}
	
	public BarajaFrancesa(int numeroCartas) {
		this.numeroCartas = numeroCartas;
	};
	
public void creaMazo() {
		
		mazo = new ArrayList<Naipe>();

		System.out.println(tipoBaraja);
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i <= (mazo.size() / 4); i++) {
				// Agregamos los naipes al mazo
				mazo.add(new Naipe(PaloFrancesa.getEnum(j), i));
				}
			
				

			}

		}
	
	
	
	
}
