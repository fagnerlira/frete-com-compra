package br.com.frete.modelo;

import br.com.frete.modelo.enumeracoes.Estado;

public class Cliente {

	private String nomeCliente;
	private Estado estado;
	
	
	public Cliente(String nomeCliente, Estado estado) {
		this.nomeCliente = nomeCliente;
		this.estado = estado;
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
}
