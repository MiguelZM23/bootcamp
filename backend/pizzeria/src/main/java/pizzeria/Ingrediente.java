package pizzeria;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ingredientes database table.
 * 
 */
@Entity
@Table(name="ingredientes")
@NamedQuery(name="Ingrediente.findAll", query="SELECT i FROM Ingrediente i")
public class Ingrediente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ingrediente")
	private int idIngrediente;

	private String nombre;

	private double precio;

	private String tipo;

	//bi-directional one-to-one association to Ingredientes_por_pizza
	@OneToOne(mappedBy="ingredienteBean")
	private Ingredientes_por_pizza ingredientesPorPizza;

	public Ingrediente() {
	}

	public int getIdIngrediente() {
		return this.idIngrediente;
	}

	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
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

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Ingredientes_por_pizza getIngredientesPorPizza() {
		return this.ingredientesPorPizza;
	}

	public void setIngredientesPorPizza(Ingredientes_por_pizza ingredientesPorPizza) {
		this.ingredientesPorPizza = ingredientesPorPizza;
	}

}