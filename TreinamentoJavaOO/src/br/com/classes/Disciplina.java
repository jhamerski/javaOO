package br.com.classes;

import java.util.Arrays;

public class Disciplina {

	private double[] nota = new double[4];
	private String nomeDisciplina;

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return nomeDisciplina;
	}

	public void setDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public double getMediaNotas() {
		double soma = 0;
		for (int i = 0; i < nota.length; i++) {
			soma += nota[i];
		}
		return soma / nota.length;
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + nomeDisciplina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeDisciplina == null) ? 0 : nomeDisciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (nomeDisciplina == null) {
			if (other.nomeDisciplina != null)
				return false;
		} else if (!nomeDisciplina.equals(other.nomeDisciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}

}
