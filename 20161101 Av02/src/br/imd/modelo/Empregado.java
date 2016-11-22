package br.imd.modelo;

import br.imd.controle.FaltandoDadosExecption;

public class Empregado extends Pessoa {
	private Setor setor;
	private double salarioBase;
	private int imposto;
	
	public Empregado(String nome, String endereco, String telefone, String sexo, int anoNascimento, Setor setor,
			double salarioBase, int imposto) throws FaltandoDadosExecption, ValoresNegativosExecption {
		super(nome, endereco, telefone, sexo, anoNascimento);
		this.setSetor(setor);
		this.setSalarioBase(salarioBase);
		this.setImposto(imposto);
	
	}

	
	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) throws FaltandoDadosExecption {
		if(setor != null){
			this.setor = setor;
		}else{
			throw new FaltandoDadosExecption();
		}
		
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) throws ValoresNegativosExecption {
		if(salarioBase > 0){
			this.salarioBase = salarioBase;
		}else{
			throw new ValoresNegativosExecption();
		}		
	}
	
	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) throws ValoresNegativosExecption {
		
		if(imposto > 0){
			this.imposto = imposto;
		}else{
			throw new ValoresNegativosExecption();
		}
	}

	public double calcularSalario(){
		double desconto = this.salarioBase * this.imposto / 100;
		return this.salarioBase - desconto;
	}

}