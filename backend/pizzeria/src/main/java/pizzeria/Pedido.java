package pizzeria;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


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

	@Column(name="direccion_entrega")
	private String direccionEntrega;

	@Column(name="entregado_por")
	private String entregadoPor;

	private String estado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_entrega")
	private Date fechaEntrega;

	private double importe;

	@Column(name="numero_pedido")
	private int numeroPedido;

	@Column(name="preparado_por")
	private String preparadoPor;

	private String usuario;

	public Pedido() {
	}

	public int getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getDireccionEntrega() {
		return this.direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}

	public String getEntregadoPor() {
		return this.entregadoPor;
	}

	public void setEntregadoPor(String entregadoPor) {
		this.entregadoPor = entregadoPor;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
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

	public String getPreparadoPor() {
		return this.preparadoPor;
	}

	public void setPreparadoPor(String preparadoPor) {
		this.preparadoPor = preparadoPor;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}