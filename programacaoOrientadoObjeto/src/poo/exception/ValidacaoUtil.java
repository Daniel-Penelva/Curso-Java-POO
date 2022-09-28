package poo.exception;

/* INFORMAÇÕES:
 * 
 * --> Sobre o método validarCPF:
 * 
 * A função replace() está dizendo que qualquer ponto que ele ache na nossa String 
 * será substituído por nada, logo, será removido.Está função é utilizada para os casos
 * que utilizam CPF ja que em sua composição são separadas por "." e "-".
 * 
 * Próxima etapa é criar uma condição para o CPF que só vai ser validado com o valor
 * correto de 11 números. Caso entre com o valor incorreto vamos relançar com o throw new 
 * a exceção CpfInvalidaException. 
 * 
 * 
 * --> Sobre o método validarCNPJ do tipo Long
 * 
 * Essa exceção não precisa ser tratada, uma vez que pertence a classe da RuntimeException
 * 
 * Vai ser invocado um IllegalArgumentException - ela ocorre quando um método recebe um
 * argumento inválido. Geralmente é usada em casos onde recebemos um input inválido
 * que não deve ser aceito em nossa aplicação, como é o caso de um email no formato 
 * inválido, um campo obrigatório que foi deixado vazio, um input no formato inválido,
 * etc...
 * */

public class ValidacaoUtil {

	// Implementação do exception do CPF - Exemplificando uma nova exceção
	public static void validarCPF(String cpf) throws CpfInvalidaException {

		System.out.println("Testando validação CPF: " + cpf);

		cpf = cpf.replace(".", "");
		cpf = cpf.replace("-", "");

		if (cpf.length() != 11) {
			throw new CpfInvalidaException();
		}
	}

	
	// Implementação do exception do CNPJ - Exemplificando exceção RuntimeException
	public static void validaCNPJ(Long CNPJ) {
		System.out.println("Validando CNPJ: " + CNPJ);
	
		if(CNPJ != 11) {
			throw new IllegalArgumentException();
		}
	}

	
	// Implementação do exception do CNPJ - Exemplificando uma nova exceção
	public static void validaCNPJ(String cnpj) throws CnpjInvalidaException {
		System.out.println("Valida cnpj: " + cnpj);

		cnpj = cnpj.replace(".", "");
		cnpj = cnpj.replace("/", "");
		cnpj = cnpj.replace("-", "");

		if (cnpj.length() != 14) {
			throw new CnpjInvalidaException();
		}
	}

}
