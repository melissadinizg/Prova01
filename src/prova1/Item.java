package prova1;

/**
 * @author Melissa Diniz - 115211394
 *
 */

public class Item {
	private String nome;
	private double preco;

	/**
	 * Cria o item
	 * @param nome
	 * @param preco
	 */
	public Item(String nome,  double preco){
		this.nome = nome;
		this.preco = preco;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	
	
	
	
}
