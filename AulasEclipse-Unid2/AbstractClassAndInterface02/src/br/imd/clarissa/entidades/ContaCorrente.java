package br.imd.clarissa.entidades;
public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcularSaldo() {
		return super.getSaldo()*0.9;

	}

}