
public class Motocicleta extends Veiculo {

	public Motocicleta(boolean ligado) {
		super(ligado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		super.ligar();
		System.out.println("Motocilceta ligada");
	}
	
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		super.desligar();
		System.out.println("Motocilceta desligada");
	}
	
	
}
