package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void EmailComEnderecoInvalido() {
		assertThrows(IllegalArgumentException.class, 
					() -> new Email(null));
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(""));
		assertThrows(IllegalArgumentException.class, 
				() -> new Email("emailInvalido"));
		
	}

}
