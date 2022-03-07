package pizzeriaJPA;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `pizzas por pedido` database table.
 * 
 */
@Entity
@Table(name="`pizzas por pedido`")
@NamedQuery(name="Pizzas_por_pedido.findAll", query="SELECT p FROM Pizzas_por_pedido p")
public class Pizzas_por_pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pizza_por_pedido")
	private int idPizzaPorPedido;

	private int cantidad;

	private double precio;

	//bi-directional many-to-one association to Pedido
	@ManyToOne
	@JoinColumn(name="id_pedido")
	private Pedido pedido;

	//bi-directional many-to-one association to Pizza
	@ManyToOne
	@JoinColumn(name="id_pizza")
	private Pizza pizza;

	public Pizzas_por_pedido() {
	}

	public int getIdPizzaPorPedido() {
		return this.idPizzaPorPedido;
	}

	public void setIdPizzaPorPedido(int idPizzaPorPedido) {
		this.idPizzaPorPedido = idPizzaPorPedido;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Pizza getPizza() {
		return this.pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

}