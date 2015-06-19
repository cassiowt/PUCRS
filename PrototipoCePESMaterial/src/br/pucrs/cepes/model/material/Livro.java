package br.pucrs.cepes.model.material;

import java.util.Date;
import java.util.Collection;

public class Livro {

	private Long id;

	private String titulo;

	private String subtitulo;

	private Date dataCadastro;

	private Float preco;

	private String codigoISBN;

	private Integer edicao;

	private Date ano;

	private Integer paginas;

	private boolean brochura;

	private boolean video;

	private boolean cd_dvd;

	private boolean e_book;

	private String descricao;

	private Collection<Autor> autores;

	private Editora editora;

	private Idioma idioma;

}
