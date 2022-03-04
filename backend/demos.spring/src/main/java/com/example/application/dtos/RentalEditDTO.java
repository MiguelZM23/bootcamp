package com.example.application.dtos;

import java.util.Date;
import java.util.List;

import com.example.domains.entities.Customer;
import com.example.domains.entities.Inventory;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Value;

@Value
public class RentalEditDTO {
	@JsonProperty("id")
	private int rentalId;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@JsonProperty("rental_date")
	private Date rentalDate;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@JsonProperty("")
	private Date returnDate;
	@JsonProperty("cliente")
	private int customerId;
	@JsonProperty("titulo_pelicula")
	private int InventoryId;
	@JsonProperty("staff")
	private int staffId;
	private List<PaymentShortDTO> payments;
	
	
	
	public static RentalEditDTO from(Rental source) {
		return new RentalEditDTO(
				source.getRentalId(),
				source.getRentalDate(),
				source.getReturnDate() == null ? null: source.getReturnDate(),
				source.getCustomer().getCustomerId(),
				source.getInventory().getInventoryId(),
				source.getStaff().getStaffId(),
				source.getPayments().stream().map(pago -> PaymentShortDTO.from(pago)).toList()
				);
				
	}
	
	public static Rental from(RentalEditDTO source) {
		return new Rental(
				source.getRentalId(),
				source.getRentalDate(),
				source.getReturnDate(),
				new Inventory(source.getInventoryId()),
				new Customer(source.getCustomerId()),
				new Staff(source.getStaffId()),
				null
				);
	}
	

	
	
	
}
