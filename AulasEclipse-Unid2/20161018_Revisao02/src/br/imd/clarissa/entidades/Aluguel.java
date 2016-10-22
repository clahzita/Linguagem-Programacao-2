package br.imd.clarissa.entidades;

import java.util.Date;
import java.text.NumberFormat;  
import java.text.SimpleDateFormat;  

import br.imd.clarissa.banco.Repositorio;

public class Aluguel {
	private Cliente cliente;
	private Veiculo veiculo;
	private Date dataAluguel;
	private Date dataDevolucao;
	private double valorPgto;
	
	public Aluguel(Cliente cliente, Veiculo veiculo, Date dataAluguel) {
		super();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dataAluguel = dataAluguel;
		this.setDataDevolucao(dataAluguel);		
		this.valorPgto = 0;
		
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}



	public Veiculo getVeiculo() {
		return veiculo;
	}



	public Date getDataAluguel() {
		return dataAluguel;
	}



	public Date getDataDevolucao() {
		return dataDevolucao;
	}



	private void setDataDevolucao(Date dataAluguel) {
		Date a = new Date("2004/09/01");         
		a.setDate(a.getDate() + 10);          
		  
		String formato = "dd/MM/yyyy";  
		SimpleDateFormat dataFormatada = new SimpleDateFormat(formato);   
		System.out.println("Daqui há dez dias: " + dataFormatada.format(a));  
		
		this.dataDevolucao = dataDevolucao;
	}



	/**
	 * @return the valorPgto
	 */
	public double getValorPgto() {
		return valorPgto;
	}

	/**
	 * @param valorPgto the valorPgto to set
	 */
	public void setValorPgto(double valorPgto) {
		this.valorPgto = valorPgto;
	}

	public void calcularValorPagamento(){
		if(veiculo instanceof Carro){
			Carro x = (Carro) veiculo;
			this.setValorPgto(100 * x.getPotenciaMotor());
		}
		else{
			Moto y = (Moto) veiculo;
			this.setValorPgto(2 * y.getCilindradas());
		}
	}
	
	public void cadastrarAluguel(Aluguel e){
		if(veiculo instanceof Moto){
			Moto aux = (Moto)veiculo;
			 if((cliente.getCnh()==null && aux.getCilindradas() <= 50) || cliente.getCnh()!=null){
				 Repositorio.getBancoAluguel().add(e);
			 }
			 else if(cliente.getCnh()==null && aux.getCilindradas() > 50){
				 System.out.println("Cliente não tem carteira de motorista cadastrada e a moto tem mais que 50 cilindradas.");
			 }
			 
		}
		else{
			if(cliente.getCnh() != null){
				Repositorio.getBancoAluguel().add(e);
			}
			else{
				System.out.println("Cliente não tem carteira de motorista cadastrada.");
			}
		}
		
		
	}
	
	public void removerAluguel(Aluguel e){
		Repositorio.getBancoAluguel().remove(e);
		
	}
	
	
	
	
		
	
	
	
	
	
	
	
}
