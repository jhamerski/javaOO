package br.com.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/*Thread processando em paralelo*/
		new Thread() {
			public void run() {/* Executa o que n�s queremos */
				/* C�digo da Rotina */

				/* C�digo da rotina que for executar em paralelo */
				for (int i = 0; i < 10; i++) {
					System.out.println("Executando alguma rotina. Exemplo: Envio de e-mail...");

					/* Executar o envio com um determinado intervalo de tempo */
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} /* D� um tempo */
				}
				/* Fim c�digo paralelo */
			};
		}.start();/* Liga a thread que fica processando paralelamente */

		/*
		 * C�digo do sistama para o usu�rio chegou ao fim, ou continua o fluxo do
		 * programa
		 */
		System.out.println("CHEGOU AO FIM O C�DIGO DE THREAD");

		/* Fluxo do sistema tem cotinuidade... */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio...");
	}
}
