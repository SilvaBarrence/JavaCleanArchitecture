package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;

class TelefoneTest {

	@Test
	void validarDDDsInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("", "950644574"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("123", "950644574"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "950644574"));
	}
	
	@Test
	void validarNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("12", "950644574234"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("98", null));
	}
	
	@Test
	void validarTelefoneValida() {
		String ddd = "11";
		String num = "950644574";
		Telefone telefone = new Telefone(ddd, num);
		assertEquals(ddd, telefone.getDDD());
		assertEquals(num, telefone.getNumero());
	}

}
