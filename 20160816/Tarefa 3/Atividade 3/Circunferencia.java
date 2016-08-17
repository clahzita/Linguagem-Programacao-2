public class Circunferencia{
	double raio;

	public Circunferencia(){
		raio = 1.0;
	}

	public Circunferencia(double raio){
		this.raio = raio;
	}

	public double getRaio(){
		return this.raio;
	}

	public void setRaio(double raio){
		this.raio = raio;
	}

	public double calcularArea(){
		return this.raio * Math.PI;
	}
}