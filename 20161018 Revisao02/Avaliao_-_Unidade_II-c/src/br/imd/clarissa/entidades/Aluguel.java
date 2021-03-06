package br.imd.clarissa.entidades;

import java.util.Date;

import br.imd.clarissa.banco.Repositorio;

public class Aluguel {
	private Cliente cliente;
	private Veiculo veiculo;
	private Date dataAluguel;
	private Date dataDevolucao;
	private double valorPgto;
	
	public Aluguel(Cliente cliente, Veiculo veiculo, Date dataAluguel, Date dataDevolucao) {
		super();
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dataAluguel = dataAluguel;
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
			this.setValorPgto(100 * y.getCilindradas());
		}
	}
	
	public void cadastrarAluguel(Aluguel e){
		Repositorio.getBancoAluguel().add(e);
		
	}
	
	
	
	
		
	
	
	
	
	
	
	
}
