
public class main {

	public static void main(String[] args) {
		AreaCalculavel circulo = new Circulo(5.0);
		AreaCalculavel quadrado = new Quadrado(12.0);
		
		System.out.printf("Area do circulo: %.2f\n",circulo.calcularArea());
		System.out.printf("Area do quadrado: %.2f\n",quadrado.calcularArea());

	}

}