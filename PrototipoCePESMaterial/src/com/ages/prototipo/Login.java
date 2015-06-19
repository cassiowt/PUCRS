package com.ages.prototipo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Login {
	private String usuario;
	private String senha;
	private String mensagemLogin;
	private String mensagemBotaoLogin = "Login";
	private String iniciar;
	private Boolean logado = false;

	public Login() {
		this.usuario = "";
		
	}

	
	public String getIniciar() {
		if (logado == false) {
			return "login";
		} else {
			return "index";
		}

	}

	public String valida() {

		if (logado == false) {

			Dados dados = new Dados();

			if (usuario.equals("cassiowt") & senha.equals("123456")) {

				dados.addMessage("Login", "sucesso");
				this.mensagemLogin = (this.usuario);
				this.mensagemBotaoLogin = "Logout";
				this.logado = true;
				return "index.xhtml";

			} else {

				dados.addMessage("Login", "erro");
				this.mensagemLogin = "";
				this.mensagemBotaoLogin = "Login";
				this.logado = false;
				return "login.xhtml";
			}
		}
		return "index.xhtml";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getLogado() {
		return logado;
	}

	public void setLogado(Boolean logado) {
		this.logado = logado;
	}

	public String getMensagemLogin() {
		return mensagemLogin;
	}

	public void setMensagemLogin(String mensagemLogin) {
		this.mensagemLogin = mensagemLogin;
	}

	public String getMensagemBotaoLogin() {
		return mensagemBotaoLogin;
	}

	public void setMensagemBotaoLogin(String mensagemBotaoLogin) {
		this.mensagemBotaoLogin = mensagemBotaoLogin;
	}

}
