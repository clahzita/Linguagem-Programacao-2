package br.com.locavel.banco;

import java.util.ArrayList;

import br.com.locavel.entidades.Carro;
import br.com.locavel.entidades.Moto;
import br.com.locavel.entidades.Veiculo;

public class Banco {
	public static ArrayList<Veiculo> veiculosCadastrados = new ArrayList<Veiculo>();
	
	private Banco(){}
	
	 
	public int qtdeVeiculos(){
		return Banco.veiculosCadastrados.size();
	}
	
	public int qtdeCarros(){
		int cont = 0;
		for(Veiculo x: Banco.veiculosCadastrados){
			if(x instanceof Carro){
				cont++;
			}
		}
		return cont;
	}
	
	public int qtdeMotos(){
		int cont = 0;
		for(Veiculo x: Banco.veiculosCadastrados){
			if(x instanceof Moto){
				cont++;
			}
		}
		return cont;
	}
	
	
}
