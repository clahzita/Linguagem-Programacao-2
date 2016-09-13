
public class Veiculo {
	private boolean ligado;
	
	public Veiculo(boolean ligado) {
		super();
		this.ligado = ligado;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void ligar(){
		if(!this.ligado){
			this.ligado = true;
		}
	}
	
	public void desligar(){
		if(this.ligado){
			this.ligado = false;
		}
	}

}