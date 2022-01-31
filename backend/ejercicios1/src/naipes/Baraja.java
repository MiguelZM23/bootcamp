package naipes;


public class Baraja {
	
	String tipo;
	
	int numeroCartas;
	
	
	
	public Baraja(String tipo, int numeroCartas){
		this.tipo = tipo;
		this.numeroCartas = numeroCartas;
	};
	
	
	
	public class Naipe{
		PaloEspanola palo;
		PaloFrancesa palo2;
		byte numero;
		
		Naipe(String palo, byte numero ){
			this.palo = palo;
			this.numero = numero;
		}
		
	}
	
	public void barajar() {
		byte[] mazo = new byte[numeroCartas];
		
		for (byte i=0; i<= mazo.length; i++) {
			mazo[i] = new Naipe(palo, i);
		}
		
	}
	
	public String dimePalo(byte j) {
		if (j == 1) return "BASTOS";
		if (j == 2) return "ESPADAS";
		
	}
	
	

}
