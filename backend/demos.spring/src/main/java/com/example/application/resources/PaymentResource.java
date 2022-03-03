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

import com.example.application.dtos.PaymentShortDTO;
import com.example.domains.contracts.services.PaymentService;
import com.example.domains.entities.Payment;
import com.example.exceptions.DuplicateKeyException;
import com.example.exceptions.InvalidDataException;
import com.example.exceptions.NotFoundException;

import io.swagger.annotations.ApiOperation;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/Payment")
public class PaymentResource {
	
	@Autowired
	private PaymentService srv;
	
	@GetMapping
	@ApiOperation(value = "Listado de pagos")
	public List<PaymentShortDTO> getAll() {
		return srv.getAll().stream().map(item -> PaymentShortDTO.from(item)).toList();
	}
	
	/*
	@GetMapping(params = "page")
	public Page<PaymentShortDTO> getAll(Pageable page){
		return srv.getByProjection(page, PaymentShortDTO.class);
	}
	
	@GetMapping(path = "/{id}")
	public PaymentDetailsDTO getOne(@PathVariable int id) throws NotFoundException {
		return PaymentDetailsDTO.from(srv.getOne(id));
	}
	
	@GetMapping(path = "/{id}/edit")
	public PaymentEditDTO getOneEdit(@PathVariable int id) throws NotFoundException {
		return PaymentEditDTO.from(srv.getOne(id));
	}
	
	
	
	@PostMapping
	public ResponseEntity<Object> create(@Valid @RequestBody PaymentDTO item) throws InvalidDataException, DuplicateKeyException {
		Payment Payment = PaymentDTO.from(item);
		if(Payment.isInvalid())
			throw new InvalidDataException(Payment.getErrorsMessage());
		Payment = srv.add(Payment);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			.buildAndExpand(Payment.getPaymentId()).toUri();
		return ResponseEntity.created(location).build();

	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void update(@PathVariable int id, @Valid @RequestBody PaymentDTO item) throws InvalidDataException, NotFoundException {
		if(id != item.getPaymentId())
			throw new InvalidDataException("No coinciden los identificadores");
		Payment Payment = PaymentDTO.from(item);
		if(Payment.isInvalid())
			throw new InvalidDataException(Payment.getErrorsMessage());
		srv.change(Payment);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable int id) {
		srv.deleteById(id);
	}*/
}
