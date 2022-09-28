package poo.exception;

/*
 * INFORMAÇÃO:
 * 
 * O método printStackTrace() mostra a pilha de informações da exceção do erro.
 * */

public class Principal {

	public static void main(String[] args) {

		/*
		 * Se testar o código abaixo: Cliente cliente = null;
		 * 
		 * Irá gerar um "java.lang.NullPointerException", ou seja, essa exceção
		 * significa que o seu cliente.getNome() está null.getNome(), logo o seu
		 * ponteiro cliente está nulo, no caso, o seu objeto está nulo.
		 * 
		 * Vale ressaltar que a exceção é lançada pela JVM.
		 */

		try {
			ValidacaoUtil.validarCPF("12345678912");

			// tipo String
			ValidacaoUtil.validaCNPJ("19829349075643");

			// tipo Long
			Cliente cli = new Cliente();
			cli.setCNPJ(19829349075649L);
			ValidacaoUtil.validaCNPJ(cli.getCNPJ());

		} catch (CpfInvalidaException e) {
			System.out.println("Erro!" + e.getMessage());
			e.printStackTrace();

		} catch (CnpjInvalidaException e) {
			System.out.println("Erro!" + e.getMessage());
			e.printStackTrace();

		} catch (Exception e) {
			// Tratando o array de forma genérica
			System.out.println("Erro: " + e.getMessage());

		} finally {
			System.out.println("Programa passou sem ocorrer erro de exceção!");
		}

		
		
		// Exemplo Extra - testando RuntimeException
		try {
			int[] vetor = new int[3];
			int valor = 0;

			for (int i = 0; i < vetor.length; i++) {
				valor = valor + 10;
				vetor[i] = valor;
			}

			// Para testar o erro, basta modificar o valor do índice do vetor.
			for (int i = 0; i < 3; i++) {
				System.out.println(vetor[i]);
			}

		} catch (Exception e) {
			System.out.println("Erro!" + e.getMessage());
		}
	}

}
