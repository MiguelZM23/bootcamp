package com.example.application.dtos;

import java.util.Date;

import com.example.domains.entities.Rental;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class RentalShortDTO {
	@JsonProperty("id")
	private int rentalId;
	@JsonProperty("Fecha_devolucion")
	private Date rentalDate;
	@JsonProperty("titulo_pelicula")
	private String tituloPelicula;
	
	public static RentalShortDTO from(Rental source) {
		return new RentalShortDTO(
				source.getRentalId(),
				source.getRentalDate(),
				source.getInventory().getFilm().getTitle()
				);
	}

	
	
	
}
