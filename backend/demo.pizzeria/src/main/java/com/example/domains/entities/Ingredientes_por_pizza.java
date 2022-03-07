package com.example.domains.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `ingredientes por pizza` database table.
 * 
 */
@Entity
@Table(name="`ingredientes por pizza`")
@NamedQuery(name="Ingredientes_por_pizza.findAll", query="SELECT i FROM Ingredientes_por_pizza i")
public class Ingredientes_por_pizza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ingredientes_pizza")
	private int idIngredientesPizza;

	private int cantidad;

	//bi-directional many-to-one association to Ingrediente
	@ManyToOne
	@JoinColumn(name="id_ingrediente")
	private Ingrediente ingrediente;

	//bi-directional many-to-one association to Pizza
	@ManyToOne
	@JoinColumn(name="id_pizza")
	private Pizza pizza;

	public Ingredientes_por_pizza() {
	}

	public int getIdIngredientesPizza() {
		return this.idIngredientesPizza;
	}

	public void setIdIngredientesPizza(int idIngredientesPizza) {
		this.idIngredientesPizza = idIngredientesPizza;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Ingrediente getIngrediente() {
		return this.ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public Pizza getPizza() {
		return this.pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

}