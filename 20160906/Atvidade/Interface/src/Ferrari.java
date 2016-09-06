
public class Ferrari implements Carro,ItemCaro{

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virando a esquerda...");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virando a direita...");
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerando...");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Porta da Ferrari aberta!");
		
	}

	@Override
	public double getPreco() {
		return 254899.90;
	}

	
}
