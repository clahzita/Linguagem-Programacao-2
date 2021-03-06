package br.com.locavel.testes;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import br.com.locavel.entidades.Aluguel;
import br.com.locavel.entidades.Cliente;

public class AluguelTest {
	Aluguel alugcarro1 = new Aluguel(LocalDate.of(2016, 10, 22), new Cliente("Maria", "002"), "HB20", 2.0);
	Aluguel alugcarro2 = new Aluguel(LocalDate.of(2016, 10, 20), new Cliente("Nilson", "2030"), "Hyundai", 1.4);
	
	
	@Test
	public void valoresAlugueisTeste() {
		
		assertEquals(200,alugcarro1.getValor(), 0.0001);
		assertEquals(140,alugcarro2.getValor(), 0.0001);
		
		
	}
	
	@Test
	public void dataDevolucaoTeste() {
		
		
	}
	
	@Test
	public void insercaoAluguelTeste() {
		
	}

}
