package br.imd;

public class Fornecedor extends UsuarioAutenticavel {
	
	private String cidade;
	
	public Fornecedor(String nome, int senha, String cidade) {
		super(nome,senha);
		
		this.cidade = cidade;
	}
}
