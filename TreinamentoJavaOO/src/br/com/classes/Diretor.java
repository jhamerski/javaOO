package br.com.classes;

public class Diretor extends Pessoa {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;

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

}
