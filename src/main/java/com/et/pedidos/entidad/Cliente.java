package com.et.pedidos.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table( name = "clientes" )
public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column( name = "cliente_id" )
	private Long clienteId;
	
	@NotBlank( message = "El campo 'nombres' no debe estar vacio" )
	private String nombres;
	
	@NotBlank( message = "El campo 'paterno' no debe estar vacio" )
	private String paterno;
	
	@NotBlank( message = "El campo 'materno' no debe estar vacio" )
	private String materno;

	@Email
	@Column( name = "email", unique = true )
	private String email;

	@Email
	@Column( name = "nit_cliente", unique = true )
	private String nitCliente;

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNitCliente() {
		return nitCliente;
	}

	public void setNitCliente(String nitCliente) {
		this.nitCliente = nitCliente;
	}
}
