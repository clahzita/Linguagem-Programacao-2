package br.imd.clarissa;

public class Aplicacao {

	public static void main(String[] args) throws Exception{
		Porta porta = new Porta(5.0, 2.0);
		
		porta.abrir();
		porta.clone();
		
		Porta clone = (Porta)porta.clone();
		
		System.out.println(porta.isAberta());
		System.out.println(clone.isAberta());
	}

}
