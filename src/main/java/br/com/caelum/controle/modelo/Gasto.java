package br.com.caelum.controle.modelo;

import java.util.Calendar;

import br.com.caelum.empresa.modelo.Funcionario;

public class Gasto {
	private Double valor;
	private String tipo;
	private Funcionario funcionario;
	private Calendar data;
	private boolean pagoEmDinheiro;
	
	
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public boolean isPagoEmDinheiro() {
		return pagoEmDinheiro;
	}
	public void setPagoEmDinheiro(boolean pagoEmDinheiro) {
		this.pagoEmDinheiro = pagoEmDinheiro;
	}
	public Gasto(Double valor, String tipo, Funcionario funcionario,
			Calendar data, boolean pagoEmDinheiro) {
		this.valor = valor;
		this.tipo = tipo;
		this.funcionario = funcionario;
		this.data = data;
		this.pagoEmDinheiro = pagoEmDinheiro;
	}
	@Override
	public String toString() {
		String saida = funcionario.getNome() + " : " + tipo + " : " + valor;
		return saida;
	}
}
