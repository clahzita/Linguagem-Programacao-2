public class Aplicacao{
	public static void main(String[] args){
		Circunferencia cir = new Circunferencia(2.0);
		System.out.println("área circunferencia: "+cir.calcularArea());

		Quadrado qua = new Quadrado(2.0);
		System.out.println("área quadrado: "+qua.calcularArea());

		Trapezio tra = new Trapezio(2.5,2.0,1.5);
		System.out.println("área trapezio: "+tra.calcularArea());

		Triangulo tri = new Triangulo(2.5,2.0);
		System.out.println("área triangulo: "+tri.calcularArea());
	}
}