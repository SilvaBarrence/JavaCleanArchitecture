package br.com.alura.escola.dominio.aluno;

public class AlunoNaoEncontrado extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno não econtrado com CPF: " + cpf.getNumero());
	}
}
