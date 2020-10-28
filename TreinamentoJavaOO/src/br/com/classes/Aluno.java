package br.com.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.constantes.StatusAluno;

public class Aluno {

	private String nome;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//metodo para calcular a media de notas dos alunos
	public double calculaMedia() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();;
		}
		
		return somaNotas / disciplinas.size();
	}
	
	//metodo para verificar se foi aprovado
	public String statusAprovacao() {
		double media = this.calculaMedia();
		
		if(media >= 70) {
			return StatusAluno.APROVADO;
		}else if (media >= 50 && media < 70) {
			return StatusAluno.RECUPERACAO;
		}else {
			return StatusAluno.REPROVADO;
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
