/**
 * 
 */
package br.imd.clarissa.dao;

import br.imd.clarissa.entidades.Veiculo;

/**
 * @author clarissa
 * @version 1.0
 */
public interface GenericDao<V> {
	
	void inserir(V novo);
	void excluir(V novo);
	void listarTodos();

}
