package com.example.domains.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.example.domains.core.entities.EntityBase;


/**
 * The persistent class for the fotos database table.
 * 
 */
@Entity
@Table(name="fotos")
@NamedQuery(name="Foto.findAll", query="SELECT f FROM Foto f")
public class Foto extends EntityBase<Foto> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_foto")
	private int idFoto;

	//bi-directional many-to-one association to Pizza
	@ManyToOne
	@NotNull
	@JoinColumn(name="id_pizza")
	private Pizza pizza;

	@NotBlank
	@Length(min=1, max=250)
	private String foto;
	
	
	public Foto() {
	}

	public int getIdFoto() {
		return this.idFoto;
	}

	public void setIdFoto(int idFoto) {
		this.idFoto = idFoto;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Pizza getPizza() {
		return this.pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFoto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Foto))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foto other = (Foto) obj;
		return idFoto == other.idFoto;
	}

	@Override
	public String toString() {
		return "Foto [idFoto=" + idFoto + ", pizza=" + pizza + ", foto=" + foto + "]";
	}
	
	
	
	
	

}