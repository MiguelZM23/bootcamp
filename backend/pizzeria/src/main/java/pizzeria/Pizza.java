package pizzeria;

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

	private String base;

	private String descripcion;

	private byte[] foto;

	private String gusta;

	private String nombre;

	private double precio;

	private String salsa;

	//bi-directional many-to-one association to Foto
	@OneToMany(mappedBy="pizza")
	private List<Foto> fotos;

	//bi-directional one-to-one association to Ingredientes_por_pizza
	@OneToOne(mappedBy="pizzaBean")
	private Ingredientes_por_pizza ingredientesPorPizza;

	public Pizza() {
	}

	public int getIdPizza() {
		return this.idPizza;
	}

	public void setIdPizza(int idPizza) {
		this.idPizza = idPizza;
	}

	public String getBase() {
		return this.base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getGusta() {
		return this.gusta;
	}

	public void setGusta(String gusta) {
		this.gusta = gusta;
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

	public String getSalsa() {
		return this.salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
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

	public Ingredientes_por_pizza getIngredientesPorPizza() {
		return this.ingredientesPorPizza;
	}

	public void setIngredientesPorPizza(Ingredientes_por_pizza ingredientesPorPizza) {
		this.ingredientesPorPizza = ingredientesPorPizza;
	}

}