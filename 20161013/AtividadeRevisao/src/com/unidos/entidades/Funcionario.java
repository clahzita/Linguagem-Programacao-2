
package com.unidos.entidades;
/**
 * Classe que representa um funcionário.
 * @author clah
 * @version 1.0
 *  
 */
public class Funcionario {
    /**
     * Atributo matrícula do funcionário. 
     */
    private int matricula;
    
    /**
     * Atributo nome do funcionário. 
     */
    private String nome;
    /**
     * Atributo CPF do funcionário. 
     */
    private String cpf;
    
    /**
     * Construtor de um novo funcinário.
     * @param matricula Refere-se a matrícula do funcionário.
     * @param nome Refere-se ao nome do funcionário.
     * @param cpf Refere-se ao número do CPF do funcionário.
     */
    public Funcionario(int matricula, String nome, String cpf) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    /**
     * Método que retorna a matrícula do funcionário.
     * @return Retorna a matricula do funcionário.
     */
    public int getMatricula() {
        return matricula;
    }
    
    /**
     * Método que altera a matrícula do funcionário.
     * @param matricula 
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
   /**
     * Método que retorna o nome do funcionário.
     * @return Retorna o nome do funcionário.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método que altera o nome do funcionário.
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
     /**
     * Método que retorna o cpf do funcionário.
     * @return Retorna o cpf do funcionário.
     */
    public String getCpf() {
        return cpf;
    }
    
    /**
     * Método que altera o CPF do funcionário.
     * @param cpf 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    
    
    
}
