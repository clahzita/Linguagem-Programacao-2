package br.imd.clarissa.entidades;

public class ContaInvestimento extends ContaBancaria {

	public ContaInvestimento(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo()*1.05;
	}

}