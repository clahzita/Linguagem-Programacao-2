/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidos.testes;

import com.unidos.entidades.Funcionario;
import com.unidos.entidades.Gerente;
import com.unidos.repositorios.RepositorioFuncionario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe realiza testes sobre o metodo inserirFuncionario
 * @author clah
 * @version 1.0
 */
public class InserirFuncionarioTeste {
    private RepositorioFuncionario banco;
    Funcionario func1;
    
    @Before
    public void setUp() {
        banco = new RepositorioFuncionario();
        func1 = new Gerente("255", "Vendas", 20, "Valdir", "55544411122");
        
    }
    
    @Test
    public void inserirFuncionarioTeste01() throws Exception{
        
        assertEquals(0,banco.getRepositorio().getBanco().size(),0);
        
    }
    
    
    
    
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
