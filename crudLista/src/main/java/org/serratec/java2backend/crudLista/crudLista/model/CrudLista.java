package org.serratec.java2backend.crudLista.crudLista.model;

public class CrudLista {

	private Integer id;
	private String musica;
	private String artista;

	public CrudLista(Integer id, String musica, String artista) {
		super();
		this.id = id;
		this.musica = musica;
		this.artista = artista;
	}

	public CrudLista() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

}
