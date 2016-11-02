/**
 * 
 */
package br.imd.clarissa.dao;

import br.imd.clarissa.banco.Repositorio;
import br.imd.clarissa.entidades.Carro;
import br.imd.clarissa.entidades.Veiculo;

/**
 * @author clarissa
 *
 */
public class CarroDao implements GenericDao<Carro> {

	/* (non-Javadoc)
	 * @see br.imd.clarissa.dao.GenericDao#inserir(br.imd.clarissa.entidades.Veiculo)
	 */
	@Override
	public void inserir(Carro novo) {
		Repositorio.getBancoVeiculos().add(novo);

	}

	/* (non-Javadoc)
	 * @see br.imd.clarissa.dao.GenericDao#excluir(br.imd.clarissa.entidades.Veiculo)
	 */
	@Override
	public void excluir(Carro novo) {
		Repositorio.getBancoVeiculos().remove(novo);

	}

	/* (non-Javadoc)
	 * @see br.imd.clarissa.dao.GenericDao#listarTodos()
	 */
	@Override
	public void listarTodos() {
		int ordem = 1;
		
		for(Veiculo i: Repositorio.getBancoVeiculos()){
			if(i instanceof Carro)
				System.out.println(ordem+" Marca: "+i.getMarca()+" Modelo: "+i.getModelo());
		}	

	}

}
