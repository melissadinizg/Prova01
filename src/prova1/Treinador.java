/**
 * 
 */
package prova1;

import java.util.ArrayList;

/**
 * @author Melissa Diniz - 115211394
 *
 */
public class Treinador {
	private String nomeTreinador;
	private ArrayList<Pokemon> pokeagenda;
	private Pokemon pokemon;
	private Mochila mochila;
	private Item item;
	/**
	 * Construtor do Treinador
	 * @param nome
	 */
	public Treinador(String nome) {
		this.nomeTreinador = nome;
		this.pokeagenda = new ArrayList<Pokemon>();
		
	}

	/**
	 * Metodo que faz a captura do pokemon
	 * e adiciona na pokeagenda
	 * @param pokemon
	 */
	public void captura(Pokemon pokemon) {
		pokeagenda.add(pokemon);
	}

	/**
	 * Metodo que verifica se o pokemon passado no parametro
	 * ja foi adicionado anteriormente na pokeagenda
	 * @param nome
	 * @return boolean
	 */
	public boolean jaCapturou(String nome) {
		boolean capturou = false;

		for (Pokemon pokemon : pokeagenda) {
			if (pokemon.getNome().equals(nome)) {
				capturou = true;
			}
		}
		return capturou;
	}

	/**
	 * Metodo que retorna a quantidade de pokemons
	 * na pokeagenda
	 * @return int
	 */
	public int getQtdPokemons() {
		return pokeagenda.size();
	}

	/**
	 * Metodo que busca o pokemon com maior ataque
	 * @return Pokemon com maior poder de ataque
	 */
	public Pokemon getMaisForte() {
		int maisForte = pokeagenda.get(0).getAtaque();
		Pokemon pokemonMaisForte = pokeagenda.get(0);

		for (Pokemon pokemon : pokeagenda) {
			int ataqueAtual = pokemon.getAtaque();
			if (ataqueAtual >= maisForte) {
				maisForte = ataqueAtual;
				pokemonMaisForte = pokemon;
			}

		}
		return pokemonMaisForte;
	}

	/**
	 * Retorna o poder de ataque
	 * @return
	 */
	public int getPoderAtaque() {
		int poderAtaque = 0;
		
		for (Pokemon pokemon : pokeagenda) {
			poderAtaque = poderAtaque + pokemon.getAtaque();
		}
		return poderAtaque;
	}

	/**
	 * Adiciona item 
	 * @param nome
	 * @param preco
	 */
	public void adicionaItem(String nome, double preco) {
		item = new Item(nome, preco);
		mochila.adicionaItem(item);
		
	}

	/**
	 * Remove item
	 * @param nome
	 * @return
	 */
	public boolean removeItem(String nome){
		return mochila.removeItem(nome);
	}

	/**
	 * Verifica se contem item
	 * @param nome
	 * @return
	 */
	public boolean contemItem(String nome) {
		
		return mochila.contem(nome);
	}

	/**
	 * Calcula lucro
	 * @return
	 */
	public double lucroTotal() {
		
		return mochila.lucroTotal();
	}

	/**
	 * Retorna quantidade de itens
	 * @return
	 */
	public int getQtdItens() {
		return mochila.quantItens();
	}
	
	


	/*
	 * Faz a contagem de quantos pokemons de cada
	 * tipo tem na pokeagenda
	 * @param nome
	 * @return
	 
	public ArrayList<Pokemon> getPokemons(String nome) {
		int quantPoke = 0;
		for (Pokemon pokemon : pokeagenda) {
			if (pokemon.getNome().equalsIgnoreCase(nome)) {
				quantPoke = quantPoke + 1;
			}
		}
		return quantPoke;
	}
	
	*/

}
