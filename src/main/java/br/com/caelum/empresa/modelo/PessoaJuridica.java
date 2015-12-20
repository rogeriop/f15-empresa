package br.com.caelum.empresa.modelo;

public class PessoaJuridica extends Pessoa {
	public final String cnpj;

	public PessoaJuridica(String cnpj) {
		this.cnpj = cnpj;
	}

}