package poo.matriz;

public class MatrizTridimensional {

	public static void main(String[] args) {

		int[][][] matrizTridimensional = new int[3][3][3];

		for (int linha = 0; linha < matrizTridimensional.length; linha++) {
			for (int coluna = 0; coluna < matrizTridimensional[linha].length; coluna++) {
				for (int profundidade = 0; profundidade < matrizTridimensional[linha][coluna].length; profundidade++) {
					matrizTridimensional[linha][coluna][profundidade] = linha + coluna + profundidade;
				}
			}
		}

		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for (int linha = 0; linha < matrizTridimensional.length; linha++) {
			for (int coluna = 0; coluna < matrizTridimensional[linha].length; coluna++) {
				for (int profundidade = 0; profundidade < matrizTridimensional[linha][coluna].length; profundidade++) {
					soma += matrizTridimensional[linha][coluna][profundidade];

					if (matrizTridimensional[linha][coluna][profundidade] % 2 == 0) {
						somaPares += matrizTridimensional[linha][coluna][profundidade];
					} else {
						somaImpares += matrizTridimensional[linha][coluna][profundidade];
					}
				}
			}
		}

		// Imprimir a matriz tridimensional

		for (int linha = 0; linha < matrizTridimensional.length; linha++) {
			for (int coluna = 0; coluna < matrizTridimensional[linha].length; coluna++) {
				for (int profundidade = 0; profundidade < matrizTridimensional[linha][coluna].length; profundidade++) {
					System.out.println("Matriz " + "[" + linha + "]" + " [" + coluna + "]" + " [" + profundidade + "]"
							+ " = " + matrizTridimensional[linha][coluna][profundidade]);
				}
			}
		}

		// Imprimir a Soma, numeros pares e impares
		System.out.println("Soma da matriz tridimensional: " + soma);
		System.out.println("Soma dos números pares da matriz tridimensional: " + somaPares);
		System.out.println("Soma dos números impares da matriz tridimensional: " + somaImpares);
	}

}
