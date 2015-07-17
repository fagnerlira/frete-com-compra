package br.com.frete.classes.controller;

import br.com.frete.factory.DescontoFactory;
import br.com.frete.factory.FreteFactory;
import br.com.frete.interfaces.Desconto;
import br.com.frete.interfaces.Frete;

public class CalculoFinal {

//	private FreteFactory freteFactory;

//	public CalculoFinal() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	/*public CalculoFinal(FreteFactory freteFactory) {
		this.freteFactory = freteFactory;
	}*/

	public double calulafrete(Compra compra) {
		Frete frete = FreteFactory.cria(compra);
		Desconto desconto = DescontoFactory.cria(compra);
		
		double result = compra.getValorTotalDaCompra() + frete.calcula(compra) - desconto.calcula(compra); 
		return result;

	}

}
