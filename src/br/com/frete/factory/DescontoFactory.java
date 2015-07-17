package br.com.frete.factory;

import br.com.frete.classes.controller.Compra;
import br.com.frete.classes.desconto.DescontoMaiorQueQuinhentosMenorQueDoisMil;
import br.com.frete.classes.desconto.DescontoMenorQueQuinhentos;
import br.com.frete.interfaces.Desconto;

public class DescontoFactory {

	public static Desconto cria(Compra compra) {

		if (compra.getValorTotalDaCompra() <= 500)
			return new DescontoMenorQueQuinhentos();

		else if (compra.getValorTotalDaCompra() > 501
				&& compra.getValorTotalDaCompra() < 2000)
			return new DescontoMaiorQueQuinhentosMenorQueDoisMil();

		return null;
	}

}
