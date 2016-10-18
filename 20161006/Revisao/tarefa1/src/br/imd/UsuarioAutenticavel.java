package br.imd;

public abstract class UsuarioAutenticavel {
	private String nome;
	private int senha;
	
	
	
	public UsuarioAutenticavel(String nome, int senha) {
		
		this.nome = nome;
		this.senha = senha;
	}

	public boolean autentica(int senha){
		return true;
	}
	
}
