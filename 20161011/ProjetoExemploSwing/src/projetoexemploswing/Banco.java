/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoexemploswing;

import java.util.ArrayList;
import projetoexemploswing.Dominio.Autor;
import projetoexemploswing.Dominio.Livro;

/**
 *
 * @author clah
 */
public class Banco {
    public static ArrayList<Livro> BANCO_LIVROS = new ArrayList<Livro>();
    public static ArrayList<Autor> BANCO_AUTOR = new ArrayList<Autor>();

    public static ArrayList<Autor> getBANCO_AUTOR() {
        return BANCO_AUTOR;
    }

    public static ArrayList<Livro> getBANCO_LIVROS() {
        return BANCO_LIVROS;
    }
    
    
   
    
    
    
}
