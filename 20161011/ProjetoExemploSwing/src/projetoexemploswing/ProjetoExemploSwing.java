
package projetoexemploswing;

import java.util.ArrayList;
import projetoexemploswing.Dominio.Autor;
import projetoexemploswing.Dominio.DAO.LivroDao;
import projetoexemploswing.Dominio.Livro;

/**
 *
 * @author clah
 */
public class ProjetoExemploSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro livro1= new Livro("Java", "11254kl", new Autor("Clarissa", "11422533600"));
        Livro livro2= new Livro("C++", "5245gh5", new Autor("Weverton", "78547896588"));
        
        LivroDao ld = new LivroDao();
        ld.inserir(livro2);
        ld.inserir(livro1);
        
        ArrayList<Livro> livros = ld.buscarTodos();
        
        for(Livro livro: livros) {
            System.err.println("Livro: "+livro.getTitulo());
        };
        
    }
    
}
