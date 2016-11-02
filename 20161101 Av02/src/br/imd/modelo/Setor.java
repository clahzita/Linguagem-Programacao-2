package br.imd.modelo;

public class Setor {
	private int codigoSetor;
	private String descricaoSetor;
	
	public Setor(int codigoSetor, String descricaoSetor) {
		super();
		this.setCodigoSetor(codigoSetor);
		this.setDescricaoSetor(descricaoSetor);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public String getDescricaoSetor() {
		return descricaoSetor;
	}

	public void setDescricaoSetor(String descricaoSetor) {
		this.descricaoSetor = descricaoSetor;
	}
	
	
	
	
}
