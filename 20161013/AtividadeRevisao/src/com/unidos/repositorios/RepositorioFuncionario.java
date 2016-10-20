/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.repositorios;

import com.unidos.entidades.Funcionario;
import com.unidos.excecoes.AtualizarFuncionarioException;
import com.unidos.excecoes.DeletarFuncionarioException;

/**
 * Classe que representa um repósitorio de funcionário.
 * @author clah
 * @version 1.0
 * 
 */
public class RepositorioFuncionario implements IRepositorio{
    
    private Repositorio repositorio;

    public Repositorio getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }
    
    
    public RepositorioFuncionario() {
        this.repositorio = Repositorio.getInstance();
    }
        
    @Override
    public void inserirFuncionario(Funcionario f) {
        repositorio.getBanco().add(f);
    }

    @Override
    public void deletarFuncionario(int matricula) throws Exception {
        boolean removeu = false;
        
        for(Funcionario x: repositorio.getBanco()){
            if(x.getMatricula() == matricula){
                repositorio.getBanco().remove(x);
                removeu = true;
            }        
        }
        
        if(!removeu){
            throw new DeletarFuncionarioException(matricula);
        }
        
        
    }

    @Override
    public void atualizarFuncionario(int matricula, Funcionario f) throws Exception{
        
        boolean atualizou = false;
        
        for(Funcionario x: repositorio.getBanco()){
            if(x.getMatricula() == matricula){
                x.setNome(f.getNome());
                x.setCpf(f.getCpf());
                atualizou = true;
            }        
        }
        
        if(!atualizou){
            throw new AtualizarFuncionarioException(matricula);
        }
    }

    @Override
    public Funcionario buscarFuncionario(int matricula) {
        for(Funcionario x: repositorio.getBanco()){
            if(x.getMatricula() == matricula){
                return x;
            }        
        }
        return null;
    }

    @Override
    public void listarFuncionarios() {
        for(Funcionario x: repositorio.getBanco()){
            System.out.println( repositorio.getBanco().indexOf(x)+1 + " - " + x.getMatricula() + " - "+x.getNome()); 
        }
    }    
}
