package br.com.principal;

import java.util.Scanner;

import br.com.classes.Aluno;
import br.com.classes.Disciplina;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.print("Informe o nome do aluno: ");
		String nome = teclado.next();
		aluno.setNome(nome);
		
		for (int i = 1; i <= 2; i++) {
			System.out.print("Informe o nome da " + i + "° disciplina: ");
			String nomeDisciplina = teclado.next();
			System.out.print("Informe a nota " + i + "° nota: ");
			double nota = teclado.nextDouble();
			
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(nota);

			
			aluno.getDisciplinas().add(disciplina);
		}

		System.out.print("O aluno " + aluno.getNome() + " ficou com média " + aluno.calculaMedia() + ", ficou: "
				+ aluno.statusAprovacao());

	}

}
