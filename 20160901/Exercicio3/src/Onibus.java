
public class Onibus extends Veiculo {

	public Onibus(boolean ligado) {
		super(ligado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		super.ligar();
		System.out.println("Onibus ligado");
	}
	
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		super.desligar();
		System.out.println("Onibus desligado");
	}

}
