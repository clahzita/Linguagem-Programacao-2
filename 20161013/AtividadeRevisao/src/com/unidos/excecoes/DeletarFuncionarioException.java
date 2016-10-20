/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.excecoes;

import com.unidos.repositorios.Repositorio;

/**
 *
 * @author clah
 */
public class DeletarFuncionarioException extends Exception {
    
    public DeletarFuncionarioException(int matricula){
        if(Repositorio.getInstance().getBanco().size() == 0){
            System.out.println("Banco vazio!");
        }
        else{
            System.out.println("Matrícula "+matricula+" não cadastrada!");
        }
        
        
    
    }
}
