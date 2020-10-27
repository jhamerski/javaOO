package br.com.principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.classes.Aluno;
import br.com.classes.Disciplina;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<Aluno>();

		System.out.print("Quantos alunos vamos cadastrar? ");
		int qtd = teclado.nextInt();

		//add lista de alunos
		for (int i = 1; i <= qtd; i++) {
			Aluno aluno = new Aluno();
			System.out.print("Nome do " + i + "° aluno: ");
			String nome = teclado.next();
			aluno.setNome(nome);
			alunos.add(aluno);

			//add disciplina
			Disciplina disciplina = new Disciplina();
			System.out.print("Nome da " + i + "° disciplina: ");
			String nmDisciplina = teclado.next();
			disciplina.setDisciplina(nmDisciplina);
			aluno.getDisciplinas().add(disciplina);
			
			//add nota
			System.out.print("Nota de " + nmDisciplina + ": ");
			double nota = teclado.nextDouble();
			disciplina.setNota(nota);
		}
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome() + " " + aluno.getDisciplinas());
		}

	}

}
