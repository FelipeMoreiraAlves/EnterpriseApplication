package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_LIVRO")
@SequenceGenerator(name = "livro", sequenceName = "SQ_LIVRO", allocationSize = 1)
public class Livro {

	@Id
	@Column(name = "cd_livro")
	@GeneratedValue(generator = "livro", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "ds_titulo", length = 150, nullable = false)
	private String titulo;

	@Column(name = "nm_autor", length = 120, nullable = false)
	private String autor;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Livro(int codigo, String titulo, String autor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

}
