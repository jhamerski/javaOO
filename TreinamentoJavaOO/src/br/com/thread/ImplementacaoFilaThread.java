package br.com.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilhaFila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilhaFila.add(objetoFilaThread);
	}

	@Override
	public void run() {
		Iterator iteracao = pilhaFila.iterator();

		synchronized (iteracao) {/* Bloquear o acesso a esta lista por outros processos */

			while (iteracao.hasNext()) {/* Enquanto tiver dados na lista, irá processar */
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

				/* AQUI ACONTECE NOSSO PROCESSO */
				//System.out.println(processar.getNome());
				//System.out.println(processar.getEmail());

				iteracao.remove();

				/* Dar um tempo para descarga de memória */
				try {
					Thread.sleep(100);/* Tempo para descarga de memória */
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		/*
		 * Tempo para descarga de memória depois de processar toda lista - LIMPEZA DE
		 * MEMORIA
		 */
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
