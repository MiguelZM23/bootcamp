package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {
	
	@Id
	@Getter @Setter @Column(name = "id_usuario")
	private Long id;
	
	@Getter @Setter @Column(name = "nombre")
	private String nombre;
	
	@Getter @Setter @Column(name = "primer_apellido")
	private String primerApellido;
	
	@Getter @Setter @Column(name = "segundo_apellido")
	private String segundoApellido;
	
	@Getter @Setter @Column(name = "contraseña")
	private String password;
	
	
	
	
	
}