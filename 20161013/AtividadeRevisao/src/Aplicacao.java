
import com.unidos.entidades.AuxiliarAdministrativo;
import com.unidos.entidades.Diretor;
import com.unidos.entidades.Funcionario;
import com.unidos.entidades.Gerente;
import com.unidos.repositorios.RepositorioFuncionario;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clah
 * @version 1.0
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RepositorioFuncionario teste = new RepositorioFuncionario();
        
        teste.inserirFuncionario(new Gerente("123", "Vendas", 25, "Mário Dantas", "06677488587"));
        teste.inserirFuncionario(new Gerente("789", "Administrativo", 10, "Marcela Caxias", "45678912355"));
        teste.inserirFuncionario(new Diretor("456", "Suporte", 11, "Marta Silva", "45678912300"));
        teste.inserirFuncionario(new Diretor("321", "Vendas", 21, "Lúcio Mota", "12544778899"));
        
        
        
        listarTodosNomesSetor(teste.getRepositorio().getBanco());
        
        listarGerentes(teste.getRepositorio().getBanco());
        
        listarFuncionarios(teste.getRepositorio().getBanco());
        
        
        
    }
    
    public static void listarFuncionarios(ArrayList<Funcionario> f){
        System.out.println("Lista de Funcionários");
        for(Funcionario x: f){
            System.out.println("Matrícula: "+x.getMatricula()+" Nome:"+x.getNome()+" CPF: "+x.getCpf());
        }
        
    }
    
    public static void listarGerentes(ArrayList<Funcionario> f){
        System.out.println("Lista de Gerentes");
        for(Funcionario x: f){
            if(x instanceof Gerente){
                System.out.println("Matrícula: "+x.getMatricula()+" Nome:"+x.getNome()+" CPF: "+x.getCpf());
            }
        }
    }
    
    public static void listarAuxiliarAdministrativo(ArrayList<Funcionario> f){
        System.out.println("Lista de Gerentes");
        for(Funcionario x: f){
            if(x instanceof AuxiliarAdministrativo){
                System.out.println("Matrícula: "+x.getMatricula()+" Nome:"+x.getNome()+" CPF: "+x.getCpf());
            }
        }
    }
    
    public static void listarTodosNomesSetor(ArrayList<Funcionario> f){
        System.out.println("Lista de Setores");
        ArrayList<String> setores = new ArrayList<String>();
        for(Funcionario x: f){
            if(x instanceof Gerente || x instanceof Diretor){
                String y = (x instanceof Gerente)? ((Gerente) x).getSetor() : ((Diretor) x).getSetor();
                
                if(!setores.contains(y)){
                    setores.add(y);
                }
            }
        }
        
        for(String setor: setores){
            System.out.println(setor);
        }
        
    }
    
}
