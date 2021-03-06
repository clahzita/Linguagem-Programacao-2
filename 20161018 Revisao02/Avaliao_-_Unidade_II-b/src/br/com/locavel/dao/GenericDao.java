package br.com.locavel.dao;

import java.util.ArrayList;

import br.com.locavel.banco.Banco;
import br.com.locavel.entidades.Veiculo;

public interface GenericDao {
	/**
	 * Método que insere um veiculo a lista de cadastro.
	 * @param e Veículo a ser inserido na lista de cadastro.
	 */
	public default void inserir(Veiculo e){
		Banco.veiculosCadastrados.add(e);
	}
	/**
	 * Método que exclue um veiculo da lista de cadastro.
	 * @param e Veículo a ser excludio da lista de cadastro.
	 */
	public default void excluir(Veiculo e){
		Banco.veiculosCadastrados.remove(e);
	}
	/**
	 * Método que retorna uma lista de todos os veículos;
	 * @return
	 */
	public ArrayList<Veiculo> listarTodos();
	
}
