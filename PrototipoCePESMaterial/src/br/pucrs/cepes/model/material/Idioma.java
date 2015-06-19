package br.pucrs.cepes.model.material;

public enum Idioma {

	BRASIL("br"),

	PORTUGUAL("pt"),

	ESTADOS_UNIDOS("usa"),

	INGLATERRA("en"),

	ALEMANHA("al"),

	ESPANHA("es"),

	FRANCA("fr");

	private String sigla;


	/**
	 *  
	 */
	private Idioma(String sigla) {

	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {

	}

}
