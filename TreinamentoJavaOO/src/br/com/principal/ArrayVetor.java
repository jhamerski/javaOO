package br.com.principal;

import java.util.Scanner;

import br.com.classes.Aluno;
import br.com.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);


		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Jonas Hamerski");
		
		/*Criação da disciplina*/
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Matemática");
		
		/*Criação das notas*/
		double[] notas = {100.0, 90.0, 80.0, 75.0};
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
	}
}
