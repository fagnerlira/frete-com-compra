package br.com.frete.classes.controller;

import java.util.List;

import br.com.frete.modelo.Cliente;
import br.com.frete.modelo.Item;
import br.com.frete.modelo.enumeracoes.Estado;

public class Compra {

	private double valorTotalDaCompra;

	private List<Item> itens;
	private List<Cliente> clientes;
	private Estado estado;
	private double valorFrete;


	public Compra(List<Item> itens, List<Cliente> clientes, Estado estado) {
		this.itens     = itens;
		this.clientes  = clientes;
		this.estado    = estado;
		valorTotalDosItens();
	}

	private void valorTotalDosItens() {
		for (Item item : itens) {
			this.valorTotalDaCompra += item.PrecoTotalItem();
		}
	}

	public double valorFrete(double valorFrete) {
		return this.valorFrete += valorFrete;
	}

	public int quantidadeDeItens() {
		int quantidade = 0;
		for (Item item : itens) {
			quantidade += item.getQuantidade();
		}
		return quantidade;
	}

	public Double descontoValor(double desconto) {
		return this.valorTotalDaCompra -= desconto;
	}

	public boolean temProduto(String produto) {
		for (Item item : itens) {
			if (item.getNome().equals(produto))
				return true;
		}
		return false;
	}

	public boolean temCliente(String cliente) {
		for (Cliente nomeclientes : clientes) {
			if (nomeclientes.getNomeCliente().equals(cliente))
				return true;
		}

		return false;
	}

	public Estado getEstado() {
		return estado;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public double getValorTotalDaCompra() {
		return valorTotalDaCompra;
	}

}
