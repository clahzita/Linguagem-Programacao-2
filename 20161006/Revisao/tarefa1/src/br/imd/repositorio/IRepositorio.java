package br.imd.repositorio;

import br.imd.funcionario.Funcionario;

public interface IRepositorio {
	
	void inserirFuncionario(Funcionario f);
	void deletarFuncionario(String matricula);
	void atualizarFuncionario(String matricula, String CPFCorreto);
	Funcionario buscarFuncionario(String matricula);
	void listarFuncionarios();
}