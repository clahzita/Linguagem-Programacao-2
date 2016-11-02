package br.imd.controle;

public class GenericException extends Exception {
	private String mensagem;
	
	public GenericException(String msg){
		super(msg);
		this.mensagem = msg;
	}
	
	public String getMessage(){
		return mensagem;
	}
	
	
}
