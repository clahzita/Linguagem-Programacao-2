/**
 * 
 */
package br.imd.clarissa;

/**
 * @author clarissa
 *
 */
public class Porta implements Cloneable {
	private double altura;
	private double largura;
	private boolean aberta;
	
	public Porta(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.aberta = false;
	}

	public double getAltura() {
		return altura;
	}

	public double getLargura() {
		return largura;
	}

	public boolean isAberta() {
		return aberta;
	}
	
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public void abrir(){
		this.aberta=true;
	}
	
	public void fechar(){
		this.aberta = false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Porta clone = new Porta(this.getAltura(),this.getLargura());
		clone.setAberta(this.isAberta());
		return clone;
	}

}
