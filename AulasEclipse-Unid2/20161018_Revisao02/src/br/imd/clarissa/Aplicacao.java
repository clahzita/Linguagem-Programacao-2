package br.imd.clarissa;

import br.imd.clarissa.banco.Repositorio;
import br.imd.clarissa.dao.MotoDao;
import br.imd.clarissa.entidades.Aluguel;
import br.imd.clarissa.entidades.Carro;
import br.imd.clarissa.entidades.Cliente;
import br.imd.clarissa.entidades.Moto;
import br.imd.clarissa.entidades.Veiculo;

public class Aplicacao {

	public static void main(String[] args) {
		Veiculo moto1 = new Moto("Yamaha", "YBR", true, 125);
		Veiculo moto2 = new Moto("Honda", "CG", true, 150);
		Veiculo pedidoMoto = new Moto("YBR", 125);
		
		Veiculo carro1 = new Carro("Chevrolet", "Onix",1.0 ,4);
		Veiculo carro2 = new Carro("Hyundai", "HB20",1.6 ,2);
		Veiculo pedidoCarro = new Carro("Onix", 1.0);
		
		MotoDao motos = new MotoDao();
		motos.inserir((Moto) moto1);
		motos.inserir((Moto) moto2);
		motos.listarTodos();
		
		Aluguel alug1 = new Aluguel(new Cliente("Jula", "3244"),pedidoMoto, "21/10/2016");
		
		
		
		

	}

}
