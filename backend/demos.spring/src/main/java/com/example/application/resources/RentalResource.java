package com.example.application.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.application.dtos.RentalDetailsDTO;
import com.example.application.dtos.RentalEditDTO;
import com.example.application.dtos.RentalShortDTO;
import com.example.domains.contracts.services.RentalService;
import com.example.domains.entities.Rental;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/rental")
public class RentalResource {
	
	@Autowired
	private RentalService srv;
	
	@GetMapping
	@ApiOperation(value = "Listado de alquileres")
	public List<RentalShortDTO> getAll() {
		return srv.getAll().stream().map(item -> RentalShortDTO.from(item)).toList();
	}
	@GetMapping(params = "page")
	public Page<RentalShortDTO> getAll(Pageable page){
		return srv.getByProjection(page, RentalShortDTO.class);
	}
	
	@GetMapping(path = "/{id}")
	public RentalDetailsDTO getOne(@PathVariable int id) throws NotFoundException {
		return RentalDetailsDTO.from(srv.getOne(id));
	}
	
	@GetMapping(path = "/{id}/edit")
	public RentalEditDTO getOneEdit(@PathVariable int id) throws NotFoundException {
		return RentalEditDTO.from(srv.getOne(id));
	}
	
	
	/*
	@PostMapping
	public ResponseEntity<Object> create(@Valid @RequestBody RentalDTO item) throws InvalidDataException, DuplicateKeyException {
		Rental Rental = RentalDTO.from(item);
		if(Rental.isInvalid())
			throw new InvalidDataException(Rental.getErrorsMessage());
		Rental = srv.add(Rental);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			.buildAndExpand(Rental.getRentalId()).toUri();
		return ResponseEntity.created(location).build();

	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void update(@PathVariable int id, @Valid @RequestBody RentalDTO item) throws InvalidDataException, NotFoundException {
		if(id != item.getRentalId())
			throw new InvalidDataException("No coinciden los identificadores");
		Rental Rental = RentalDTO.from(item);
		if(Rental.isInvalid())
			throw new InvalidDataException(Rental.getErrorsMessage());
		srv.change(Rental);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		srv.deleteById(id);
	}*/
}
