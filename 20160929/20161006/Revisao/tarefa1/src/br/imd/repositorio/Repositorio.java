package br.imd.repositorio;
import br.imd.funcionario.Funcionario;
import java.util.ArrayList;

public class Repositorio{
	ArrayList<Funcionario> banco;
	
	public Repositorio() {
		banco = new ArrayList<Funcionario>();
	}

	public ArrayList<Funcionario> getBanco() {
		return banco;
	}

	public void setBanco(ArrayList<Funcionario> banco) {
		this.banco = banco;
	}
	
	
}
