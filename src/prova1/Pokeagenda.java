/**
 * 
 */
package prova1;

import java.util.ArrayList;

/**
 * @author Melissa Diniz - 115211394
 *
 */
public class Pokeagenda {

	private ArrayList<Pokemon> pokeagenda;
	private int quantPokemons;
	private int poderAtaquePokeagenda;
	private String FIM_DE_LINHA = System.lineSeparator();

	/**
	 * Construtor da pokeagenda
	 */
	public Pokeagenda() {
		this.pokeagenda = new ArrayList<Pokemon>();
	}

	/**
	 * metodo que retorna a quantidade de pokemons adicionados
	 * 
	 * @return int
	 */
	public int getQuantPoke() {
		return pokeagenda.size();
	}

	/**
	 * Faz o calculo do poder de ataque
	 * @return
	 */
	public int getPoderAtaquePokeagenda() {
		int poder = 0;
		for (Pokemon pokemon : pokeagenda) {
			poder = poder + pokemon.getAtaque();
		}
		return poder;
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
		result = prime * result + poderAtaquePokeagenda;
		result = prime * result + quantPokemons;
		return result;
	}

	/*
	 * Duas pokeagendas sao iguais se possuirem mesmo poder de ataque e mesmo
	 * numero de pokemons
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokeagenda other = (Pokeagenda) obj;
		if (poderAtaquePokeagenda != other.poderAtaquePokeagenda)
			return false;
		if (quantPokemons != other.quantPokemons)
			return false;
		return true;
	}

	

}
