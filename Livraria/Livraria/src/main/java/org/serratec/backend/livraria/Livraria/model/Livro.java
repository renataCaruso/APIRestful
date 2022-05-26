package org.serratec.backend.livraria.Livraria.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="livro")
public class Livro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_livro")
	private Integer idLivro;
	
	@Column(name="titulo_livro", nullable = false, scale = 5, precision = 30)
	@NotNull
	private String tituloLivro;
	
	@Column(name="tipo_livro", nullable = false, scale = 3, precision = 20)
	@NotNull
	private String tipoLivro;
	
	@Column(name="autor_livro", nullable = false, scale = 10, precision = 40)
	@NotNull
	private String autorLivro;
	
	@Column(name="data_publicacao")
	@NotNull
	private LocalDate dataPublicacao;
	
	public Livro () {}
	

	public Integer getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}
	public String getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}
	public String getTipoLivro() {
		return tipoLivro;
	}
	public void setTipoLivro(String tipoLivro) {
		this.tipoLivro = tipoLivro;
	}
	public String getAutorLivro() {
		return autorLivro;
	}
	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
}