package br.imd;
import java.util.ArrayList;

import br.imd.funcionario.Funcionario;
import br.imd.funcionario.Gerente;




public class Aplicacao {

	public static void main(String[] args) {
		

	}

	public static void listarFuncionarios(ArrayList<Funcionario> f){
		for(Funcionario funcionario: f){
			if(funcionario instanceof Funcionario){
				System.out.println("Nome: "+funcionario.getNome()+" Mat.: "+funcionario.getMatricula());         
			}
		}
	}

	public static void listarGerentes(ArrayList<Funcionario> f){
		for(Funcionario funcionario: f){
			if(funcionario instanceof Gerente){
				System.out.println("Nome: "+funcionario.getNome()+" Mat.: "+funcionario.getMatricula());         
			}
		}
	}

	public static void listarAuxiliarAdministrativo(ArrayList<Funcionario> f){
		for(Funcionario funcionario: f){
			if(funcionario instanceof AuxiliarAdministrativo){
				System.out.println("Nome: "+funcionario.getNome()+" Mat.: "+funcionario.getMatricula());         
			}
		}
	}
	public static void imprimirTodosNomesSetor(ArrayList<Funcionario> f){
		for(Funcionario funcionario: f){
			
				System.out.println("Nome: " + funcionario.getNome()+" Mat.: " + funcionario.getMatricula());         
			
		}
	}
	
}


