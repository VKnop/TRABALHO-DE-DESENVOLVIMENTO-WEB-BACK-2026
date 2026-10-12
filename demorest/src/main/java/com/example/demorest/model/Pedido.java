
package com.example.demorest.model;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "Pedido")
public class Pedido extends AbstractEntity<Long> {

	@Column(name = "cliente_id", nullable = false, length = 60)
	private Long cliente_id;

	@Column(name = "produto_id", nullable = false, length = 60)
	private Long produto_id;

	@Column(name = "quantidade", nullable = false, columnDefinition = "INTEGER")
	private int quantidade;

	public Long getClienteID() {
		return cliente_id;
	}

	public void setClienteID(Long cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Long getProdutoID() {
		return produto_id;
	}

	public void getProdutoID(Long produto_id) {
		this.produto_id = produto_id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
