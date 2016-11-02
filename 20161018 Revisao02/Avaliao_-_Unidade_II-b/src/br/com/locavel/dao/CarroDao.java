/**
 * 
 */
package br.com.locavel.dao;

import java.util.ArrayList;

import br.com.locavel.banco.Banco;
import br.com.locavel.entidades.Carro;
import br.com.locavel.entidades.Veiculo;

/**
 * @author clarissa
 * @version 1.0
 */
public class CarroDao implements GenericDao {


	/* (non-Javadoc)
	 * @see br.com.locavel.dao.GenericDao#listarTodos()
	 */
	@Override
	public ArrayList<Veiculo> listarTodos() {
		ArrayList<Veiculo> soCarro = new ArrayList<Veiculo>();
		for(Veiculo x: Banco.veiculosCadastrados){
			if(x instanceof Carro){
				soCarro.add(x);
			}
		}
		return soCarro;
	}

}
