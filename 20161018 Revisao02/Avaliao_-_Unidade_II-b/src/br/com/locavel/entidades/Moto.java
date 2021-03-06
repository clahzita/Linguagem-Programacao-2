/**
 * 
 */
package br.com.locavel.entidades;

/**
 * @author clarissa
 *
 */
public class Moto extends Veiculo{
	private int cilindadra;
	private boolean tipoPartida;
	
	/**
	 * Método que instancia uma moto.
	 * @param marca
	 * @param modelo
	 * @param cilindadra
	 * @param tipoPartida
	 */
	public Moto(String marca, String modelo, int cilindadra, boolean tipoPartida) {
		super(marca, modelo);
		this.cilindadra = cilindadra;
		this.tipoPartida = tipoPartida;
	}

	public int getCilindadra() {
		return cilindadra;
	}

	public void setCilindadra(int cilindadra) {
		this.cilindadra = cilindadra;
	}

	public boolean isTipoPartida() {
		return tipoPartida;
	}

	public void setTipoPartida(boolean tipoPartida) {
		this.tipoPartida = tipoPartida;
	}
	
	

}
