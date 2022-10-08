package poo.exception;

public class MultiplosCatch {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };     

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));

			} catch (ArithmeticException e1) {
				System.out.println("ERRO! Não existe divisão por zero!");
				e1.getMessage();
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Erro ao acessar o indice do vetor!");
				e2.getMessage();
			}
		} // fim for
	}

}
