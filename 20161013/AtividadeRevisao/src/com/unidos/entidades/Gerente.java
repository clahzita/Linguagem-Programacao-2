/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.entidades;

/**
 * Classe que representa um Gerente 
 * @author clah
 * @version 1.0
 */
public class Gerente extends Funcionario {
    /**
     * Atributo senha do Gerente
     */
    private String senha;
    /**
     * Atributo setor do Gerente
     */
    private String setor;

    /**
     * Construtor de um novo Gerente
     * @param senha
     * @param setor
     * @param matricula
     * @param nome
     * @param cpf 
     */
    public Gerente(String senha, String setor, int matricula, String nome, String cpf) {
        super(matricula, nome, cpf);
        this.senha = senha;
        this.setor = setor;
    }
    
    /**
     * Método que retorna a senha do Gerente.
     * @return Retorna a senha do Gerente.
     */
    public String getSenha() {
        return senha;
    }    
    /**
     * Método que altera a senha do Gerente.
     * @param senha 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Método que retorna o setor do Gerente.
     * @return Retorna o setor do Gerente.
     */
    public String getSetor() {
        return setor;
    }    
    /**
     * Método que altera o setor do Gerente.
     * @param setor 
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }
}
