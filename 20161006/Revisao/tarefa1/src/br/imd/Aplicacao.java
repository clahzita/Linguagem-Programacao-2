package br.imd;
import java.util.ArrayList;

import br.imd.funcionario.AuxiliarAdministrativo;
import br.imd.funcionario.Diretor;
import br.imd.funcionario.Funcionario;
import br.imd.funcionario.Gerente;
import br.imd.funcionario.Secretario;
import br.imd.repositorio.Repositorio;
import br.imd.repositorio.RepositorioFuncionario;




public class Aplicacao {

	public static void main(String[] args) {
		RepositorioFuncionario funcionarios = new RepositorioFuncionario();	
		
		AuxiliarAdministrativo func1 = new AuxiliarAdministrativo("201012", "Valter","58844422265");
		Gerente gerente1 = new Gerente("201411", "Marcela", "54478896614", "Administrativo", "1234");
		Secretario secretario1 = new Secretario("200915", "Marcone", "14452236699");
		Diretor diretorgeral = new Diretor("200825", "Fernanda", "25541163388", "Tecnologia da Informação", "456123"); 
		
		funcionarios.inserirFuncionario(func1);
		funcionarios.inserirFuncionario(gerente1);
		funcionarios.inserirFuncionario(secretario1);
		funcionarios.inserirFuncionario(diretorgeral);
		
		listarFuncionarios(funcionarios.getBanco().getBanco());
		
		
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


