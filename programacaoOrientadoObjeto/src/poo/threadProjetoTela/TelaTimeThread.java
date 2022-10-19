package poo.threadProjetoTela;

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
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	// Painel de componentes
	JPanel jpanel = new JPanel(new GridBagLayout());

	// Criando uma Label
	private JLabel descricaoHora = new JLabel("Time Thread #1");
	

	// Criando um campo de texto
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time Thread #2");
	private JTextField mostraTempo2 = new JTextField();
	
	//Criando um botão
	private JButton botaoStart = new JButton("Start");
	private JButton botaoStop = new JButton("Stop");
	
	// Criar as funcionalidades da Thread 1
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			//Objetivo é fazer sempre rodar o relogio até que o usuário queira parar. 
			while(true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				
				/*OBS. A segunda Thread pode ser feita aqui tb, logo como ficaria?
				 * 
				 * mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				 * 
				 * Mas para a didatica vou criar a thread2.
				 * */
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
						
			}
			
		}
	};
	
	// Criar as funcionalidades da Thread 2
		private Runnable thread2 = new Runnable() {
			
			@Override
			public void run() {
				//Objetivo é fazer sempre rodar o relogio até que o usuário queira parar. 
				while(true) {
					mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh-mm-ss").format(Calendar.getInstance().getTime()));
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
							
				}
				
			}
		};
	
	//Instancia para fazer a ação do botaoStart da Thread 1
	private Thread thread1Time;
	
	//Instancia para fazer a ação do botaoStart da Thread 2
    private Thread thread2Time;

	//Construtor 
	public TelaTimeThread() {

		// Título da tela
		setTitle("Minha tela de TimeThread");

		// Dimensão da tela
		setSize(new Dimension(240, 240));

		// Para centralizar a tela
		setLocationRelativeTo(null);

		// Não deixar redimensionar a tela
		setResizable(false);

		/**
		 * Vamos usar um painel e um gerenciador de emulador, ou seja, um controlador de
		 * posicionamento dos componentes - para construir uma interface gráfica de
		 * forma alinhada.
		 */

		// Controlador de posicionamento de componentes
		GridBagConstraints gbc = new GridBagConstraints();

		// Pense numa tabela, onde o 1º quadrante é zero --> grid(x,y) = grid(linha,coluna)
		// Corresponde a linha horizontal (eixo X)
		gbc.gridx = 0;
		gbc.gridwidth=2;

		// Corresponde a coluna vertical (eixo Y)
		gbc.gridy = 0;
		
		gbc.insets = new Insets(5, 10, 5, 5); //Organiza os componentes (topo, esquerda, direita, baixo)
		gbc.anchor = GridBagConstraints.WEST; // alinha-se a esquerda

		// Precismos criar um painel para os componentes

		/*
		 * Vamos instanciar a dimensão da label e do campo de texto no painel e
		 * Adicionar no painel a label e o gerenciador de componentes.
		 */
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora, gbc);
		
		gbc.gridy ++;  //vamos posicionar abaixo da label - coluna (eixo y)

		/*
		 * Vamos instanciar a dimensão do campo de texto no painel e 
		 * Adicionar no painel o campo de texto e o gerenciador de componentes.
		 */
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		jpanel.add(mostraTempo, gbc);
		mostraTempo.setEditable(false); // Para desabilitar os campos de texto
		
		gbc.gridy ++;
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora2, gbc);
		
		gbc.gridy ++;
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		jpanel.add(mostraTempo2, gbc);
		mostraTempo2.setEditable(false); // Para desabilitar os campos de texto
		
		gbc.gridy ++;
		
		gbc.gridwidth=1; //para alinhar o botao start ao lado do stop
		
		botaoStart.setPreferredSize(new Dimension(92, 25));
		jpanel.add(botaoStart, gbc);
		
		gbc.gridx ++;
		
		botaoStop.setPreferredSize(new Dimension(92, 25));
		jpanel.add(botaoStop, gbc);
		

		// Adicionar uma borda no painel a esquerda
		add(jpanel, BorderLayout.WEST);
		
		
		// Adicionando a ação do botão Start
		botaoStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time = new Thread(thread1);
				thread2Time = new Thread(thread2);
				
				thread1Time.start();
				thread2Time.start();
				
				// Desabilita o botão start ao ser clicado
				botaoStart.setEnabled(false);
				
				// Habilita o botão stop quando clicado o start
				botaoStop.setEnabled(true);
			}
		});
		
		
		// Adicionando a ação do botão Stop
		botaoStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();	
				thread2Time.stop();
				
				// Habilita o botão start ao ser clicado
				botaoStart.setEnabled(true);
				
				// Desabilita o botão stop quando clicado o start
				botaoStop.setEnabled(false);
			}
		});
		
		//Desabilitar o botão Stop ao abrir a tela
		botaoStop.setEnabled(false);

		// Tornar a tela visível ao usuário - OBS. sempre a última linha
		setVisible(true);
	}

}
