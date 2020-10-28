package br.com.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.classes.Aluno;
import br.com.classes.Disciplina;
import br.com.constantes.StatusAluno;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		System.out.print("Quantos alunos deseja cadastrar: ");
		int qtd = teclado.nextInt();

		for (int i = 1; i <= qtd; i++) {

			Aluno aluno = new Aluno();

			System.out.print("Informe o nome do " + i + "� aluno: ");
			String nome = teclado.next();
			aluno.setNome(nome);

			for (int j = 1; j <= 2; j++) {
				Disciplina disciplina = new Disciplina();

				System.out.print("Informe o nome da " + i + "� disciplina: ");
				String nomeDisciplina = teclado.next();
				System.out.print("Informe a nota " + i + "� nota: ");
				double nota = teclado.nextDouble();

				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(nota);

				aluno.getDisciplinas().add(disciplina);
			}

			alunos.add(aluno);

		}

		for (Aluno alu : alunos) {
			System.out.println("O aluno " + alu.getNome() + " ficou com m�dia " + alu.calculaMedia() + ".");
		}
		
		System.out.print("Informe o nome do aluno para saber se foi aprovado: ");
		String procurado = teclado.next();
		for (Aluno aluno : alunos) {
			if(aluno.getNome().equalsIgnoreCase(procurado)) {
				System.out.println("Aluno: " + aluno.getNome().toUpperCase() + " est� " + aluno.statusAprovacao());
			}else {
				System.out.print("Aluno n�o encontrado.");
			}
		}
		
		
		for (Aluno aluno : alunos) {
			if(aluno.statusAprovacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else if(aluno.statusAprovacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			}else {
				alunosReprovados.add(aluno);
			}
		}
	}

}
