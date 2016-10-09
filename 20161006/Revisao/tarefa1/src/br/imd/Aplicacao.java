package br.imd;
import java.util.ArrayList;

import br.imd.funcionario.AuxiliarAdministrativo;
import br.imd.funcionario.Diretor;
import br.imd.funcionario.Funcionario;
import br.imd.funcionario.Gerente;
import br.imd.repositorio.RepositorioFuncionario;




public class Aplicacao {

	public static void main(String[] args) {
		RepositorioFuncionario funcionarios = new RepositorioFuncionario();
		
		
		
		
		funcionarios.inserirFuncionario(f1);

	}

	public static void listarFuncionarios(ArrayList<Funcionario> f){
		for(Funcionario funcionario: f){
				System.out.println("Nome: "+funcionario.getNome()+" Mat.: "+funcionario.getMatricula());
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
			if(funcionario instanceof Gerente || funcionario instanceof Diretor){
				System.out.println("Nome: " + funcionario.getNome()+" Setor: " + ((Diretor) funcionario).getSetor());
			}
			else{
				System.out.println("Nome: " + funcionario.getNome()+" Setor: Não definido");
			}
				         
			
		}
	}
	
}


