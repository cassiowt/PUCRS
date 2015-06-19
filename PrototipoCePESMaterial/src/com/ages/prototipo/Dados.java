package com.ages.prototipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean
@SessionScoped
public class Dados {

	private String nome;

	public Dados() {
	}

	public Dados(String s) {
		this.nome = s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String dados) {
		this.nome = dados;
	}

	public List<String> completeText(String query) {
		List<String> results = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			results.add(query + "__" + i);
		}

		return results;
	}

	public void onItemSelect(SelectEvent event) {
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage("Dado Selecionado", event.getObject()
						.toString()));
	}

	public List<Dados> getEmprestimos() {
		ArrayList<Dados> emprestimos = new ArrayList<Dados>();
		emprestimos
				.add(new Dados(
						"Aluno:Bento Gonçalves Data Emprestimo:01/01/2015  Data Devolução:Indefinido"));
		emprestimos
				.add(new Dados(
						"Aluno:Anita Garibaldi Data Emprestimo:01/02/2015  Data Devolução:Indefinido"));

		return emprestimos;
	}

	public void naoImplementado() {
		
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
		String s = params.get("titulo");
		addMessage(s, "Não Implementado");
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	
	
	
	/*
	public String outcome(){
		 
		FacesContext fc = FacesContext.getCurrentInstance();
		this.country = getCountryParam(fc);
 
		return "result";
	}
 
	get value from "f:param"
	public String getCountryParam(FacesContext fc){
 
		Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
		return params.get("titulo");

	}
	 */
	// Map<Integer, Dados> emprestimos= new HashMap<Integer, Dados>();
	// {
	// emprestimos.put(1, new
	// Dados("Aluno:Bento Gonçalves Data Emprestimo: 01/01/2015  Data Devolução:Indefinido"));
	// emprestimos.put(2, new
	// Dados("Aluno:Anita Garibaldi Data Emprestimo: 01/02/2015  Data Devolução:Indefinido"));
	// }
}
