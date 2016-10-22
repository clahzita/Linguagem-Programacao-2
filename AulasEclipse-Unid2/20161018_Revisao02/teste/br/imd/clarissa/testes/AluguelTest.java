package br.imd.clarissa.testes;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

import br.imd.clarissa.dao.CarroDao;
import br.imd.clarissa.dao.MotoDao;
import br.imd.clarissa.entidades.Aluguel;
import br.imd.clarissa.entidades.Carro;
import br.imd.clarissa.entidades.Cliente;
import br.imd.clarissa.entidades.Moto;
import br.imd.clarissa.entidades.ReciboAluguel;
import br.imd.clarissa.entidades.Veiculo;
import br.imd.clarissa.exceptions.CadastroAluguelException;
import junit.framework.Assert;

public class AluguelTest {

	@Test
	public void valoresAlugueis() {
		Veiculo pedidoMoto1 = new Moto("YBR", 125);
		Veiculo pedidoMoto2 = new Moto("CG", 150);
		Veiculo pedidoMoto3 = new Moto("XXX", 170);
		Veiculo pedidoCarro1 = new Carro("HB20", 1.6);
		Veiculo pedidoCarro2 = new Carro("Onix", 1.0);
		Veiculo pedidoCarro3 = new Carro("Celta", 1.0);
		
		Aluguel alug1 = new Aluguel(new Cliente("Julia", null),pedidoMoto1, LocalDate.of(2016,10,20));
		Aluguel alug2 = new Aluguel(new Cliente("Julia", null),pedidoMoto2, LocalDate.of(2016,10,20));
		Aluguel alug3 = new Aluguel(new Cliente("Julia", null),pedidoMoto3, LocalDate.of(2016,10,20));
		Aluguel alug4 = new Aluguel(new Cliente("Julia", null),pedidoCarro1, LocalDate.of(2016,10,20));
		Aluguel alug5 = new Aluguel(new Cliente("Julia", null),pedidoCarro2, LocalDate.of(2016,10,20));
		Aluguel alug6 = new Aluguel(new Cliente("Julia", null),pedidoCarro3, LocalDate.of(2016,10,20));
		
		Assert.assertEquals(250,alug1.getValorPgto(),0.00001);
		Assert.assertEquals(300,alug2.getValorPgto(),0.00001);
		Assert.assertEquals(340,alug3.getValorPgto(),0.00001);
		Assert.assertEquals(160,alug4.getValorPgto(),0.00001);
		Assert.assertEquals(100,alug5.getValorPgto(),0.00001);
		Assert.assertEquals(100,alug6.getValorPgto(),0.00001);
		
	}

}

