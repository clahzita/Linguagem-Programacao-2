/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.entidades;

/**
 * Classe que representa um Secretário
 * @author clah
 * @version 1.0
 */
public class Secretario extends Funcionario{
    
    /**
     * Construtor de um novo Secretário.
     * @param matricula Refere-se a matrícula do Secretário.
     * @param nome Refere-se ao nome do Secretário.
     * @param cpf Refere-se ao número do CPF do Secretário.
     */
    public Secretario(int matricula, String nome, String cpf) {
        super(matricula, nome, cpf);
    }
      
    
}
