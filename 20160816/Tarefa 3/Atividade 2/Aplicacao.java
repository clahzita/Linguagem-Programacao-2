class Aplicacao{
	public static void main(String[] args){
		Fracao fracaoX = new Fracao();
		Fracao fracaoY = new Fracao(2.0,3.0);
		Fracao fracaoZ = new Fracao(3.0,4.0);

		fracaoY.imprimir();
		fracaoZ.imprimir();
		
		fracaoX = fracaoY.multiplica(fracaoZ);

		fracaoX.imprimir();
	}
}