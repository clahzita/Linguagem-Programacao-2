package br.imd.clarissa.exceptions;

public class SaldoInsuficienteException extends Exception {

	
	public SaldoInsuficienteException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public SaldoInsuficienteException(double saldo){
		super("Seu saldo é insuficiente, tente um valor menor que "+saldo+".");
	}


}
