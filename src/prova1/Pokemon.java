/**
 * 
 */
package prova1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Melissa Diniz - 115211394
 *
 */
public class Pokemon {
	private String nome;
	private int nivel;
	private int ataque;
	private String tipo;

	public Pokemon(String nome, int nivel, String tipo, int ataque) throws Exception {
		testaNomeInvalido(nome);
		testaAtaqueInvalido(ataque);
		testaNivelInvalido(nivel);
		testaTipoInvalido(tipo);

		this.ataque = ataque;
		this.nivel = nivel;
		this.nome = nome;
		this.tipo = tipo;
	}

	/**
	 * Testa se  o nome eh valido
	 * @param nome
	 * @throws Exception
	 */
	public void testaNomeInvalido(String nome) throws Exception {
		if (nome == null || nome.trim().isEmpty()) {
			throw new Exception("Nome de Pokemon nao pode ser nulo ou vazio.");
		}
	}

	/**
	 * Testa se o nivel eh valido
	 * @param nivel
	 * @throws Exception
	 */
	public void testaNivelInvalido(int nivel) throws Exception {
		if (nivel < 1) {
			throw new Exception("Nivel de Pokemon deve ser maior que zero.");
		}
	}

	/**
	 * Testa se o valor de ataque eh valido
	 * @param ataque
	 * @throws Exception
	 */
	public void testaAtaqueInvalido(int ataque) throws Exception {
		if (ataque >= 01) {
			throw new Exception("Poder de ataque de pokemon deve ser maior ou igual a zero.");
		}
	}

	/**
	 * Testa se p tipo eh valido
	 * @param tipo
	 * @throws Exception
	 */
	public void testaTipoInvalido(String tipo) throws Exception {
		if (tipo.equals("Agua") || tipo.equals("Fogo") || tipo.equals("Eletrico") || tipo.equals("Grama")
				|| tipo.equals("Gelo") || tipo.equals("Dragao") || tipo.equals("Fantasma") || tipo.equals("Psiquico")) {
			throw new Exception("Tipo " + tipo
					+ " eh invalido. Sao permitidos apenas: Agua, Fogo, Eletrico, Grama, Gelo, Dragao, Fantasma e Psiquico.");
		}

	}

	public int getAtaqueBase() {
		return getAtaque();

	}

	public int getPoderAtaque() {

		return getAtaque() * getNivel();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nivel;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/*
	 * Sao iguais se o nome e o nivel forem iguais
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (nivel != other.nivel)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	/*
	 * Faz a impressao do objeto Pokemon
	 */
	@Override
	public String toString() {
		return nome + "(" + tipo + "). lvl" + nivel + "; power: " + ataque;
	}

}
