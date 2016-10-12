package br.imd;

public class Fornecedor extends UsuarioAutenticavel {
	
	private String nome;
	private String senha;
	private String cidade;
	
	public Fornecedor(String nome, String senha, String cidade) {

		this.nome = nome;
		this.senha = senha;
		this.cidade = cidade;
	}
}
