/**
 * 
 */
package br.imd.clarissa.dao;

import br.imd.clarissa.banco.Repositorio;
import br.imd.clarissa.entidades.Carro;
import br.imd.clarissa.entidades.Moto;
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
		int cont = 0;
		
		for(Veiculo i: Repositorio.getBancoVeiculos()){
			if(i instanceof Carro){
				System.out.println(cont+1+" Marca: "+i.getMarca()+" Modelo: "+i.getModelo());
				cont++;
			}
		}
		
		System.out.println(cont+" carro(s) cadastrado(s)!");

	}

}
