package br.imd.clarissa.banco;

import java.util.ArrayList;

import br.imd.clarissa.entidades.Aluguel;
import br.imd.clarissa.entidades.Veiculo;

public class Repositorio {
	private static ArrayList<Veiculo> bancoVeiculos = new ArrayList<Veiculo>();
	private static ArrayList<Aluguel> bancoAluguel = new ArrayList<Aluguel>();
    
    private Repositorio(){
        
    }
    

	public static ArrayList<Veiculo> getBancoVeiculos() {
		return bancoVeiculos;
	}

	public static void setBancoVeiculos(ArrayList<Veiculo> bancoVeiculos) {
		Repositorio.bancoVeiculos = bancoVeiculos;
	}

	public static ArrayList<Aluguel> getBancoAluguel() {
		return bancoAluguel;
	}

	public static void setBancoAluguel(ArrayList<Aluguel> bancoAluguel) {
		Repositorio.bancoAluguel = bancoAluguel;
	}
    


}
