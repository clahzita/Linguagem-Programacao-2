/**
 * 
 */
package br.imd.clarissa.dao;

import br.imd.clarissa.banco.Repositorio;
import br.imd.clarissa.entidades.Moto;
import br.imd.clarissa.entidades.Veiculo;

/**
 * @author clarissa
 *
 */
public class MotoDao implements GenericDao<Moto> {

	@Override
	public void inserir(Moto novo) {
		Repositorio.getBancoVeiculos().add(novo);
		
	}

	@Override
	public void excluir(Moto novo) {
		Repositorio.getBancoVeiculos().remove(novo);
		
	}

	@Override
	public void listarTodos() {
		int cont = 0;
		
		for(Veiculo i: Repositorio.getBancoVeiculos()){
			if(i instanceof Moto){
				System.out.println(cont+1+" Marca: "+i.getMarca()+" Modelo: "+i.getModelo());
				cont++;
			}
		}
		
		System.out.println(cont+" moto(s) cadastrada(s)!");
		
	}

}
