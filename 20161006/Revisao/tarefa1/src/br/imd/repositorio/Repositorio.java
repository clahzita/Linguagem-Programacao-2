package br.imd.repositorio;
import java.util.ArrayList;

import br.imd.funcionario.Funcionario;

public class Repositorio{
	private ArrayList<Funcionario> banco = null;
	

	public Repositorio() {
		this.banco = new ArrayList<Funcionario>();
	}

	public ArrayList<Funcionario> getBanco() {
		return this.banco;
	}

	public void setBanco(ArrayList<Funcionario> banco) {
		this.banco = banco;
	}
	
	
}
