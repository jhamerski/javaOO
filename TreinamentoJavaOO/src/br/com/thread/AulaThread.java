package br.com.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			System.out.println("Executando alguma rotina. Exemplo: Envio de e-mail...");

			/* Executar o envio com um determinado intervalo de tempo */
			Thread.sleep(1000);/*Dá um tempo*/
		}
		
		System.out.println("CHEGOU AO FIM O CÓDIGO DE THREAD");

	}
}
