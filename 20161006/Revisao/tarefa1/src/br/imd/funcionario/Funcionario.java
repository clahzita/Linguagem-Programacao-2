package br.imd.funcionario;

abstract public class Funcionario {
	protected String matricula;
	protected String nome;
	protected String CPF;
	
	
	
	public Funcionario(String matricula, String nome, String CPF) {
		this.matricula = matricula;
		this.nome = nome;
		this.CPF = CPF;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
