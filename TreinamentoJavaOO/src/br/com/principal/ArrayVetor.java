package br.com.principal;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double notas[] = new double[4];
		double[] notas1 = new double[5];
		
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			notas[i] = i;
		}
		
		System.out.println();
	}
}
