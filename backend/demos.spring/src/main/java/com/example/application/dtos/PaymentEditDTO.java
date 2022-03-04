package com.example.application.dtos;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

import com.example.domains.entities.Payment;
import com.example.domains.entities.Rental;
import com.example.domains.entities.Staff;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Value;

@Value
public class PaymentEditDTO {
	@ApiModelProperty(value = "Identificador de pago.")
	@JsonProperty("id")
	private int paymentId;
	@NonNull
	@ApiModelProperty(value = "Identificador de empleados.")
	@JsonProperty("Empleado")
	private int empleado;
	@NotNull
	@DecimalMin(value = "0.0", inclusive = false)
	@Digits(integer = 4, fraction = 2)
	@ApiModelProperty(value = "Cantidad con un máximo de 4 dígitos enteros y 2 decimales.")
	@JsonProperty("total")
	private BigDecimal amount;
	@ApiModelProperty(value = "Fecha del pago")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date fecha;

	public static PaymentEditDTO from(Payment source) {
		return new PaymentEditDTO(source.getPaymentId(), source.getStaff().getStaffId(), source.getAmount(),
				source.getPaymentDate());
	}

	public static Payment from(PaymentEditDTO source, Rental rental) {
		return new Payment(source.getPaymentId(), source.getAmount(), source.getFecha(),
				new Staff(source.getEmpleado()), rental);
	}

}