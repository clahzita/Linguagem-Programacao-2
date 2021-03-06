package br.imd.clarissa;

import br.imd.clarissa.entidades.ContaBancaria;
import br.imd.clarissa.entidades.ContaCorrente;
import br.imd.clarissa.entidades.ContaInvestimento;
import br.imd.clarissa.exceptions.SaldoInsuficienteException;

public class Aplicacao {

	public static void main(String[] args){
		ContaBancaria investimento = new ContaInvestimento(500);
		ContaBancaria contaCorrente = new ContaCorrente(200);
		
		
		/*try {
			investimento.sacar(50);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			contaCorrente.sacar(50);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		
		try {
			contaCorrente.transferir(350, investimento);
		} catch (SaldoInsuficienteException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(investimento.getSaldo());
		

	}

}
