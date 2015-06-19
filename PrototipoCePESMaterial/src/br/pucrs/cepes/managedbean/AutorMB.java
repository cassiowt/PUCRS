package br.pucrs.cepes.managedbean;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.pucrs.cepes.model.material.Autor;

@ManagedBean
@SessionScoped
public class AutorMB {

	private Autor autor;
	private Collection<Autor> autores;

	
	public AutorMB() {
		 autor = new Autor();
		 autores = new ArrayList<Autor>();
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Collection<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Collection<Autor> autores) {
		this.autores = autores;
	}
	
	public void salvarAutor(Autor ator){
		
	}
	
	public void excluirAutor(Autor ator){
		
	}
	
	public void alterarAutor(Autor ator){
		
	}
	
	public void listarAutores(){
		
	}

}
