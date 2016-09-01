
public class Principal {

	public static void main(String[] args) {
		Veiculo automovel = new Automovel(true);
		Veiculo moto = new Motocicleta(true);
		Veiculo onibus = new Onibus(true);
		
		onibus.desligar();
		if(onibus.isLigado()){
			System.out.println("on");
		}else{
			System.out.println("off");
		}
		onibus.ligar();
		
		automovel.desligar();
		if(automovel.isLigado()){
			System.out.println("on");
		}else{
			System.out.println("off");
		}
		automovel.ligar();
		
		moto.desligar();
		if(moto.isLigado()){
			System.out.println("on");
		}else{
			System.out.println("off");
		}
		moto.ligar();
		
		

	}

}
