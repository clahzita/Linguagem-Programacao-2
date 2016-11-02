package br.imd.controle;

import static org.junit.Assert.*;

import org.junit.Test;

import br.imd.modelo.Empregado;
import br.imd.modelo.Pessoa;
import br.imd.modelo.Setor;

public class GeralTest {
	
	
	@Test
	public void Empregadotest() {
		try{
			Setor x = new Setor(000, "Gestao de Pessoas");
			Empregado a = new Empregado("Joao", "Rua 02", "99909-0088", "masculino", 1988, x, 1999, 5);
			assertEquals(28, a.calcularIdade(a.getAnoNascimento()),0);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
			
		
	}
	
	@Test
	public void Pessoatest() {
		try{
			Pessoa x = new Pessoa("Maria", "Rua 56", "9999-0088", "feminino", -1866);
			assertEquals(29, x.calcularIdade(x.getAnoNascimento()),0);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
			
		
	}

}
