package br.com.classes;

public class Aluno {

	private String nome;
	private double notaUm;
	private double notaDois;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNotaUm() {
		return notaUm;
	}

	public void setNotaUm(double notaUm) {
		this.notaUm = notaUm;
	}

	public double getNotaDois() {
		return notaDois;
	}

	public void setNotaDois(double notaDois) {
		this.notaDois = notaDois;
	}

	//metodo para calcular a media de notas dos alunos
	public double calculaMedia() {
		return (notaUm + notaDois) / 2;
	}

}
