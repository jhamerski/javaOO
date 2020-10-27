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
	
	//metodo para verificar se foi aprovado
	public String statusAprovacao() {
		double media = this.calculaMedia();
		
		if(media >= 70) {
			return "Aprovado";
		}else if (media >= 50 && media < 70) {
			return "Recuperação";
		}else {
			return "Reprovado";
		}
	}

	//Aqui acontece a comparação dos valores dos objetos
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	//Aqui acontece a comparação dos valores dos objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
