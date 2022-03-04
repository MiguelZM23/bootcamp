package com.example.application.dtos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Positive;


import org.springframework.lang.NonNull;

import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Payment;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Value;

@Value
public class RentalEditDTO {
	
	@JsonProperty("id")
	@ApiModelProperty(value = "Identificador del alquiler.")
	private int rentalId;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@ApiModelProperty(value = "Fecha de alquiler")
	@JsonProperty("rental_date")
	private Date rentalDate;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@ApiModelProperty(value = "Fecha de devolución")
	@JsonProperty("return_date")
	private Date returnDate;
	@JsonProperty("cliente")
	@NonNull
	@ApiModelProperty(value = "Identificador cliente.")
	private int customer;
	@JsonProperty("titulo_pelicula")
	@NonNull
	@ApiModelProperty(value = "Identificador del inventario.")
	private int inventory;
	@NonNull
	@Positive
	@ApiModelProperty(value = "Identificador de empleado")
	@JsonProperty("staff")
	private int staff;
	@ApiModelProperty(value = "Lista de identificadores de pagos.")
	private List<PaymentEditDTO> payments;

	public static RentalEditDTO from(Rental source) {
		return new RentalEditDTO(source.getRentalId(), source.getRentalDate(),
				source.getReturnDate() == null ? null : source.getReturnDate(), source.getCustomer().getCustomerId(),
				source.getInventory().getInventoryId(), source.getStaff().getStaffId(),
				source.getPayments().stream().map(pago -> PaymentEditDTO.from(pago)).toList());

	}

	public static Rental from(RentalEditDTO source) {
		return new Rental(source.getRentalId(), source.getRentalDate(),
				source.getReturnDate() == null ? null : source.getReturnDate(), new Inventory(source.getInventory()),
				new Customer(source.getCustomer()), new Staff(source.getStaff()));
	}

	public Rental update(Rental target) {
		if (target.getCustomer().getCustomerId() != customer)
			target.setCustomer(new Customer(customer));
		if (target.getInventory().getInventoryId() != inventory)
			target.setInventory(new Inventory(inventory));
		if (target.getStaff().getStaffId() != staff)
			target.setStaff(new Staff(staff));
		target.setRentalDate(rentalDate);
		target.setReturnDate(returnDate);

		// Borra los alquileres que sobran
		var delAlquiladas = target.getPayments().stream()
				.filter(item -> payments.stream().noneMatch(pago -> pago.getPaymentId() == item.getPaymentId()))
				.toList();
		delAlquiladas.forEach(item -> target.removePayment(item));
		// Modifico los que han quedado
		target.getPayments().forEach(item -> {
			var nuevoPago = payments.stream().filter(pago -> pago.getPaymentId() == item.getPaymentId()).findFirst()
					.get();
			if (item.getAmount() != nuevoPago.getAmount()) {
				item.setAmount(nuevoPago.getAmount());
			}
			if (item.getPaymentDate() != nuevoPago.getFecha()) {
				item.setPaymentDate(nuevoPago.getFecha());
			}
			if (item.getStaff().getStaffId() != nuevoPago.getEmpleado()) {
				item.setStaff(new Staff(nuevoPago.getEmpleado()));
			}
		});
		// Añade los alquileres que falta
		payments.stream()
				.filter(paymentDTO -> target.getPayments().stream()
						.noneMatch(alquiler -> alquiler.getPaymentId() == paymentDTO.getPaymentId()))
				.forEach(paymentDTO -> target.addPayment(new Payment(paymentDTO.getPaymentId(), paymentDTO.getAmount(),
						paymentDTO.getFecha(), new Staff(paymentDTO.getEmpleado()), target)));

		return target;
	}

}
