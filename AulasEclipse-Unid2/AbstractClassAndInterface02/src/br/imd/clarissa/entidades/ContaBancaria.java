package br.imd.clarissa.entidades;
import br.imd.clarissa.exceptions.SaldoInsuficienteException;

public abstract class ContaBancaria {
	private double saldo;
	
	
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor){
		if(valor < 0){
			throw new IllegalArgumentException("Você digitou um valor inválido");
		}
		else{
			this.saldo += valor;
			System.out.println("Operação realizada com sucesso!");
		}
		
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException{
					
		if(valor < 0){
			throw new IllegalArgumentException("Você digitou um valor inválido.");
		}
		else if (valor <= this.saldo){
			this.saldo -= valor;
			System.out.println("Operação realizada com sucesso!");
		}
		else{
			throw new SaldoInsuficienteException(valor);
		}
		System.out.println("Seu saldo atual é "+this.saldo+" reais.");
	}
	
	public void transferir(double valor, ContaBancaria conta) throws SaldoInsuficienteException{
		if(valor < 0){
			throw new IllegalArgumentException("Você digitou um valor inválido");
		}
		else if(valor<=saldo){
			this.saldo-=valor;
			conta.depositar(valor);
		}else{
			throw new SaldoInsuficienteException("Seu saldo é insuficiente, tente um valor menor que "+saldo+".");
		}
		System.out.println("Seu saldo atual é "+this.saldo+" reais.");

	}
	
	public abstract double calcularSaldo();
	
}
