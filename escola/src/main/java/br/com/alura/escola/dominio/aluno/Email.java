package br.com.alura.escola.dominio.aluno;

public class Email {
	
	private String endereco;

	public Email(String endereco) {
		if(endereco == null || !endereco.matches("^[a-z0-9._]+@[a-z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Endereço de e-mail incorreto!");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}
	
	
}
