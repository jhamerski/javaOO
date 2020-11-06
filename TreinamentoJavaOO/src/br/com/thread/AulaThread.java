package br.com.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		// ###################################DIVISAO DAS THREAD

		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

		/* Fluxo do sistema tem cotinuidade... */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário...");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			/* Código da Rotina */

			/* Código da rotina que for executar em paralelo */
			for (int i = 0; i < 10; i++) {
				System.out.println("Executando alguma rotina. Exemplo: Envio de e-mail...");

				/* Executar o envio com um determinado intervalo de tempo */
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} /* Dá um tempo */
			}
			/* Fim código paralelo */
		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			/* Código da Rotina */

			/* Código da rotina que for executar em paralelo */
			for (int i = 0; i < 10; i++) {
				System.out.println("Executando alguma rotina. Exemplo: Envio de Nota Fiscal...");

				/* Executar o envio com um determinado intervalo de tempo */
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} /* Dá um tempo */
			}
			/* Fim código paralelo */
		}
	};

}
