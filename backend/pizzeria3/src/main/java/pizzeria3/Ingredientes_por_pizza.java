package pizzeria3;

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
	@Column(name="id_ingredientes_por_pizza")
	private int idIngredientesPorPizza;

	private int cantidad;

	private String ingrediente;

	private String pizza;

	//bi-directional one-to-one association to Ingrediente
	@OneToOne
	@JoinColumn(name="id_ingredientes_por_pizza")
	private Ingrediente ingredienteBean;

	//bi-directional one-to-one association to Pizza
	@OneToOne
	@JoinColumn(name="id_ingredientes_por_pizza")
	private Pizza pizzaBean;

	public Ingredientes_por_pizza() {
	}

	public int getIdIngredientesPorPizza() {
		return this.idIngredientesPorPizza;
	}

	public void setIdIngredientesPorPizza(int idIngredientesPorPizza) {
		this.idIngredientesPorPizza = idIngredientesPorPizza;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getIngrediente() {
		return this.ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getPizza() {
		return this.pizza;
	}

	public void setPizza(String pizza) {
		this.pizza = pizza;
	}

	public Ingrediente getIngredienteBean() {
		return this.ingredienteBean;
	}

	public void setIngredienteBean(Ingrediente ingredienteBean) {
		this.ingredienteBean = ingredienteBean;
	}

	public Pizza getPizzaBean() {
		return this.pizzaBean;
	}

	public void setPizzaBean(Pizza pizzaBean) {
		this.pizzaBean = pizzaBean;
	}

}