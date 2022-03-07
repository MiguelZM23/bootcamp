package com.example.domains.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pedidos database table.
 * 
 */
@Entity
@Table(name="pedidos")
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pedido")
	private int idPedido;

	private String estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_entrega")
	private Date fechaEntrega;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_pedido")
	private Date fechaPedido;

	private double importe;

	@Column(name="numero_pedido")
	private int numeroPedido;

	//bi-directional many-to-one association to Direccione
	@ManyToOne
	@JoinColumn(name="direccion_entrega")
	private Direccione direccione;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="entregado_por")
	private Usuario entregado_por;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="preparado_por")
	private Usuario preparado_por;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Pizzas_por_pedido
	@OneToMany(mappedBy="pedido")
	private List<Pizzas_por_pedido> pizzasPorPedidos;

	public Pedido() {
	}

	public int getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaPedido() {
		return this.fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public double getImporte() {
		return this.importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getNumeroPedido() {
		return this.numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Direccione getDireccione() {
		return this.direccione;
	}

	public void setDireccione(Direccione direccione) {
		this.direccione = direccione;
	}

	public Usuario getEntregado_por() {
		return this.entregado_por;
	}

	public void setEntregado_por(Usuario entregado_por) {
		this.entregado_por = entregado_por;
	}

	public Usuario getPreparado_por() {
		return this.preparado_por;
	}

	public void setPreparado_por(Usuario preparado_por) {
		this.preparado_por = preparado_por;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Pizzas_por_pedido> getPizzasPorPedidos() {
		return this.pizzasPorPedidos;
	}

	public void setPizzasPorPedidos(List<Pizzas_por_pedido> pizzasPorPedidos) {
		this.pizzasPorPedidos = pizzasPorPedidos;
	}

	public Pizzas_por_pedido addPizzasPorPedido(Pizzas_por_pedido pizzasPorPedido) {
		getPizzasPorPedidos().add(pizzasPorPedido);
		pizzasPorPedido.setPedido(this);

		return pizzasPorPedido;
	}

	public Pizzas_por_pedido removePizzasPorPedido(Pizzas_por_pedido pizzasPorPedido) {
		getPizzasPorPedidos().remove(pizzasPorPedido);
		pizzasPorPedido.setPedido(null);

		return pizzasPorPedido;
	}

}