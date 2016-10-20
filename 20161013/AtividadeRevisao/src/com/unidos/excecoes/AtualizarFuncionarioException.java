/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.excecoes;

import com.unidos.entidades.Funcionario;
import com.unidos.repositorios.Repositorio;

/**
 *
 * @author clah
 */
public class AtualizarFuncionarioException extends Exception {
    
    public AtualizarFuncionarioException(int matricula){
        
        super("Matrícula "+matricula+" não cadastrada!");
        
    
    }
    
    
}
