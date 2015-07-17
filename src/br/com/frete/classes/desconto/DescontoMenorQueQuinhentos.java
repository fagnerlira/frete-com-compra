package br.com.frete.classes.desconto;

import br.com.frete.classes.controller.Compra;
import br.com.frete.interfaces.Desconto;

public class DescontoMenorQueQuinhentos implements Desconto {

	@Override
	public double calcula(Compra compra) {
		// TODO Auto-generated method stub
		if (compra.getValorTotalDaCompra() < 500) {
			return compra.getValorTotalDaCompra() * 0.05;
			
		}
		return 0;
	}

	
	
}
