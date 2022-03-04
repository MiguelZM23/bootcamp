package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;

import com.example.domains.entities.Payment;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class PaymentShortDTO {
	@JsonProperty("id")
	private int paymentId;
	@JsonProperty("fecha_pago")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date paymentDate;
	@JsonProperty("total")
	private BigDecimal amount;

	public static PaymentShortDTO from(Payment source) {
		return new PaymentShortDTO(source.getPaymentId(), source.getPaymentDate(), source.getAmount());
	}

}
