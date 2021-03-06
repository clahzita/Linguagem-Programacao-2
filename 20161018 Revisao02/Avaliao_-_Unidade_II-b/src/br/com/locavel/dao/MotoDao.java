/**
 * 
 */
package br.com.locavel.dao;

import java.util.ArrayList;

import br.com.locavel.banco.Banco;
import br.com.locavel.entidades.Moto;
import br.com.locavel.entidades.Veiculo;

/**
 * @author clarissa
 * @version 1.0
 * 
 */
public class MotoDao implements GenericDao {


	/* (non-Javadoc)
	 * @see br.com.locavel.dao.GenericDao#listarTodos()
	 */
	@Override
	public ArrayList<Veiculo> listarTodos() {
		ArrayList<Veiculo> soMotos = new ArrayList<Veiculo>();
		for(Veiculo x: Banco.veiculosCadastrados){
			if(x instanceof Moto){
				soMotos.add(x);
			}
		}
		return soMotos;
	}

}
