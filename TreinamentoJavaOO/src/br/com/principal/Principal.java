package br.com.principal;

import java.util.Scanner;

import br.com.classes.Aluno;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jonas");

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Jonas");

		//Ele compara dois objetos e antes de sobrescrever o EQUALS E HASHCODE eles são objetos diferentes.
		if (aluno1.equals(aluno2)) {
			System.out.println("São iguais.");
		}else{
			System.out.println("Diferentes");
		}
		
	}

}
