
public class Principal {

	public static void main(String[] args) {
		
		Ferrari f1 = new Ferrari();
		AnelDeBrilhante a = new AnelDeBrilhante();
		
		Vendedor v = new Vendedor();
		
		v.mostrarPreco(f1);//<-- Polimorfismo dentro do parametro
		v.mostrarPreco(a);//<-- Polimorfismo

		//Rota rota = new Rota();
		//rota.ir(f1);//<-- Polimorfismo
		//f1.abrirPorta();
		//f1.getPreco();

	}

}
