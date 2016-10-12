package imd.clarissa.teste;

import static org.junit.Assert.*;
import org.junit.*;

import br.imd.clarissa.Matematica;

public class MatematicaTest {
	Matematica m; 
	
	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	
	}

	@Test
	public void testSomar() {
		assertEquals(5, m.somar(3, 2),0);
	}

	@Test
	public void testSubtrair() {
		assertEquals(1,m.subtrair(3, 2),0);
		
	}

	@Test
	public void testMultiplicar() {
		assertEquals(6,m.multiplicar(3, 2),0);
	}

	@Test
	public void testDividir() {
		assertEquals(2,m.dividir(4,2),0);
	}

}