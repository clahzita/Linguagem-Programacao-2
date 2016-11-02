package br.imd.controle;

import br.imd.modelo.Empregado;
import br.imd.modelo.Fornecedor;
import br.imd.modelo.Pessoa;
import br.imd.modelo.Setor;

public interface GenericDAO {
	public void inserirPessoa(Pessoa pessoa);
	public void inserirFornecedor(Fornecedor fornecedor);
	public void inserirEmpregado(Empregado empregado);
	public void inserirSetor(Setor setor);
	public void listarPessoas();
	public void listarFornecedores();
	public void listarEmpregados();
	public void listarSetores();
	
}
