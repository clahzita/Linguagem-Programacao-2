
public class aplicacao {

	public static void main(String[] args) {
		ContaBancaria cc = new ContaCorrente();
		ContaBancaria ci = new ContaInvestimento();
		
		cc.depositar(550.00);
		System.out.println(cc.getSaldo());
		cc.sacar(200.00);
		System.out.println(cc.getSaldo());
		cc.transferir(150, ci);
		System.out.println(cc.getSaldo());
		System.out.println(ci.getSaldo());
		System.out.println("Operações com CI");
		ci.depositar(200.00);
		System.out.println(ci.getSaldo());
		ci.sacar(55.00);
		System.out.println(ci.getSaldo());
		ci.transferir(100, cc);
		System.out.println(ci.getSaldo());
		System.out.println(cc.getSaldo());

	}

}
