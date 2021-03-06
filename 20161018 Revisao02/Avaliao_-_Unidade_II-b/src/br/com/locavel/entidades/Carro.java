/**
 * 
 */
package br.com.locavel.entidades;

/**
 * @author clarissa
 * @version 1.0
 */
public class Carro extends Veiculo {
	private double potenciaMotor;
	private int qtdePortas;
	
	/**
	 * Método que instancia um carro.
	 * @param marca
	 * @param modelo
	 * @param potenciaMotor
	 * @param qtdePortas
	 */
	public Carro(String marca, String modelo, double potenciaMotor, int qtdePortas) {
		super(marca, modelo);
		this.setPotenciaMotor(potenciaMotor);
		this.setQtdePortas(qtdePortas);
	}

	public double getPotenciaMotor() {
		return potenciaMotor;
	}
	/**
	 * Método inicializa o valor da potencia do motor do carro, se for entre 1.0 e 3.0
	 * @param potenciaMotor Valor da potência do motor.
	 */
	public void setPotenciaMotor(double potenciaMotor) {
		if(potenciaMotor >= 1.0 && potenciaMotor <=3.0){
			this.potenciaMotor = potenciaMotor;
		}
		
	}

	public int getQtdePortas() {
		return qtdePortas;
	}
	
	/**
	 * Método inicializa o número de portas do carro (de 1 a 4).
	 * @param qtdePortas Quantidade de portas do carro.
	 */
	public void setQtdePortas(int qtdePortas) {
		if(1<=qtdePortas && qtdePortas <= 4){
			this.qtdePortas = qtdePortas;
		}
			
	}
	
	
	
	

}
