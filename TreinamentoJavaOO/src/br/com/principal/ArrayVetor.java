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
		
		/*Criação da disciplina*/
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Computação");
		
		/*Criação das notas*/
		double[] notas1 = {88.0, 70.0, 60.0, 95.0};
		disciplina1.setNota(notas1);
		
		aluno.getDisciplinas().add(disciplina1);
		
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		
		System.out.println("=== Disciplinas do aluno ===");
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("Disiciplina: " + d.getDisciplina());
			System.out.println("As notas da Disciplina são: ");
			for(int i = 0; i < d.getNota().length; i++) {
				System.out.println("Nota " + (i + 1) + "° é igual à: " + d.getNota()[i]);
			}
			System.out.println();
		}
		
	}
}
