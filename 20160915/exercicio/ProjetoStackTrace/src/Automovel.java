
public class Automovel {
	private static final int VELOCIDADE_MAXIMA = 180;
	private int velocidadeAtual;
	
	public void acelerar(int velocidade) throws VelocidadePermitidaException{
		if(velocidadeAtual+velocidade> VELOCIDADE_MAXIMA){
			throw new VelocidadePermitidaException("Excedeu o limite de velocidade máxima do automovel");
		}
		
		this.velocidadeAtual +=velocidade;
		
	}
	
	

}
