
public class ContaCorrente extends ContaBancaria {

	public ContaCorrente() {
		super();
	}

	@Override
	public double calcularSaldo() {
		return super.saldo*0.9;
	}

}
