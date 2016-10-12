/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemploswing.Dominio.DAO;

import java.util.ArrayList;
import projetoexemploswing.Banco;
import projetoexemploswing.Dominio.Livro;

/**
 *
 * @author clah
 */
public class LivroDao implements GenericDao<Livro> {

    @Override
    public void inserir(Livro obj) {
        Banco.BANCO_LIVROS.add(obj);
    }

    @Override
    public void apagar(Livro obj) {
        Banco.BANCO_LIVROS.remove(obj);
    }

    @Override
    public void alterar(Livro obj) {
        
    }

    @Override
    public ArrayList<Livro> buscarTodos() {
        return Banco.getBANCO_LIVROS();
    }
    
}
