package poo.exception;

public class MultiplosCatchSimilares {

	public static void main(String[] args) {
		// Teremos erros do tamanho do array, por divisao por zero
		int[] numeros = { 4, 8, 16, 32, 64, 128};
		int[] denominador = { 2, 0, 4, 8, 0};

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Ocorreu um ERRO!");
				e1.getMessage();
			}
		} // fim for
	}

}
