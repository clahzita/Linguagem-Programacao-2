
public class Aplicacao {

	public static void main(String[] args) {
		ContatoPF c1 = new ContatoPF();
		
		c1.setNome("José");
		c1.setCpf("014.558.997-96");
		
		c1.getEndereco().setRua("Rua Xavier");
		c1.getEndereco().setNumero("150");
		c1.getEndereco().setCidade("Natal");
		c1.getEndereco().setEstado("RN");
		
		Agenda agenda = new Agenda();
		agenda.setContato1(c1);
		
		imprimirNomes(agenda);
		imprimirCnpj(agenda);
		
		
	}
	
	private static void imprimirNomes(Agenda a){
		if(a.getContato1() != null){
			System.out.println(a.getContato1().getNome());
		}
		if(a.getContato2() != null){
			System.out.println(a.getContato2().getNome());
		}
		if(a.getContato3() != null){
			System.out.println(a.getContato3().getNome());
		}
		
	}
	
	private static void imprimirCnpj(Agenda a){
		
		if(a.getContato1() != null && a.getContato1() instanceof ContatoPJ){
			ContatoPJ c = (ContatoPJ) a.getContato1();			
			System.out.println(c.getCnpj());
		}
		
		
		
		if(a.getContato2() != null && a.getContato2() instanceof ContatoPJ){
			ContatoPJ c = (ContatoPJ) a.getContato2();			
			System.out.println(c.getCnpj());
		}
		
		if(a.getContato3() != null && a.getContato3() instanceof ContatoPJ){
			ContatoPJ c = (ContatoPJ) a.getContato3();			
			System.out.println(c.getCnpj());
		}
		
	}
}
