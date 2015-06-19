package br.pucrs.cepes.model.material;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Autor implements Serializable{


	private static final long serialVersionUID = 3198751553761963866L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;
	private String nome;

	private String sobrenome;

	public Autor() {
		
	}
	
	public void setNome(String nome) {

	}

	public String getNome() {
		return this.nome;
	}

	public void setSobrenome(String sobrenome) {

	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}
