package br.imd.modelo;

import br.imd.controle.FaltandoDadosExecption;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String sexo;
	private int anoNascimento;
	
	public Pessoa(String nome, String endereco, String telefone, String sexo, int anoNascimento) throws FaltandoDadosExecption, ValoresNegativosExecption {
		super();
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setSexo(sexo);
		this.setAnoNascimento(anoNascimento);
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws FaltandoDadosExecption {
		if(nome != null){
			this.nome = nome;
		}else{
			throw new FaltandoDadosExecption();
		}
		
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) throws FaltandoDadosExecption {
		if(endereco != null){
			this.endereco = endereco;
		}else{
			throw new FaltandoDadosExecption();
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) throws FaltandoDadosExecption {
		if(telefone != null){
			this.telefone = telefone;
		}else{
			throw new FaltandoDadosExecption();
		}
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) throws FaltandoDadosExecption {
		
		if(sexo != null){
			this.sexo = sexo;
		}else{
			throw new FaltandoDadosExecption();
		}
		
	}
	
	
	
	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) throws ValoresNegativosExecption {
		if(anoNascimento > 0){
			this.anoNascimento = anoNascimento;
		}else{
			throw new ValoresNegativosExecption();
		}
	}

	public int calcularIdade(int ano){
		return 2016 - this.anoNascimento;
	}
	
	

}

