
public class Carro extends Veiculo {
	private boolean quatroPortas;
	private int chassi;
	
	
	
	
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	public int getChassi() {
		return chassi;
	}

	public void setChassi(int chassi) {
		this.chassi = chassi;
	}

	public Carro(String marca) {
		super(marca);
		System.out.println("Carro()");
	}
	
	@Override
	public String toString() {
		return this.modelo;
	}
	
	public void imprimirDados(){
		super.imprimirDados();
		System.out.println("4 portas: "+ isQuatroPortas() );
	}
}
