package com.example.domains.entities;

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
	private String email;

	private String apellidos;

	@Lob
	private byte[] contrasena;

	private String nombre;

	private String rol;

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="usuario")
	private List<Comentario> comentarios;

	//bi-directional many-to-one association to Direccione
	@OneToMany(mappedBy="usuario")
	private List<Direccione> direcciones;

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="entregado_por")
	private List<Pedido> pedidos_entregado_por;

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="preparado_por")
	private List<Pedido> pedidos_preparado_por;

	//bi-directional many-to-one association to Pedido
	@OneToMany(mappedBy="usuario")
	private List<Pedido> pedidos_usuario;

	public Usuario() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public byte[] getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(byte[] contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setUsuario(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setUsuario(null);

		return comentario;
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

	public List<Pedido> getPedidos_entregado_por() {
		return this.pedidos_entregado_por;
	}

	public void setPedidos_entregado_por(List<Pedido> pedidos_entregado_por) {
		this.pedidos_entregado_por = pedidos_entregado_por;
	}

	public Pedido addPedidos_entregado_por(Pedido pedidos_entregado_por) {
		getPedidos_entregado_por().add(pedidos_entregado_por);
		pedidos_entregado_por.setEntregado_por(this);

		return pedidos_entregado_por;
	}

	public Pedido removePedidos_entregado_por(Pedido pedidos_entregado_por) {
		getPedidos_entregado_por().remove(pedidos_entregado_por);
		pedidos_entregado_por.setEntregado_por(null);

		return pedidos_entregado_por;
	}

	public List<Pedido> getPedidos_preparado_por() {
		return this.pedidos_preparado_por;
	}

	public void setPedidos_preparado_por(List<Pedido> pedidos_preparado_por) {
		this.pedidos_preparado_por = pedidos_preparado_por;
	}

	public Pedido addPedidos_preparado_por(Pedido pedidos_preparado_por) {
		getPedidos_preparado_por().add(pedidos_preparado_por);
		pedidos_preparado_por.setPreparado_por(this);

		return pedidos_preparado_por;
	}

	public Pedido removePedidos_preparado_por(Pedido pedidos_preparado_por) {
		getPedidos_preparado_por().remove(pedidos_preparado_por);
		pedidos_preparado_por.setPreparado_por(null);

		return pedidos_preparado_por;
	}

	public List<Pedido> getPedidos_usuario() {
		return this.pedidos_usuario;
	}

	public void setPedidos_usuario(List<Pedido> pedidos_usuario) {
		this.pedidos_usuario = pedidos_usuario;
	}

	public Pedido addPedidos_usuario(Pedido pedidos_usuario) {
		getPedidos_usuario().add(pedidos_usuario);
		pedidos_usuario.setUsuario(this);

		return pedidos_usuario;
	}

	public Pedido removePedidos_usuario(Pedido pedidos_usuario) {
		getPedidos_usuario().remove(pedidos_usuario);
		pedidos_usuario.setUsuario(null);

		return pedidos_usuario;
	}

}