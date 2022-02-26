package pizzeria;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private int idUsuario;

	private String contraseña;

	private String nombre;

	@Column(name="primer_apellido")
	private String primerApellido;

	@Column(name="segundo_apellido")
	private String segundoApellido;

	//bi-directional many-to-one association to Direccione
	@OneToMany(mappedBy="usuario")
	private List<Direccione> direcciones;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public List<Direccione> getDirecciones() {
		return this.direcciones;
	}

	public void setDirecciones(List<Direccione> direcciones) {
		this.direcciones = direcciones;
	}

	public Direccione addDireccione(Direccione direccione) {
		getDirecciones().add(direccione);
		direccione.setUsuario(this);

		return direccione;
	}

	public Direccione removeDireccione(Direccione direccione) {
		getDirecciones().remove(direccione);
		direccione.setUsuario(null);

		return direccione;
	}

}