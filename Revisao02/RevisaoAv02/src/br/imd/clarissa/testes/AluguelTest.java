package br.imd.clarissa.testes;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import br.imd.clarissa.entidades.Aluguel;
import br.imd.clarissa.entidades.Carro;
import br.imd.clarissa.entidades.Cliente;

public class AluguelTest {

	@Test
	public void valorPagamento() {
		Aluguel alug1 = new Aluguel(new Cliente("Jula", null),new Carro("Onix", 1.0), LocalDate.of(2016,10,20));
		
		assertEquals(100,alug1.getValorPgto(),0.0001);
	}

}
