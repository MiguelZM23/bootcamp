package com.example.application.dtos;

import java.util.Date;
import java.util.List;

import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Value;

@Value
public class RentalEditDTO {
	@JsonProperty("id")
	private int rentalId;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date rentalDate;
	@JsonProperty("Cliente")
	private int cliente;
	@JsonProperty("titulo_pelicula")
	private int Pelicula;
	@JsonProperty("staff")
	private int empleado;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date returnDate;
	private List<Integer> payments;
	
	
	
	public static RentalEditDTO from(Rental source) {
		return new RentalEditDTO(
				source.getRentalId(),
				source.getRentalDate(),
				source.getCustomer().getCustomerId(),
				source.getInventory().getInventoryId(),
				source.getStaff().getStaffId(),
				source.getReturnDate(),
				null
				);
	}

	
	
	
}
