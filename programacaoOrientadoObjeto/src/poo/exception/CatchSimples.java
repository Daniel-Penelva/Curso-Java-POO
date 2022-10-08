package poo.exception;

public class CatchSimples {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];  // array-posição: 0, 1, 2, 3

			System.out.println("Antes do exception");

			vetor[4] = 1; //array-posição 4

			System.out.println("Esse texto não será impresso!");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Erro ao acessar o indice do vetor!");
			exception.getMessage();
		}

	}

}
