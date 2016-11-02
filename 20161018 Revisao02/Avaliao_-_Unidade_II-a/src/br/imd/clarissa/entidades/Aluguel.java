package br.imd.clarissa.entidades;

import java.text.NumberFormat;  
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import br.imd.clarissa.banco.Repositorio;
import br.imd.clarissa.exceptions.CadastroAluguelException;

public class Aluguel {
	private Cliente cliente;
	private Veiculo veiculo;
	private LocalDate dataAluguel;
	private LocalDate dataDevolucao;
	private double valorPgto;
	
	public Aluguel(Cliente cliente, Veiculo veiculo, LocalDate dataAluguel) {
		super();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dataAluguel = dataAluguel;
		this.setDataDevolucao(dataAluguel);		
		this.calcularValorPagamento();
		
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}



	public Veiculo getVeiculo() {
		return veiculo;
	}



	public LocalDate getDataAluguel() {
		return dataAluguel;
	}



	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}



	private void setDataDevolucao(LocalDate dataAluguel) {
		if(veiculo instanceof Moto){
			dataDevolucao = dataAluguel.plusDays(2);
		}
		else{
			dataDevolucao = dataAluguel.plusDays(3);
		}         
		
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
	
	public void cadastrarAluguel() throws CadastroAluguelException{
		if(veiculo instanceof Moto){
			Moto aux = (Moto)veiculo;
			 if((cliente.getCnh()==null && aux.getCilindradas() <= 50) || cliente.getCnh()!=null){
				 Repositorio.getBancoAluguel().add(new Aluguel(getCliente(), getVeiculo(), getDataAluguel()));
			 }
			 else if(cliente.getCnh()==null && aux.getCilindradas() > 50){
				 throw new CadastroAluguelException("Cliente não tem carteira de motorista cadastrada e a moto tem mais que 50 cilindradas.");
			 }
			 
		}
		else{
			if(cliente.getCnh() != null){
				Repositorio.getBancoAluguel().add(new Aluguel(getCliente(), getVeiculo(), getDataAluguel()));
			}
			else{
				throw new CadastroAluguelException("Cliente não tem carteira de motorista cadastrada.");
			}
		}
		
		
	}
	
	public void removerAluguel(Aluguel e){
		Repositorio.getBancoAluguel().remove(e);
		
	}
	
	public ArrayList<Aluguel> listarTodosAlugueis(){
		return Repositorio.getBancoAluguel();
		
	}
	
	
	
		
	
	
	
	
	
	
	
}
