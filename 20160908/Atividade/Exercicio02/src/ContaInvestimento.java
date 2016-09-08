
public class ContaInvestimento extends ContaBancaria {

	public ContaInvestimento() {
		super();
	}

	@Override
	public double calcularSaldo() {
		return super.saldo*1.05;
	}

}
