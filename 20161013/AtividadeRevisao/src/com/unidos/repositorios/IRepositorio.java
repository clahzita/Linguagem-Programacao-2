/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.repositorios;

import com.unidos.entidades.Funcionario;

/**
 * Interface determina como o Repositorio deve ser.
 * @author clah
 * @version 1.0
 */
interface IRepositorio {
    
    public void inserirFuncionario(Funcionario f);
    public void deletarFuncionario (int matricula) throws Exception ;
    public void atualizarFuncionario(int matricula, Funcionario f) throws Exception;
    public Funcionario buscarFuncionario (int matricula);
    public void listarFuncionarios();
    
}
