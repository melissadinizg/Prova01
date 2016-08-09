package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sp2fy.Musica;

public class MusicaTest {
	private Musica chandelier;
	private Musica elasticHeart;
	private Musica cellophane;

	private Musica musica;
	private String tituloMusica = "Formation";
	private int duracaoEsperada = 5;
	private String generoEsperado = "Pop";

	@Before
	public void criaMusica() throws Exception {
		chandelier = new Musica("Chandelier", 3, "Pop");
		elasticHeart = new Musica("Elastic Heart", 3, "Pop");
		cellophane = new Musica("Cellophane", 4, "Pop");
	}

	@Before
	public void setup() throws Exception {
		this.musica = new Musica(tituloMusica, 5, "Pop");
	}

	@Test
	public void testMusicaInvalida() {
		try {
			Musica tituloInvalido = new Musica(null, 3, "Pop");
			fail(); // se chegar aqui da erro, pois deveria lancar exception.
		} catch (Exception e) {
			String msgEsperada = "Titulo da musica nao pode ser nulo ou vazio.";
			assertEquals(msgEsperada, e.getMessage());
		}

		try {
			Musica tituloInvalido = new Musica("", 3, "Pop");
			fail();
		} catch (Exception e) {
			String msgEsperada = "Titulo da musica nao pode ser nulo ou vazio.";
			assertEquals(msgEsperada, e.getMessage());
		}

		try {
			Musica duracaoInvalida = new Musica("Alo amor", -1, "Pop");
			fail();
		} catch (Exception e) {
			String msgEsperada = "Duracao da musica nao pode ser negativa.";
			assertEquals(msgEsperada, e.getMessage());
		}
		try {
			Musica generoInvalida = new Musica("Alo amor", 5, null);
			fail();
		} catch (Exception e) {
			String msgEsperada = "Genero da musica nao pode ser vazio.";
			assertEquals(msgEsperada, e.getMessage());
		}
	}

	@Test
	public void testMusica() throws Exception {
		Musica chandelier = new Musica("Chandelier", 3, "Pop");
		assertEquals("Chandelier", chandelier.getTitulo());
		assertEquals(3, chandelier.getDuracao());
		assertEquals("Pop", chandelier.getGenero());
	}

	@Test
	public void testGetTitulo() {
		Assert.assertEquals(tituloMusica, musica.getTitulo());
	}

	@Test
	public void testGetGenero() {
		Assert.assertEquals(generoEsperado, musica.getGenero());
	}

	@Test
	public void testGetDuracao() {
		Assert.assertEquals(duracaoEsperada, musica.getDuracao());
	}

	// note abaixo como eh o bom uso de exceptions em testes
	@Test(expected = Exception.class)
	public void testTituloVazio() throws Exception {
		musica = new Musica("", 5, "Pop");
	}

	@Test(expected = Exception.class)
	public void testTituloNull() throws Exception {
		musica = new Musica(null, 5, "Pop");
	}

	@Test(expected = Exception.class)
	public void testGeneroVazio() throws Exception {
		musica = new Musica("Fly me to the moon.", 5, "");
	}

	@Test(expected = Exception.class)
	public void testGeneroNull() throws Exception {
		musica = new Musica("Fly me to the moon.", 5, null);
	}

	@Test(expected = Exception.class)
	public void testDuracaoInvalida() throws Exception {
		musica = new Musica("Fly me to the moon.", -5, "Forro");
	}

	@Test(expected = Exception.class)
	public void testDuracaoZero() throws Exception {
		musica = new Musica("Fly me to the moon.", 0, "Forro");
	}

	@Test
	public void testEquals() throws Exception {

		assertEquals(chandelier, new Musica("Chandelier", 3, "Pop"));
		assertEquals(chandelier, new Musica("Chandelier", 3, "Pop-rock"));
		assertNotEquals(elasticHeart, chandelier);
		assertNotEquals(elasticHeart, cellophane);
	}

}
