package prova1;

import java.util.ArrayList;

/**
 * @author Melissa Diniz - 115211394
 *
 */
public class Mochila {

	private ArrayList<Item> mochila;
	
	/**
	 * faz a criacao da mchila
	 */
	public Mochila() {
		this.mochila = new ArrayList<Item>();
	}

	/**
	 * Adiciona item na mochila
	 * @param item
	 */
	public void adicionaItem(Item item) {
		mochila.add(item);
	}

	/**
	 * Remove item na mochila
	 * @param nome
	 * @return
	 */
	public boolean removeItem(String nome) {
		boolean removeu = false;

		for (Item item : mochila) {
			if (item.getNome().equals(nome)) {
				mochila.remove(item);
				removeu = true;
			}
		}
		return removeu;
	}

	/**
	 * Retorna quantidade de itens
	 * @return
	 */
	public int quantItens(){
		return mochila.size();
	}
	
	/**
	 * Verifica se o item ta na mochila
	 * @param nome
	 * @return
	 */
	public boolean contem(String nome) {
		boolean contem = false;

		for (Item item : mochila) {
			if (item.getNome().equals(nome)) {
				contem = true;
			}
		}
		return contem;
	}
	
	/**
	 * Faz o calculo do lucro total de itens
	 * @return
	 */
	public double lucroTotal(){
		double lucro = 0.0;
		for (Item item : mochila) {
			lucro = lucro + item.getPreco();
		}
		return lucro;
	}
}
