package poo.matriz;

public class ExemplosMatrizes {

	public static void main(String[] args) {
		
		double[][] numero = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 20}};
		
		for(int linha=0; linha<numero.length; linha++) {
			for(int coluna=0; coluna<numero[linha].length; coluna++) {
				System.out.println("Matriz " + "[" + linha + "]" + " [" + coluna + "]" + " = " + numero[linha][coluna]);
			}
		}

		// OBS. Uma matriz é um array onde cada posição contém outro array.

		/*
		 * 
		 * M [linha][coluna] --> M[2][3] 
		 *                                                            ^
		 * M[1][1] M[1][2] M[1][3]           -----------> linha       | 
		 * M[2][1] M[2][2] M[2][3]                                    |
		 *                                                            |
		 *                                                          coluna
		 */

		int M[][] = new int[2][3];
		M[0][0] = 80;
		M[0][1] = 90;
		M[0][2] = 100;

		M[1][0] = 10;
		M[1][1] = 20;
		M[1][2] = 30;

		System.out.println("Exemplo 1");
		for (int linha = 0; linha < 2; linha++) {
			System.out.println("============================");
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Matriz " + "[" + linha + "]" + " [" + coluna + "]" + " = " + M[linha][coluna]);
			}
		}

		System.out.println("\n");
		System.out.println("Exemplo 2");
		for (int linha = 0; linha < M.length; linha++) {
			System.out.println("============================");
			for (int coluna = 0; coluna < M[linha].length; coluna++) {
				System.out.println("Matriz " + "[" + linha + "]" + " [" + coluna + "]" + " = " + M[linha][coluna]);
			}
		}
	}

}
