
public abstract class ContaBancaria {
	protected double saldo;
	
	public ContaBancaria() {
		this.saldo = 0.0;
	}
	

	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void depositar(double deposito){
		if(deposito > 0){
			this.saldo+=deposito;
		}
		
	}
	
	public void sacar(double saque){
		if(saldo > 0 && saque<= saldo){
			this.saldo-=saque;
		}			
	}   
		
	public void transferir(double valor,ContaBancaria destino){
		if(valor > 0 && valor <= this.saldo){
			this.sacar(valor);
			destino.depositar(valor);
			
		}
	}
	
	public abstract double calcularSaldo();
	
}
