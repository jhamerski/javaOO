package br.com.principal;

import br.com.classes.Aluno;
import br.com.classes.Diretor;
import br.com.classes.Secretario;

public class TestandoClasseFilha {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Jonas Hamerski");

		Diretor diretor = new Diretor();
		diretor.setRegitroEducacao("7263716278316");

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Ciência da Computação");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println("Teste");

	}
}
