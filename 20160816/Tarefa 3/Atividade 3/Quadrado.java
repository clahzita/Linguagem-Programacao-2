public class Quadrado{
	double lado;

	public Quadrado(){
		lado = 1.0;
	}

	public Quadrado(double lado){
		this.lado = lado;
	}

	public double getLado(){
		return this.lado;
	}

	public void setLado(double lado){
		this.lado = lado;
	}

	public double calcularArea(){
		return this.lado*this.lado;
	}
}