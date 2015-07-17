package br.com.frete.classes.desconto;

import br.com.frete.classes.controller.Compra;
import br.com.frete.interfaces.Desconto;

public class DescontoMaiorQueQuinhentosMenorQueDoisMil implements Desconto {

	@Override
	public double calcula(Compra compra) {
		// TODO Auto-generated method stub
		if (compra.getValorTotalDaCompra() > 501 && compra.getValorTotalDaCompra() < 2000) {
			return compra.getValorTotalDaCompra() * 0.5;
		}
		
		return 0;
	}

}
