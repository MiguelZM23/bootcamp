package com.example;
import com.example.exceptions.DemoException;

public class Factura implements Grafico {
	public static enum Estado {PENDIENTE, PAGADA, CANCELADA}
	public class Linea {
		private String concepto;
		private int cantidad;
		private double precio;
		
		public Linea(String concepto, int cantidad, double precio) throws DemoException {
			super();
			this.concepto = concepto;
			setCantidad(cantidad);
			this.precio = precio;
		}

		public String getConcepto() {
			return concepto;
		}

		public void setConcepto(String concepto) throws DemoException {
			if(concepto == null)
				
			this.concepto = concepto;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			if(this.cantidad == cantidad) return;
			if(cantidad < 1) throw new IllegalArgumentException ("La cantidad debe ser mayor que 0.");
			this.cantidad = cantidad;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public double getTotal() {
			return cantidad*precio;
		}
		
		public int getNumeroFactura() {
			return numero;
		}
	
		
	}
	private int numero;
	private String direccion;
	private Estado estado;
	private Linea[] lineas;
	
	public Factura(int numero) {
		super();
		this.numero = numero;
		//Reservamos las referencias para las lineas
		lineas = new Linea[100];
		estado = Estado.PENDIENTE;
	}
	
	public void addLinea(Linea linea) {
		
	}
	
	public void addLinea(String concepto, int cantidad, double precio) throws DemoException {
		addLinea(new Linea(concepto, cantidad, precio));
	}
	
	public Estado getEstado() {return estado;}
	
	
	public void pagada() {
		estado = Estado.PAGADA;
	}
	
	public void cancelar() {
		estado = Estado.CANCELADA;
	}
	
	@Override
	public void pintate() {
		System.out.println("Soy la factura" + numero);
	}
	
}
