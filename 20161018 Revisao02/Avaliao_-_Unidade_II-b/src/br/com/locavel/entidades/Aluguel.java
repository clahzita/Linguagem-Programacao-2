/**
 * 
 */
package br.com.locavel.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import br.com.locavel.banco.Banco;

/**
 * @author clarissa
 *
 */
public class Aluguel {
	ArrayList<Aluguel> alugueisRegistados = new ArrayList<Aluguel>();
	private double valor;
	private LocalDate dataAluguel;
	private LocalDate dataDevolucao;
	private Cliente solicitante;

	private String modeloVeiculo;
	private double potenciaCarro = -1;
	private int cilindradaMoto = -1;

	/**
	 * Método instancia um aluguel de carro.
	 * 
	 * @param dataAluguel
	 * @param solicitante
	 * @param modeloCarro
	 * @param potenciaCarro
	 */
	public Aluguel(LocalDate dataAluguel, Cliente solicitante, String modeloVeiculo, double potenciaCarro) {
		super();
		this.dataAluguel = dataAluguel;
		this.solicitante = solicitante;
		this.modeloVeiculo = modeloVeiculo;
		this.potenciaCarro = potenciaCarro;
		this.calcularValor();
		this.registrarDataDevolucao();
	}

	/**
	 * Método instancia um aluguel de moto.
	 * 
	 * @param dataAluguel
	 * @param solicitante
	 * @param modeloMoto
	 * @param cilindradaMoto
	 */
	public Aluguel(LocalDate dataAluguel, Cliente solicitante, String modeloVeiculo, int cilindradaMoto) {
		super();
		this.dataAluguel = dataAluguel;
		this.solicitante = solicitante;
		this.modeloVeiculo = modeloVeiculo;
		this.cilindradaMoto = cilindradaMoto;
		this.calcularValor();
		this.registrarDataDevolucao();
	}

	public LocalDate getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(LocalDate dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public double getPotenciaCarro() {
		return potenciaCarro;
	}

	public void setPotenciaCarro(double potenciaCarro) {
		this.potenciaCarro = potenciaCarro;
	}

	public int getCilindradaMoto() {
		return cilindradaMoto;
	}

	public void setCilindradaMoto(int cilindradaMoto) {
		this.cilindradaMoto = cilindradaMoto;
	}

	public ArrayList<Aluguel> getAlugueisRegistados() {
		return alugueisRegistados;
	}

	public double getValor() {
		return valor;
	}

	public void calcularValor() {
		if (potenciaCarro == -1) {
			this.valor = 2 * cilindradaMoto;
		} else {
			this.valor = 100 * potenciaCarro;
		}
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	private void registrarDataDevolucao() {
		if (potenciaCarro == -1) {
			this.dataDevolucao = dataAluguel.plusDays(3);
		} else {
			this.dataDevolucao = dataAluguel.plusDays(2);
		}

	}

	public Cliente getSolicitante() {
		return solicitante;
	}

	private boolean cadastrarAluguel() {
		for (Veiculo x : Banco.veiculosCadastrados) {
			if (x.getModelo().equals(modeloVeiculo)) {
				if (x instanceof Carro) {
					alugueisRegistados.add(new Aluguel(dataAluguel, solicitante, modeloVeiculo, potenciaCarro));
				} else {
					alugueisRegistados.add(new Aluguel(dataAluguel, solicitante, modeloVeiculo, cilindradaMoto));
				}
				return true;
			}
		}
		return false;
	}
	
	public void checarAluguel() throws ChecarAluguelException{
		if(solicitante.getCnh()!=null){
			this.cadastrarAluguel();
		}
		else if ((solicitante.getCnh()==null && potenciaCarro == -1)){
			if(cilindradaMoto <= 50){
				this.cadastrarAluguel();
			}else{
				throw new ChecarAluguelException("Sem carteira e cilindrada da moto é maior que 50.");
			}
		}else{
			throw new ChecarAluguelException("Sem carteira não é possível alugar um carro.");
		}
		
	}

	public void excluirAluguel(Aluguel e) {
		
		alugueisRegistados.remove(e);
	}

	public String emitirRecibo(){
		String recibo = "### Recibo de Aluguel ###\n";
		recibo+="Modelo do veiculo: "+modeloVeiculo+"\n";
		recibo+="Valor a Pagar: "+this.getValor()+"\n";
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		recibo+="Data de Devolução: "+this.getDataDevolucao().format(formato)+"\n";
		
		return recibo;
		
	}

}
