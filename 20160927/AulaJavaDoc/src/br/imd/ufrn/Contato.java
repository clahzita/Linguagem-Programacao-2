package br.imd.ufrn;
/**
 * Classe que representa um contato
 * 
 * @author Clarissa Soares
 * @version 1.0
 * @
 *
 */

public class Contato {
	
	/**
	 * Nome do contato
	 */
	private String nome;
	/**
	 * Email do contato
	 */
	private String email;
	/**
	 * Endereco do contato
	 */
	private Endereco endereco = new Endereco();
	
	/**
	 * Construtor da Classe Contato
	 * @param nome Nome do Contato
	 * @param email E-mail do Contato
	 */
	public Contato(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	
	/**
	 * Define endereço do contato
	 * @param rua Nome da rua do contato
	 * @param numero Número do domicílio do contato
	 */
	public void definirEndereco(String rua, int numero){
		endereco.setRua(rua);
		endereco.setNumero(numero);
	}

	/**
	 * Retorna o nome do contato
	 * @return Nome do Contato
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Retorna o email do contato
	 * @return Email do contato
	 */
	public String getEmail() {
		return email;
	}
	
}
