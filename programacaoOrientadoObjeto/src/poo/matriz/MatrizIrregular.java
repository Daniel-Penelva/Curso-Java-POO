package poo.matriz;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o número que serão entrevistados:");
		int numEntrevistados = ler.nextInt();

		String[][] nomesFilhos = new String[numEntrevistados][];

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos: ");
			int qtdFilhos = ler.nextInt();

			/*
			 * Para essa posição do vetor estamos criando um vetor. 
			 * Lembrando que matriz é um vetor de vetores.
			 */
			nomesFilhos[i] = new String[qtdFilhos];

			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho: " + (j + 1));
				nomesFilhos[i][j] = ler.next();

			}
		}

		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + (i+1) + " tem " + nomesFilhos[i].length + " filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

	}

}
