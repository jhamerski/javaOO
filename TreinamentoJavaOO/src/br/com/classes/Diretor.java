package br.com.classes;

import br.com.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;

	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Diretor() {
	}

	public String getRegitroEducacao() {
		return registroEducacao;
	}

	public void setRegitroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [regitroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}

	@Override
	public double salario() {
		return 3900.78;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}

}
