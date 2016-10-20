/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.repositorios;

import com.unidos.entidades.Funcionario;
import java.util.ArrayList;

/**
 * Classe que representa um repósitorio único.
 * @author clah
 * @version 1.0
 */
public class Repositorio {
    private static ArrayList<Funcionario> banco = new ArrayList<Funcionario>();
    private static Repositorio repositorio = new Repositorio();
    
    private Repositorio(){
        
    }
    
    public static synchronized Repositorio getInstance(){
        return repositorio;
    }
    
    public ArrayList<Funcionario> getBanco() {
        return banco;
    }

    public void setBanco(ArrayList<Funcionario> banco) {
        Repositorio.banco = banco;
    }
      
}
