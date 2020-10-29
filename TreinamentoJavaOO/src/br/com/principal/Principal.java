package br.com.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import br.com.classes.Aluno;
import br.com.classes.Disciplina;
import br.com.constantes.StatusAluno;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		List<Aluno> alunos = new ArrayList<Aluno>();

		//lista que dentro dela temos uma chave que identifica uma sequencia de valores
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		System.out.print("Quantos alunos deseja cadastrar: ");
		int qtd = teclado.nextInt();

		for (int i = 1; i <= qtd; i++) {

			Aluno aluno = new Aluno();

			System.out.print("Informe o nome do " + i + "� aluno: ");
			String nome = teclado.next();
			aluno.setNome(nome);

			for (int j = 1; j <= 2; j++) {
				Disciplina disciplina = new Disciplina();

				System.out.print("Informe o nome da " + j + "� disciplina: ");
				String nomeDisciplina = teclado.next();
				System.out.print("Informe a nota " + j + "� nota: ");
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
			}
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if(aluno.statusAprovacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.statusAprovacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if (aluno.statusAprovacao().equalsIgnoreCase(StatusAluno.REPROVADO)){
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("\n--------LISTA DOS APROVADOS--------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Aluno " + aluno.getNome() + " ficou com m�dia: " + aluno.calculaMedia());
		}
		System.out.println("-------LISTA DOS RECUPERA��O-------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Aluno " + aluno.getNome() + " ficou com m�dia: " + aluno.calculaMedia());
		}
		System.out.println("--------LISTA DOS REPROVADOS-------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Aluno " + aluno.getNome() + " ficou com m�dia: " + aluno.calculaMedia());
		}
	}

}
