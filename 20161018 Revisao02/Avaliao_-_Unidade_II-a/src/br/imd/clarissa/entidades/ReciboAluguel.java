/**
 * 
 */
package br.imd.clarissa.entidades;

import java.time.format.DateTimeFormatter;

/**
 * @author clarissa
 *
 */
public class ReciboAluguel {
	private static String reciboImpresso;


	public static String fazerRecibo(Aluguel aluguel){
		reciboImpresso = "#Recibo de Aluguel#\n";
		reciboImpresso += "Modelo do Veiculo:"+aluguel.getVeiculo().getModelo()+"\n";
		reciboImpresso += "Valor Total: R$"+aluguel.getValorPgto()+"\n";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		reciboImpresso += "Data Devolução:"+aluguel.getDataDevolucao().format(formato)+"\n";
		reciboImpresso += "####################\n";
		return reciboImpresso;
		
	}

}
