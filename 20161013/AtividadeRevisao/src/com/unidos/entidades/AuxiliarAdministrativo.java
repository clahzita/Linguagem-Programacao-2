/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unidos.entidades;

/**
 * Classe que representa Auxiliar Administrativo
 * @author clah
 * @version 1.0
 */
public class AuxiliarAdministrativo extends Funcionario {
    /**
     * Construtor de um novo Auxiliar Administrativo.
     * @param matricula Refere-se a matrícula do Auxiliar Administrativo.
     * @param nome Refere-se ao nome do Auxiliar Administrativo.
     * @param cpf Refere-se ao número do CPF do Auxiliar Administrativo.
     */
    public AuxiliarAdministrativo(int matricula, String nome, String cpf) {
        super(matricula, nome, cpf);
    }
    
}
