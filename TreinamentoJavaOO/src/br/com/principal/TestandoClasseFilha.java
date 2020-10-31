package br.com.principal;

import br.com.classes.Aluno;
import br.com.classes.Diretor;
import br.com.classes.Pessoa;
import br.com.classes.Secretario;

public class TestandoClasseFilha {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Jonas Hamerski");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setNome("Patryck");
		diretor.setRegitroEducacao("7263716278316");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Arthur");
		secretario.setExperiencia("Ci�ncia da Computa��o");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		
		System.out.println("Aluno tem sal�rio de " + aluno.salario());
		System.out.println("Ditero tem sal�rio de " + diretor.salario());
		System.out.println("Secret�rio tem sal�rio de " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Esta pessoa � demais = " + pessoa.getNome() + " e o sal�rio � de: " + pessoa.salario());
	}
}
