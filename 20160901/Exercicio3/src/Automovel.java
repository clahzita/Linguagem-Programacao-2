
public class Automovel extends Veiculo {

	public Automovel(boolean ligado) {
		super(ligado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		super.ligar();
		System.out.println("Automovel ligado");
	}
	
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		super.desligar();
		System.out.println("Automovel desligado");
	}

}
