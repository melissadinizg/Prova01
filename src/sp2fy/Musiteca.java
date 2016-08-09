package sp2fy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Musiteca {
	private ArrayList<Album> meusAlbuns;
	private ArrayList<Album> meusAlbunsFavoritos;
	private Map<String, ArrayList<Musica>> playList;

	public Musiteca() {
		this.meusAlbuns = new ArrayList<Album>();
		this.meusAlbunsFavoritos = new ArrayList<Album>();
		this.playList = new HashMap<String, ArrayList<Musica>>();
	}

	public boolean addAlbum(Album album) {
		boolean adicionou = false;
		
		if (!contemAlbum(album)) {
			meusAlbuns.add(album);
			adicionou = true;
		}
		return adicionou;
	}

	public boolean contemAlbum(Album album) {
		boolean achou = false;

		for (Album album2 : meusAlbuns) {
			if (album.equals(album2)) {
				achou = true;
			}
		}
		return achou;
	}

	public boolean contemAlbumFavorito(Album album) {
		boolean achou = false;

		for (Album album2 : meusAlbunsFavoritos) {
			if (album2 != null) {
				if (album.equals(album2)) {
					achou = true;
				}
			}
		}
		return achou;
	}

	public boolean addAosFavoritos(Album album) {
		boolean adicionou = false;

		if (!contemAlbumFavorito(album)) {
			meusAlbunsFavoritos.add(album);
			adicionou = true;
		}
		return adicionou;
	}

	public int getQtdFavoritos() {
		return meusAlbunsFavoritos.size();
	}

	public boolean criaPlaylist(String tituloPlay) {
		if (!playList.containsKey(tituloPlay)) {
			playList.put(tituloPlay, null);
			return true;
		}else{
			return false;
		}
		
	}



}
