/**
 * 
 */
package br.imd.clarissa.entidades;

/**
 * @author clarissa
 * @version	1.0
 */
public class Carro extends Veiculo {
	/**
	 * Esse atributo refere-se a potência do motor do carro em cavalos
	 */
	private int potenciaMotor;
	/**
	 * Esse atributo refere-se a quantidade de portas do carro.
	 */
	private int portas;
	
	/**
	 * Método constrói um objeto carro.
	 * @param marca
	 * @param modelo
	 * @param potenciaMotor
	 * @param portas
	 */
	public Carro(String marca, String modelo, int potenciaMotor, int portas) {
		super(marca, modelo);
		this.setPortas(portas);
		this.setPotenciaMotor(potenciaMotor);
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		if(potenciaMotor >= 1.0 && potenciaMotor <= 3.0){
			this.potenciaMotor = potenciaMotor;
		}
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		if(portas >= 2 && portas <=5){
			this.portas = portas;
		}
		
	}
	
	
	
	

}
