/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.entidades;

/**
 * Classe que representa um Diretor.
 * @author clah
 * @version 1.0
 */
public class Diretor extends Funcionario{
    /**
     * Atributo senha do Diretor
     */
    private String senha;
    /**
     * Atributo setor do Diretor
     */
    private String setor;

    /**
     * Construtor de um novo Diretor
     * @param senha
     * @param setor
     * @param matricula
     * @param nome
     * @param cpf 
     */
    public Diretor(String senha, String setor, int matricula, String nome, String cpf) {
        super(matricula, nome, cpf);
        this.senha = senha;
        this.setor = setor;
    }    
    /**
     * Método que retorna a senha do Diretor.
     * @return Retorna a senha do Diretor.
     */
    public String getSenha() {
        return senha;
    }    
    /**
     * Método que altera a senha do Diretor.
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Método que retorna o setor do Diretor.
     * @return Retorna o setor do Diretor.
     */
    public String getSetor() {
        return setor;
    }    
    /**
     * Método que altera o setor do Diretor.
     * @param setor 
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
    
}
