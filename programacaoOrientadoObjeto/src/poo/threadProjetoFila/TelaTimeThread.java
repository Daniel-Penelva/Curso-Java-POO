package poo.threadProjetoFila;

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
	private JLabel descricaoNome = new JLabel("Nome: ");

	// Criando um campo de texto
	private JTextField mostraNome = new JTextField();

	private JLabel descricaoEmail = new JLabel("E-mail: ");
	private JTextField mostraEmail = new JTextField();

	// Criando um botão
	private JButton botaoAddLista = new JButton("Add Lista");
	private JButton botaoStop = new JButton("Stop");

	private ImplementaFilaThread fila = new ImplementaFilaThread();

	// Construtor
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

		// Pense numa tabela, onde o 1º quadrante é zero --> grid(x,y) =
		// grid(linha,coluna)
		// Corresponde a linha horizontal (eixo X)
		gbc.gridx = 0;
		gbc.gridwidth = 2;

		// Corresponde a coluna vertical (eixo Y)
		gbc.gridy = 0;

		gbc.insets = new Insets(5, 10, 5, 5); // Organiza os componentes (topo, esquerda, direita, baixo)
		gbc.anchor = GridBagConstraints.WEST; // alinha-se a esquerda

		// Precismos criar um painel para os componentes

		/*
		 * Vamos instanciar a dimensão da label e do campo de texto no painel e
		 * Adicionar no painel a label e o gerenciador de componentes.
		 */
		descricaoNome.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoNome, gbc);

		gbc.gridy++; // vamos posicionar abaixo da label - coluna (eixo y)

		/*
		 * Vamos instanciar a dimensão do campo de texto no painel e Adicionar no painel
		 * o campo de texto e o gerenciador de componentes.
		 */
		mostraNome.setPreferredSize(new Dimension(200, 25));
		jpanel.add(mostraNome, gbc);

		gbc.gridy++;

		descricaoEmail.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoEmail, gbc);

		gbc.gridy++;

		mostraEmail.setPreferredSize(new Dimension(200, 25));
		jpanel.add(mostraEmail, gbc);

		gbc.gridy++;

		gbc.gridwidth = 1; // para alinhar o botao start ao lado do stop

		botaoAddLista.setPreferredSize(new Dimension(92, 25));
		jpanel.add(botaoAddLista, gbc);

		gbc.gridx++;

		botaoStop.setPreferredSize(new Dimension(92, 25));
		jpanel.add(botaoStop, gbc);

		// Adicionar uma borda no painel a esquerda
		add(jpanel, BorderLayout.WEST);

		// Adicionando a ação do botão Start
		botaoAddLista.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Condição para parar (stop) o disparo em massa - tendo a possibilidade de
				// continuar (start)
				if (fila == null) {
					fila = new ImplementaFilaThread();
					fila.start();
				}

				// Simulando um disparo em massa
				for (int qtd = 0; qtd < 20; qtd++) {

					FilaThread filaThread = new FilaThread();
					filaThread.setNome(mostraNome.getText());
					filaThread.setEmail(mostraEmail.getText() + " - " + qtd);

					fila.add(filaThread);
				}
			}
		});

		// Adicionando a ação do botão Stop
		botaoStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
			}
		});

		// Rodar a thread
		fila.start();

		// Adicionar uma borda no painel a esquerda
		add(jpanel, BorderLayout.WEST);

		// Tornar a tela visível ao usuário - OBS. sempre a última linha
		setVisible(true);
	}

}
