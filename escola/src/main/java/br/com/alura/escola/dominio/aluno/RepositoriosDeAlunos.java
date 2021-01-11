package br.com.alura.escola.dominio.aluno;

import java.util.List;

public interface RepositoriosDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf) throws AlunoNaoEncontrado;
	
	List<Aluno> listarTodosAlunosMatriculados();
}
