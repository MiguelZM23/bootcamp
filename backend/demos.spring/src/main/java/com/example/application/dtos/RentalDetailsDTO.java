package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Value;

@Value
public class RentalDetailsDTO {
	@JsonProperty("id")
	private int rentalId;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date rentalDate;
	@JsonProperty("Cliente")
	private String cliente;
	@JsonProperty("titulo_pelicula")
	private String tituloPelicula;
	@JsonProperty("staff")
	private String empleado;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date returnDate;
	private List<PaymentShortDTO> payments;
	
	
	public static RentalDetailsDTO from(Rental source) {
		return new RentalDetailsDTO(
				source.getRentalId(),
				source.getRentalDate(),
				source.getCustomer().getFirstName()+ " " + source.getCustomer().getLastName(),
				source.getInventory().getFilm().getTitle(),
				source.getStaff().getFirstName()+ " " + source.getStaff().getLastName(),
				source.getReturnDate(),
				source.getPayments().stream().map(pago -> PaymentShortDTO.from(pago)).toList()
				);
				  
				
	}

	
	
	
}
