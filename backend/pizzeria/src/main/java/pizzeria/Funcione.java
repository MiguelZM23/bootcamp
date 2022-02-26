package pizzeria;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the funciones database table.
 * 
 */
@Entity
@Table(name="funciones")
@NamedQuery(name="Funcione.findAll", query="SELECT f FROM Funcione f")
public class Funcione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_funcion")
	private int idFuncion;

	private String rol;

	private String usuario;

	public Funcione() {
	}

	public int getIdFuncion() {
		return this.idFuncion;
	}

	public void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}