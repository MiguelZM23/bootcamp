package com.example.domains.entities;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.example.domains.core.entities.EntityBase;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import java.sql.Timestamp;


/**
 * The persistent class for the payment database table.
 * 
 */
@Entity
@Table(name="payment")
@NamedQuery(name="Payment.findAll", query="SELECT p FROM Payment p")
public class Payment extends EntityBase<Payment> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="payment_id")
	private int paymentId;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customer_id")
	@NotNull
	private Customer customer;
	
	//bi-directional many-to-one association to Staff
	@NotNull
	@ManyToOne
	@JoinColumn(name="staff_id")
	private Staff staff;
	
	//bi-directional many-to-one association to Rental
	@ManyToOne
	@JoinColumn(name="rental_id")
	private Rental rental;
	
	@NotNull
	@DecimalMin(value = "0.0", inclusive = false)
	@Digits(integer = 4, fraction = 2)
	private BigDecimal amount;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="payment_date")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date paymentDate;

	@Column(name="last_update")
	@PastOrPresent
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	//@Generated(value = GenerationTime.ALWAYS)
	private Timestamp lastUpdate;
	
	public Payment() {
	}

	public int getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Rental getRental() {
		return this.rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public int hashCode() {
		return Objects.hash(paymentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Payment))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return paymentId == other.paymentId;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", customer=" + customer + ", staff=" + staff + ", rental=" + rental
				+ ", amount=" + amount + ", paymentDate=" + paymentDate + ", lastUpdate=" + lastUpdate + "]";
	}
	
	
	

}