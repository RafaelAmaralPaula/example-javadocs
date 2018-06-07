package com.lovelacetecnolgia.model;


/**
 * Representa um funcionária da empressa.....
 * 
 * @author Rafael Amaral
 * @version 2.0.0
 
 */
public class Funcionario {

	private String nome;
	private double salario;
	
	/**
	 * Não utilize mais , pois o salário é obrigatório
	 * 
	 * @deprecated 
	 */
	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Calcula o adiantamneto em dinheiro que deverá ser pago ao funcionário
	 * 
	 *<p> O valor da diária e calculado ao dividir o seu <b>salário base por 30(dias do mês)</b>.</p>
	 * 
	 * <p>Caso o destino for uma capital,é adicionado 20% no valor do adiantamento.</p>
	 * 
	 * 
	 * @param dias
	 * 			Quantidade de dias da viagem
	 * 
	 * @param capital
	 * 		  Indica se é ou não uma capital brasileira
	 * 		
	 * @return  O valor em reais do adiatamento
	 * 	
	 * @since 1.1.0
	 * 
	 * @throws IllegalArgumentException
	 *     Lança uma exceção caso {@code dias} seja igual a <b>0</b>
	 *     
	 * @see Viagem
	 * 		Da uma olhada na classe viagem
	 * 	
	 */

	public double adiatamentoViagem(int dias, boolean capital) {
		if (dias <= 0) {
			throw new IllegalArgumentException("Dias deve ser maior que zero.");
		}

		double valorDiaria = salario / 30;

		double valorAdiantamento = valorDiaria * dias;

		if (capital) {
			valorAdiantamento *= 1.20;
		}

		return valorAdiantamento;
	}

}
