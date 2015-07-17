package br.com.frete.factory;

import br.com.frete.classes.controller.Compra;
import br.com.frete.classes.frete.FreteCE;
import br.com.frete.classes.frete.FreteRS;
import br.com.frete.classes.frete.FreteSP;
import br.com.frete.classes.frete.OutroFrete;
import br.com.frete.interfaces.Frete;
import br.com.frete.modelo.enumeracoes.Estado;

public class FreteFactory {

	public static Frete cria(Compra compra) {

		if (compra.getEstado().equals(Estado.CE))
			return new FreteCE();

		else if (compra.getEstado().equals(Estado.SP))
			return new FreteSP();

		else if (compra.getEstado().equals(Estado.RS))
			return new FreteRS();

		return new OutroFrete();
	}
}
