package br.com.caelum.empresa.modelo;

public class PessoaJuridica {

	private String cnpj;
	private DadosPessoais dadosPessoais;
	
	public PessoaJuridica(String cnpj) {
		this.cnpj = cnpj;
	}

	
	
	public boolean equals(Object obj) {
		return dadosPessoais.equals(obj);
	}



	public String getNome() {
		return dadosPessoais.getNome();
	}



	public void setNome(String nome) {
		dadosPessoais.setNome(nome);
	}



	public String getEndereco() {
		return dadosPessoais.getEndereco();
	}



	public void setEndereco(String endereco) {
		dadosPessoais.setEndereco(endereco);
	}



	public String getEmail() {
		return dadosPessoais.getEmail();
	}



	public int hashCode() {
		return dadosPessoais.hashCode();
	}



	public void setEmail(String email) {
		dadosPessoais.setEmail(email);
	}



	public String toString() {
		return dadosPessoais.toString();
	}



	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


}