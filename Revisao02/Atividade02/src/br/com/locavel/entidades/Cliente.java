/**
 * 
 */
package br.com.locavel.entidades;

/**
 * @author clarissa
 *
 */
public class Cliente {
	private String nome;
	private String cnh;
	public Cliente(String nome, String cnh) {
		super();
		this.nome = nome;
		this.cnh = cnh;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	
}
