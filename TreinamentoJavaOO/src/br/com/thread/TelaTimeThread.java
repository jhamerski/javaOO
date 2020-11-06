package br.com.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {

	public TelaTimeThread() {
		setTitle("Minha tela de time com THREAD");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		
		setVisible(true);
	}
}
