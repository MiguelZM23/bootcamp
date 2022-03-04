package com.example.domains.entities;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import com.example.domains.core.entities.EntityBase;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the rental database table.
 * 
 */
@Entity
@Table(name="rental")
@NamedQuery(name="Rental.findAll", query="SELECT r FROM Rental r")
public class Rental extends EntityBase<Rental> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="rental_id")
	private int rentalId;

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="rental_date")
	private Date rentalDate;
	
	//bi-directional many-to-one association to Inventory
	@ManyToOne
	@JoinColumn(name="inventory_id")
	private Inventory inventory;
	
	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="return_date")
	private Date returnDate;
	
	//bi-directional many-to-one association to Staff
		@ManyToOne
		@JoinColumn(name="staff_id")
		private Staff staff;
	
	@Column(name = "last_update")
	//@Generated(value = GenerationTime.ALWAYS)
	@PastOrPresent
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Timestamp lastUpdate;

	//bi-directional many-to-one association to Payment
	@OneToMany(mappedBy="rental", cascade = CascadeType.ALL, orphanRemoval = true)
	@Valid
	@JsonIgnore
	private List<Payment> payments;

	public Rental() {
	}

	public Rental(int rentalId2, Date rentalDate2, Date returnDate2, Inventory inventory2, Customer customer2,
			Staff staff2, Object object) {
		// TODO Auto-generated constructor stub
	}

	public int getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getRentalDate() {
		return this.rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public List<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Payment addPayment(Payment payment) {
		getPayments().add(payment);
		payment.setRental(this);

		return payment;
	}

	public Payment removePayment(Payment payment) {
		getPayments().remove(payment);
		payment.setRental(null);

		return payment;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rentalId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rental))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rental other = (Rental) obj;
		return rentalId == other.rentalId;
	}

	@Override
	public String toString() {
		return "Rental [rentalId=" + rentalId + ", rentalDate=" + rentalDate + ", inventory=" + inventory
				+ ", customer=" + customer + ", returnDate=" + returnDate + ", staff=" + staff + ", lastUpdate="
				+ lastUpdate + ", payments=" + payments + "]";
	}
	
	
	

}