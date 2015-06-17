package com.ages.prototipo;

import java.util.ArrayList;
import java.util.List;

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
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Dado Selecionado", event.getObject().toString()));
	}

	public List<Dados> getEmprestimos() {
		ArrayList<Dados> emprestimos = new ArrayList<Dados>();
		emprestimos.add(new Dados("Aluno:Bento Gonçalves Data Emprestimo:01/01/2015  Data Devolução:Indefinido"));
		emprestimos.add(new Dados("Aluno:Anita Garibaldi Data Emprestimo:01/02/2015  Data Devolução:Indefinido"));

		return emprestimos;
	}

	// Map<Integer, Dados> emprestimos= new HashMap<Integer, Dados>();
	// {
	// emprestimos.put(1, new
	// Dados("Aluno:Bento Gonçalves Data Emprestimo: 01/01/2015  Data Devolução:Indefinido"));
	// emprestimos.put(2, new
	// Dados("Aluno:Anita Garibaldi Data Emprestimo: 01/02/2015  Data Devolução:Indefinido"));
	// }
}
