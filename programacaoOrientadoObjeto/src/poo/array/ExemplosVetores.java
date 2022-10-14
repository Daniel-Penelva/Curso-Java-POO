package poo.array;

import javax.swing.JOptionPane;

public class ExemplosVetores {

	public static void main(String[] args) {

		// Exemplo 1
		double[] valores = { 3.3, 4.6, 8.9, 9.0 };
		System.out.println(valores[1]);

		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}

		// Exemplo 2
		double[] notas = new double[4];

		notas[0] = 8.9;
		notas[1] = 7.8;
		notas[2] = 9.0;
		notas[3] = 5.0;

		System.out.println("Nota - posição 4 é: " + notas[3]);
		System.out.println("\n");

		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota - posição " + pos + " é " + notas[pos]);
		}

		// Exemplo 3
		// Com entrada de dados
		String posicao = JOptionPane.showInputDialog("Entre com o tamanho do array: ");
		double[] notas1 = new double[Integer.parseInt(posicao)];

		for (int pos = 0; pos < notas1.length; pos++) {
			String ler = JOptionPane.showInputDialog("Entre com a " + pos + "º do vetor:");
			notas1[pos] = Double.parseDouble(ler);
		}

		for (int pos = 0; pos < notas1.length; pos++) {
			JOptionPane.showConfirmDialog(null, "Nota - posição " + pos + " é " + notas1[pos]);
		}

	}

}
