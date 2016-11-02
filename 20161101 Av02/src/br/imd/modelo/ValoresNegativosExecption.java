package br.imd.modelo;

import br.imd.controle.GenericException;

public class ValoresNegativosExecption extends GenericException {

	public ValoresNegativosExecption() {
		super("Atributo não pode ser valor negativo!");
		
	}

}
