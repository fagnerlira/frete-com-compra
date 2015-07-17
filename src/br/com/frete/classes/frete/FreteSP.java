package br.com.frete.classes.frete;

import br.com.frete.classes.controller.Compra;
import br.com.frete.interfaces.Frete;
import br.com.frete.modelo.enumeracoes.Estado;

public class FreteSP implements Frete {


	@Override
	public double calcula(Compra compra) {
		// TODO Auto-generated method stub

		if (compra.getEstado().equals(Estado.SP) && compra.quantidadeDeItens() <= 3) {
			return compra.valorFrete(10);
			
		} else if (compra.equals(Estado.SP) && compra.quantidadeDeItens() > 3) {
			return compra.valorFrete(17);
		}
		return 0;
	}

}
