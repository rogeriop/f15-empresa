package br.com.caelum.empresa.modelo;

public class PessoaFisica {

	private DadosPessoais dadosPessoais;
	private String cpf;

	public PessoaFisica(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return dadosPessoais.getNome();
	}
	
	public void setNome(String nome) {
		dadosPessoais.setNome(nome);
	}

	public boolean equals(Object arg0) {
		return dadosPessoais.equals(arg0);
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

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public String getCpf() {
		return cpf;
	}

	
}
