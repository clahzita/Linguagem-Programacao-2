package exemplo2;


public class Banco {
	public void realizarOperacao() throws SaldoInsuficienteException, ValorNegativoException{
		ContaBancaria c = new ContaBancaria(1000);
		c.sacar(2000);
		System.out.println("Sucesso");
		
	}

}
