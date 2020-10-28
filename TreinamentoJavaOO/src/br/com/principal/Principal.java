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

		System.out.print("Quantos alunos deseja cadastrar: ");
		int qtd = teclado.nextInt();

		for (int i = 1; i <= qtd; i++) {

			Aluno aluno = new Aluno();

			System.out.print("Informe o nome do " + i + "° aluno: ");
			String nome = teclado.next();
			aluno.setNome(nome);

			for (int j = 1; j <= 2; j++) {
				Disciplina disciplina = new Disciplina();

				System.out.print("Informe o nome da " + i + "° disciplina: ");
				String nomeDisciplina = teclado.next();
				System.out.print("Informe a nota " + i + "° nota: ");
				double nota = teclado.nextDouble();

				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(nota);

				aluno.getDisciplinas().add(disciplina);
			}

			alunos.add(aluno);

		}

		for (Aluno alu : alunos) {
			System.out.println("O aluno " + alu.getNome() + " ficou com média " + alu.calculaMedia() + ", ficou: "
					+ alu.statusAprovacao());
		}

	}

}
