/**
 * 
 */
package br.imd.clarissa.entidades;

/**
 * @author clarissa
 *
 */
public class Moto extends Veiculo {
	private boolean manual;
	private int cilindradas;
	
	public Moto(String marca, String modelo, boolean manual, int cilindradas) {
		super(marca, modelo);
		this.manual = manual;
		this.cilindradas = cilindradas;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
	
	
	
}
