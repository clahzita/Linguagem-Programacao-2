
public class Aplicacao {

	public static void main(String[] args) throws Exception {
		Porta porta1 = new Porta(2.1, 0.9);
		
		porta1.abrir();
		System.out.println(porta1.isAberta());
		
		Porta porta2 = (Porta) porta1.clone();
		System.out.println(porta2.isAberta());
		
		porta2.fechar();
		System.out.println(porta2.isAberta());
		System.out.println(porta1.isAberta());


	}

}
