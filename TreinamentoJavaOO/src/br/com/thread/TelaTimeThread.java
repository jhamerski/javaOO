package br.com.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	/* Painel de Componentes */
	private JPanel jPanel = new JPanel(new GridBagLayout());
	private JLabel descricaoHora = new JLabel("Time da THREAD1");
	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("Time da THREAD2");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");

	private Runnable thread = new Runnable() {

		@Override
		public void run() {
			while (true) {
				mostraTempo
						.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private Thread threadTime;

	private Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			while (true) {
				mostraTempo2
						.setText(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread threadTime2;

	public TelaTimeThread() {
		setTitle("Minha tela de time com THREAD");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		/* Controlador de posicionamento de componentes */
		GridBagConstraints gridBagConstraints = new GridBagConstraints();

		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 10, 5);
		gridBagConstraints.anchor = gridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				threadTime = new Thread(thread);
				threadTime.start();
				
				threadTime2 = new Thread(thread2);
				threadTime2.start();
				
				jButton.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				threadTime.stop();
				threadTime2.stop();
				
				jButton.setEnabled(true);
				jButton2.setEnabled(false);
			}
		});

		/* Nesse momento o jButtons são iniciados na primeira posição */
		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton2.setEnabled(false);

		add(jPanel, BorderLayout.WEST);
		setVisible(true);
	}
}
