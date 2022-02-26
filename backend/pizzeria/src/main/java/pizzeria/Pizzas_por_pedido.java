package pizzeria;

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

	private int pedido;

	private String pizza;

	private int precio;

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

	public int getPedido() {
		return this.pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public String getPizza() {
		return this.pizza;
	}

	public void setPizza(String pizza) {
		this.pizza = pizza;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}