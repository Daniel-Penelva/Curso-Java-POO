package poo.construtorHeranca;

public class Principal {

	public static void main(String[] args) {
		// Podemos chamar os contrutores padrão, não importando o que está implementado
		// no construtor.
		// Vamos instanciar todos os contrutores

		// Cada construtor instanciado vai gerar dois objetos
		// 1º o que está no comando super()
		// 2º o que está no comando system.out.println()

		System.out.println("Construtor A: ");
		new A();// Vai imprimir o contrutor de Object(por padrão não imprimi) e o A.

		System.out.println("\n");
		System.out.println("Construtor B");
		new B("");// Vai imprimir os construtores de Object, A e B.

		System.out.println("\n");
		System.out.println("Construtor C");
		new C();// Vai imprimir os construtores de Object, A, B e C.

		System.out.println("\n");

		// Construtor sobrecarregado = que recebe valor dentro do parâmetro
		Integer valor = new Integer(10);
		System.out.println(valor);

		new C(100);// Vai imprimir os construtores de Object, A, B, C (int) e C (String)

		new C("Valor do tipo String"); // Vai imprimir os construtores de Object, A, B e C (String)

	}

}
