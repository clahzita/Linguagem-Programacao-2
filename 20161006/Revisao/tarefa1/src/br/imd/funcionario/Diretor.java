package br.imd.funcionario;

public class Diretor extends Funcionario {
	private String setor;
	private String senha;
	
	public Diretor(String matricula, String nome, String CPF, String setor,
			String senha) {
		super(matricula, nome, CPF);
		this.setor = setor;
		this.senha = senha;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	

	

}
