package br.com.frete.main.test;

import java.util.Arrays;

import br.com.frete.classes.controller.CalculoFinal;
import br.com.frete.classes.controller.Compra;
import br.com.frete.factory.DescontoFactory;
import br.com.frete.factory.FreteFactory;
import br.com.frete.interfaces.Desconto;
import br.com.frete.interfaces.Frete;
import br.com.frete.modelo.Cliente;
import br.com.frete.modelo.Item;
import br.com.frete.modelo.enumeracoes.Estado;

public class TestaCalculoFinal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Fagner", Estado.SP);
		Item item1 = new Item("LEITE", 2, 200.00);
		Compra compra = new Compra(Arrays.asList(item1),
				Arrays.asList(cliente), cliente.getEstado());

		Frete frete = FreteFactory.cria(compra);
		double valorFrete = frete.calcula(compra);
		Desconto desconto = DescontoFactory.cria(compra);
		double valorDesconto =  desconto.calcula(compra);
		double valorTotalDaCompra = compra.getValorTotalDaCompra() + valorFrete - valorDesconto;
		
		System.out.println("Valor total da compra é:  R$ " + valorTotalDaCompra);
		System.out.println();
		System.out.println(  "Frete para o Estado de: "               + cliente.getEstado() 
				           + " e Quantidade = "                       + item1.getQuantidade() 
				           + " o valor a ser cobra é de: R$ "         + valorFrete
				           + "    valor do Desconto é:  R$"           + valorDesconto
 				           );
	
		 CalculoFinal calculoFinal = new CalculoFinal();
		 double  ValorTotalDaClasseCalculoFinal = calculoFinal.calulafrete(compra);
		 System.out.println("Valor vindo da classe CalculoFinal:  R$ " + ValorTotalDaClasseCalculoFinal);
		 System.out.println();
	
	}
}
