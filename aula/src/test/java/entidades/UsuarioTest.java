package entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class UsuarioTest {

	Usuario User = new Usuario(null, "123", "luancesar@hotmail.com", null);
	Random r = new Random();

	@BeforeAll
	public static void TestConexao() {
		System.out.println("Conectando com o banco.");

	}

	@Test
	@Timeout(value = 600, unit = TimeUnit.MILLISECONDS)
	public void testLogin() throws InterruptedException {
		Thread.sleep(r.nextInt(1000));
		Boolean username = BD.Bdmaster.BuscarBd(User);
		assertEquals(true, username);
		System.out.println("user Verificado com exito");
	}

	@Test
	public void testLogin2() throws InterruptedException {
		Boolean senha = BD.Bdmaster.BuscarBd2(User);
		assertNotEquals(false, senha);
		System.out.println("senha Verificada com exito");
	}

	@BeforeEach
	public void testeConexao() {
		boolean massa;
		int teste = r.nextInt(100);
		if (teste <= 50) {
			massa = true;

		} else {
			massa = false;
		}
		assertNotEquals(true, massa);
		System.out.println("ok");
	}
	
	@Disabled
    @Test
	public void testcredences() throws InterruptedException {
		assertNotEquals(User.nome, User.senha);
		System.out.println("Senha nao pode ser igual o nome");
	}

	@Test
	public void idade() {
		assertNull(User.idade);
		System.out.println("idade é nulo");
	}

	@Test
	void testExpectedException() {
	 
	  Assertions.assertThrows(NumberFormatException.class, () -> {
	    Integer.parseInt(User.idade);
	  });
	 
	 
	}

	@AfterAll
	public static void EncerraConexao() {
		System.out.println("Finalizando comunicação com o banco.");

	}
}
