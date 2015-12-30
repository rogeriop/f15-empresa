package br.com.caelum.empresa.modelo;

public class DadosPessoais {

	public String nome;
	public String endereco;
	public String email;

	public DadosPessoais() {
	}

	public DadosPessoais(String nome, String endereco, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}