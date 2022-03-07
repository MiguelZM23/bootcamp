package com.example.domains.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pizzas database table.
 * 
 */
@Entity
@Table(name="pizzas")
@NamedQuery(name="Pizza.findAll", query="SELECT p FROM Pizza p")
public class Pizza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pizza")
	private int idPizza;

	private String descripcion;

	@Column(name="me_gusta")
	private int meGusta;

	@Column(name="no_me_gusta")
	private int noMeGusta;

	private String nombre;

	private double precio;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="pizza")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Foto
	@OneToMany(mappedBy="pizza")
	private List<Foto> fotos;

	//bi-directional many-to-one association to Ingredientes_por_pizza
	@OneToMany(mappedBy="pizza")
	private List<Ingredientes_por_pizza> ingredientesPorPizzas;

	//bi-directional many-to-one association to Pizzas_por_pedido
	@OneToMany(mappedBy="pizza")
	private List<Pizzas_por_pedido> pizzasPorPedidos;

	public Pizza() {
	}

	public int getIdPizza() {
		return this.idPizza;
	}

	public void setIdPizza(int idPizza) {
		this.idPizza = idPizza;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getMeGusta() {
		return this.meGusta;
	}

	public void setMeGusta(int meGusta) {
		this.meGusta = meGusta;
	}

	public int getNoMeGusta() {
		return this.noMeGusta;
	}

	public void setNoMeGusta(int noMeGusta) {
		this.noMeGusta = noMeGusta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setPizza(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setPizza(null);

		return comentario;
	}

	public List<Foto> getFotos() {
		return this.fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	public Foto addFoto(Foto foto) {
		getFotos().add(foto);
		foto.setPizza(this);

		return foto;
	}

	public Foto removeFoto(Foto foto) {
		getFotos().remove(foto);
		foto.setPizza(null);

		return foto;
	}

	public List<Ingredientes_por_pizza> getIngredientesPorPizzas() {
		return this.ingredientesPorPizzas;
	}

	public void setIngredientesPorPizzas(List<Ingredientes_por_pizza> ingredientesPorPizzas) {
		this.ingredientesPorPizzas = ingredientesPorPizzas;
	}

	public Ingredientes_por_pizza addIngredientesPorPizza(Ingredientes_por_pizza ingredientesPorPizza) {
		getIngredientesPorPizzas().add(ingredientesPorPizza);
		ingredientesPorPizza.setPizza(this);

		return ingredientesPorPizza;
	}

	public Ingredientes_por_pizza removeIngredientesPorPizza(Ingredientes_por_pizza ingredientesPorPizza) {
		getIngredientesPorPizzas().remove(ingredientesPorPizza);
		ingredientesPorPizza.setPizza(null);

		return ingredientesPorPizza;
	}

	public List<Pizzas_por_pedido> getPizzasPorPedidos() {
		return this.pizzasPorPedidos;
	}

	public void setPizzasPorPedidos(List<Pizzas_por_pedido> pizzasPorPedidos) {
		this.pizzasPorPedidos = pizzasPorPedidos;
	}

	public Pizzas_por_pedido addPizzasPorPedido(Pizzas_por_pedido pizzasPorPedido) {
		getPizzasPorPedidos().add(pizzasPorPedido);
		pizzasPorPedido.setPizza(this);

		return pizzasPorPedido;
	}

	public Pizzas_por_pedido removePizzasPorPedido(Pizzas_por_pedido pizzasPorPedido) {
		getPizzasPorPedidos().remove(pizzasPorPedido);
		pizzasPorPedido.setPizza(null);

		return pizzasPorPedido;
	}

}