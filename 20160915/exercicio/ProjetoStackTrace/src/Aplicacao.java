
public class Aplicacao {
	public static void main(String[] args){
		Pista pista1 = new Pista();
		
		try {
			pista1.iniciar();
		} catch (PistaException e) {
		
			e.printStackTrace();
		}
		
	}
}
