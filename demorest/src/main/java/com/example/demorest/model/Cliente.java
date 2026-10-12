package com.example.demorest.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name= "Cliente")
public class Cliente extends  AbstractEntity<Long> {

	@Column(name="nome", nullable=false, unique=true, length=60)
	private String nome;
	
	@Column( nullable=false, name="cliente_desde", columnDefinition="DATE")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate cliente_desde;
	
	
	public String getName() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getClienteDesde() {
		return cliente_desde;
	}
	public void setClienteDesde(LocalDate cliente_desde) {
		this.cliente_desde = cliente_desde;
	}
}
