/**
 * 
 */
package sp2fy;

import java.util.ArrayList;

/**
 * @author Melissa
 *
 */
public class Album {
	private String artista;
	private String titulo;
	private int ano;
	private ArrayList<Musica> album;

	public Album(String artistaAlbum, String tituloAlbum, int anoAlbum) throws Exception {

		testaTitulo(tituloAlbum);
		testaAno(anoAlbum);
		testaArtista(artistaAlbum);

		this.album = new ArrayList<Musica>();
		this.artista = artistaAlbum;
		this.titulo = tituloAlbum;
		this.ano = anoAlbum;
	}

	public boolean contemMusica(String titulo) {
		for (Musica musica : album) {
			if (musica.getTitulo().equals(titulo)) {
				return true;
			}
		}
		return false;
	}

	public boolean buscaMusica(Musica musica) {
		boolean achou = false;

		for (Musica musica2 : album) {
			if (musica2.equals(musica)) {
				achou = true;
			}
		}
		return achou;
	}
	
	public boolean buscaMusicaPeloNome(String titulo){
		for (Musica musica : album) {
			if (musica.getTitulo().equals(titulo)) {
				return true;
			}
		}return false;
	}

	public boolean adicionaMusica(Musica musica) {
		boolean adicionou = false;
		if (musica != null) {
			if (!buscaMusica(musica)) {
				album.add(musica);
				adicionou = true;
			}

		}

		return adicionou;
	}

	public void removeMusica(int i) {
		album.remove(i - 1);

	}

	public int quantidadeFaixas() {
		return album.size();
	}

	public int getDuracaoTotal() {
		int duracaoAlbum = 0;

		for (int i = 0; i < album.size(); i++) {
			duracaoAlbum = album.get(i).getDuracao() + duracaoAlbum;
		}
		return duracaoAlbum;
	}
	

	public Musica getMusica(String titulo) {
		
		for (Musica musica : album) {
			if (musica.getTitulo().equals(titulo)) {
				return musica;
			}
		}
		return null;
	}

	

	public void testaTitulo(String tituloAlbum) throws Exception {
		if (tituloAlbum == null || tituloAlbum.trim().isEmpty()) {
			throw new Exception("Titulo do album nao pode ser nulo ou vazio.");
		}
	}

	public void testaArtista(String artistaAlbum) throws Exception {
		if (artistaAlbum == null || artistaAlbum.trim().isEmpty()) {
			throw new Exception("Artista do album nao pode ser nulo ou vazio.");
		}
	}

	public void testaAno(int anoAlbum) throws Exception {
		if (anoAlbum <= 1900) {
			throw new Exception("Ano de lancamento do album nao pode ser inferior a 1900.");
		}
	}

	/*
	 * sao iguais se possuir mesmo nome e artista
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Album))
			return false;
		Album other = (Album) obj;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Album [artista=" + artista + ", titulo=" + titulo + ", ano=" + ano + ", album=" + album + "]";
	}

}
