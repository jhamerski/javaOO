package br.com.principal;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Quanto posições tem o Array? ");
		int posicoes = teclado.nextInt();
		
		double notas[] = new double[posicoes];
		//double[] notas1 = new double[5];
		
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° valor: ");
			notas[i] = teclado.nextDouble();
		}
		
		System.out.println("Resultado: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " - ");
		}
	}
}
