class Triangulo{
	double base;
	double altura;

	public Triangulo(){
		base = 1.0;
		altura = 1.0;
	}

	public Triangulo(double base, double altura){
		this.base = base;
		this.altura =  altura;
	}

	public double getBase(){
		return this.base;
	}

	public void setBase(double base){
		this.base = base;
	}

	public double getAltura(){
		return this.altura;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}


	public double calcularArea(){
		return (this.base*this.altura)/2.0;
	}
}