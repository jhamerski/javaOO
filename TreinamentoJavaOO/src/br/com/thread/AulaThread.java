package br.com.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/*Thread processando em paralelo*/
		new Thread() {
			public void run() {/* Executa o que nós queremos */
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
			};
		}.start();/* Liga a thread que fica processando paralelamente */

		/*
		 * Código do sistama para o usuário chegou ao fim, ou continua o fluxo do
		 * programa
		 */
		System.out.println("CHEGOU AO FIM O CÓDIGO DE THREAD");

		/* Fluxo do sistema tem cotinuidade... */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário...");
	}
}
