package exemplo1;

public class Principal {

	public static void main(String[] args){
		
		Banco b = new Banco();
		
		try {
			b.realizarOperacao();
		} catch (Exception e) {

			System.out.println("Ocorreu um erro! "+e.getMessage());
		}
		
		
		

	}

}