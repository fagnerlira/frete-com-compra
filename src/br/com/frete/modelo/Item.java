package br.com.frete.modelo;

public class Item {

	private String nome;
	private int quantidade;
	private double precoUnitario;

	public Item(String nome, int quantidade, double precoUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public double PrecoTotalItem() {
		return this.quantidade * this.precoUnitario;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

}
