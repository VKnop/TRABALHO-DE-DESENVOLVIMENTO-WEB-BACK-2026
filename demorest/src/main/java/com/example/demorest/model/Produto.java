package com.example.demorest.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name= "Produto")
public class Produto extends  AbstractEntity<Long> {

	
	@Column(name="nome", nullable=false, unique=true, length=60)
	private String nome;
	
	@Column(name = "preco", nullable = false, columnDefinition = "DECIMAL")
	private BigDecimal preco;
	
	@Column(name = "estoque", nullable = false, columnDefinition = "BOOLEAN")
	private boolean estoque;
	
	public String getName() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public boolean getEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}
}

