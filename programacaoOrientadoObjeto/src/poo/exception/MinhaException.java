package poo.exception;

public class MinhaException {
//Vou criar uma classse "DivisaoNaoExata" para tratar o erro da divisao que resulta numero real.
//Teremos erros do tamanho do array, por divisao por zero, e divisao que resulta numero real.
		
	public static void main(String[] args) {

		try {
			programa();
		} catch (DivisaoNaoExata e) {
			e.printStackTrace();
		}

	}
	
	public static void programa() throws DivisaoNaoExata{
		int[] numeros = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0, 2, 3 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				if (numeros[i] % 2 != 0) {
					throw new DivisaoNaoExata(numeros[i], denominador[i]);
				}
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Ocorreu um ERRO!");
				e1.printStackTrace();
			}
		} // fim for
	}

}
