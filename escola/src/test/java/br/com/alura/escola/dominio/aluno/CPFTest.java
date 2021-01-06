package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void validarCPFInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new CPF(""));
		assertThrows(IllegalArgumentException.class, () -> new CPF("123456789012"));
		assertThrows(IllegalArgumentException.class, () -> new CPF(null));
		assertThrows(IllegalArgumentException.class, () -> new CPF("455.929.035.55-0"));
	}

	@Test
	void validarCPFValido() {
		String cpf1 = "708.356.841-56";
		CPF cpfTest1 = new CPF(cpf1);
		assertEquals(cpf1, cpfTest1.getCpf());
	}
}
