package poo.construtorHeranca;

public class C extends B {
	/*
	 * Exemplo para estudo!!! O comando super() chama o construtor padrão de B, mas
	 * neste caso, não é padrão. Ou seja, está com aspas pq o construtor de B não é
	 * padrão e sim sobrecarregado. Logo como o construtor de B é sobrecarregado
	 * chamando como parametro uma String, em relação a hierarquia de B para C, o
	 * super de C terá que ser definido como String
	 */

	public C() {
		super("");
		System.out.println("C");
	}

	//Exemplo 2
	// Mudando a sintaxe do construtor para sobrecarregado
	
	/*
		 * Exemplo para estudo!!! O comando super() chama o construtor padrão de B, mas
		 * neste caso, não é padrão. Ou seja, está com valor z de tipo String pq o
		 * construtor de B não é padrão e sim sobrecarregado. Logo como o construtor de
		 * B é sobrecarregado chamando como parametro uma String, em relação a
		 * hierarquia de B para C, o super de C terá que ser definido como String
		 */
	public C(String z) {
		
		super(z);
		System.out.println("Construtor de C String");
	}

	
	//Exemplo 3
	// mudando a sintaxe do contrutor para sobrecarregado
	// mesmo sem colocar o comando super(), ele como padrão vai imprimir os 3
	// construtores (A,B e C)
	public C(int x) {
		// vai chamar o construtor de cima, ou seja, o this é o construtor de cima.
		// o comando this vai imprimir: o super e o system.out.println...
		this(String.valueOf(x));
		// ...depois vai imprimir este system
		System.out.println("Construtor de C int");
	}

}
