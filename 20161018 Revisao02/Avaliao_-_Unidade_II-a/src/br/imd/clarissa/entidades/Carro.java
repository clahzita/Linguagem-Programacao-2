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
	private double potenciaMotor;
	/**
	 * Esse atributo refere-se a quantidade de portas do carro.
	 */
	private int portas;
	
	/**
	 * Método constrói um objeto carro.
	 * @param marca
	 * @param modelo
	 * @param b
	 * @param portas
	 */
	public Carro(String marca, String modelo, double potenciaMotor, int portas) {
		super(marca, modelo);
		this.setPortas(portas);
		this.setPotenciaMotor(potenciaMotor);
	}
	
	public Carro(String modelo, double potenciaMotor) {
		super(modelo);
		this.setPotenciaMotor(potenciaMotor);
	}

	public double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(double potenciaMotor2) {
		if(potenciaMotor2 >= 1.0 && potenciaMotor2 <= 3.0){
			this.potenciaMotor = potenciaMotor2;
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
