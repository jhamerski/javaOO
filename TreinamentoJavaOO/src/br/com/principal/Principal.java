package br.com.principal;

import java.util.Scanner;

import br.com.classes.Aluno;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.print("Informe o nome do aluno: ");
		String nome = teclado.next();
		aluno.setNome(nome);
		
		System.out.print("Informe primeira nota: ");
		double notaUm = teclado.nextDouble();
		aluno.setNotaUm(notaUm);
		
		System.out.print("Informe segunda nota: ");
		double notaDois = teclado.nextDouble();
		aluno.setNotaDois(notaDois);

		System.out.println("O aluno " + aluno.getNome() + " ficou com média " + aluno.calculaMedia());
		
	}

}
