/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemploswing.Dominio.DAO;

import java.util.ArrayList;
import projetoexemploswing.Banco;
import projetoexemploswing.Dominio.Autor;

/**
 *
 * @author clah
 */
public class AutorDao implements GenericDao<Autor> {

    @Override
    public void inserir(Autor obj) {
        Banco.BANCO_AUTOR.add(obj);
    }

    @Override
    public void apagar(Autor obj) {
        Banco.BANCO_AUTOR.remove(obj);
    }

    @Override
    public void alterar(Autor obj) {
        
    }

    @Override
    public ArrayList<Autor> buscarTodos() {
        return Banco.getBANCO_AUTOR();
    }
    
}
