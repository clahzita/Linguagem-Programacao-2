class Trapezio{
	double baseMaior;
	double baseMenor;
	double altura;

	public Trapezio(){
		baseMenor = 1.0;
		baseMaior = 1.0;
		altura = 1.0;
	}

	public Trapezio(double baseMaior, double baseMenor, double altura){
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.altura = altura;
	}

	public double getBaseMaior(){
		return this.baseMaior;
	}

	public void setBaseMaior(double baseMaior){
		this.baseMaior = baseMaior;
	}

	public double getAltura(){
		return this.altura;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public double getBaseMenor(){
		return this.baseMenor;
	}

	public void setBaseMenor(double baseMenor){
		this.baseMenor = baseMenor;
	}

	public double calcularArea(){
		return (baseMaior+baseMenor)/2*altura;
	}
}