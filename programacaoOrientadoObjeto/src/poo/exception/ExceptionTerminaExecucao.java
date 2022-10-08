package poo.exception;

public class ExceptionTerminaExecucao {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));

			} catch (ArithmeticException e1) {
				System.out.println("ERRO! Não existe divisão por zero!");
				//termina a execução
				System.exit(0);
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println("Erro ao acessar o indice do vetor!");
				System.exit(0);
			}
		} // fim for

	}

}
