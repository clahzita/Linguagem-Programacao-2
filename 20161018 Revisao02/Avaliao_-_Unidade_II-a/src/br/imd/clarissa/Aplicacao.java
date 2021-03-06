package br.imd.clarissa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.imd.clarissa.dao.CarroDao;
import br.imd.clarissa.dao.MotoDao;
import br.imd.clarissa.entidades.Aluguel;
import br.imd.clarissa.entidades.Carro;
import br.imd.clarissa.entidades.Cliente;
import br.imd.clarissa.entidades.Moto;
import br.imd.clarissa.entidades.ReciboAluguel;
import br.imd.clarissa.entidades.Veiculo;
import br.imd.clarissa.exceptions.CadastroAluguelException;

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
		//motos.listarTodos();
		
		CarroDao carros = new CarroDao();
		carros.inserir((Carro) carro1);
		carros.inserir((Carro) carro2);
		//carros.listarTodos();
		
		
		Aluguel alug1 = new Aluguel(new Cliente("Jula", null),pedidoMoto, LocalDate.of(2016,10,20));
		
		try {
			alug1.cadastrarAluguel();
		} catch (CadastroAluguelException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(ReciboAluguel.fazerRecibo(alug1));
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print(alug1.getDataAluguel().format(formato)+" ");
		System.out.println(alug1.getDataDevolucao().format(formato));	
		

	}

}
