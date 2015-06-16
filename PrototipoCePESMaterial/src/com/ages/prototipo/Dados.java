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

	private String dados;

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	public List<String> completeText(String query) {
		List<String> results = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			results.add(query +"__"+ i);
		}

		return results;
	}

	public void onItemSelect(SelectEvent event) {
		FacesContext.getCurrentInstance()
				.addMessage(
						null,
						new FacesMessage("Dado Selecionado", event.getObject()
								.toString()));
	}
}
