/**
 * 
 */
package br.imd.clarissa.entidades;

/**
 * @author clarissa
 *
 */
public class Moto extends Veiculo {
	private boolean partidaManual;
	private int cilindradas;
	
	public Moto(String marca, String modelo, boolean manual, int cilindradas) {
		super(marca, modelo);
		this.partidaManual = manual;
		this.cilindradas = cilindradas;
	}
	
	public Moto(String modelo, int cilindradas) {
		super(modelo);
		this.partidaManual = true;
		this.cilindradas = cilindradas;
	}

	public boolean isPartidaManual() {
		return partidaManual;
	}

	public void setPartidaManual(boolean partidaManual) {
		this.partidaManual = partidaManual;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
	
	
	
}
