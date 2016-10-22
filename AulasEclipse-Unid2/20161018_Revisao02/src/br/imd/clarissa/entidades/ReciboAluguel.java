/**
 * 
 */
package br.imd.clarissa.entidades;

/**
 * @author clarissa
 *
 */
public class ReciboAluguel {
	private String reciboImpresso;
	
	public String getReciboImpresso() {
		return reciboImpresso;
	}

	public void setReciboImpresso(String reciboImpresso) {
		this.reciboImpresso = reciboImpresso;
	}


	public void fazerRecibo(Aluguel aluguel){
		reciboImpresso = "#Recibo de Aluguel#\n";
		reciboImpresso += "Modelo do Veiculo:"+aluguel.getVeiculo().getModelo()+"\n";
		reciboImpresso += "Valor Total: R$"+aluguel.getValorPgto()+"\n";
		reciboImpresso += "Data Devolução:"+aluguel.getDataDevolucao()+"\n";
		
	}

}
