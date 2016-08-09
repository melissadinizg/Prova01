/**
 * 
 */
package sp2fy;

import java.util.ArrayList;

/**
 * @author Melissa
 *
 */
public class Musica {

	private String titulo;
	private int duracao;
	private String genero;
	
	public Musica(String tituloMusica, int duracaoMusica, String generoMusica) throws Exception {
		
		testeDuracao(duracaoMusica);
		testeGenero(generoMusica);
		testeTitulo(tituloMusica);
		
		this.titulo = tituloMusica;
		this.duracao = duracaoMusica;
		this.genero = generoMusica;
	}
	
	//	se o titulo da musica for vazia ou null
	public void testeTitulo(String tituloMusica) throws Exception {
		if (tituloMusica == null || tituloMusica.equals(""))
			throw new Exception("Titulo da musica nao pode ser nulo ou vazio.");
	}

	//	se a duracao da musica for menor que 0
	public void testeDuracao(int duracao) throws Exception {
		if (duracao <= 0)
			throw new Exception("Duracao da musica nao pode ser negativa.");
	}

	//	se o genero da musica for vazia ou null
	public void testeGenero(String genero) throws Exception {
		if (genero == null || genero.equals(""))
			throw new Exception("Genero da musica nao pode ser vazio.");
	}
	
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the duracao
	 */
	public int getDuracao() {
		return duracao;
	}

	/**
	 * @param duracao the duracao to set
	 */
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracao;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}


	/* 
	 * Duas musicas sao iguais se possuem mesmo titulo
	 * e mesma duracao
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Musica))
			return false;
		Musica other = (Musica) obj;
		if (duracao != other.duracao)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
}
