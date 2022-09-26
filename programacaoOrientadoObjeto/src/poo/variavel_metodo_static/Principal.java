package poo.variavel_metodo_static;

public class Principal {

	public static void main(String[] args) {

		// Repare que estou chamando a propriedade static final sem instância-la.
		System.out.println("Valor da aula por hora: " + Professor.VALOR_HORA_AULA);

		/*
		 * (Explica 1) Vou instanciar alguns objetos da classe Professor. Eu vou
		 * conseguir instanciar um novo valor nessa propriedade static final? Não, por
		 * que o valor estabelecido pela variavel static final já está definido na
		 * classe Professor, ou seja, não vou conseguir atribuir novos valores nesse
		 * objeto,logo dará erro.
		 */

		/*
		 * (Explica 1) O nome de p1 é diferente do nome de p2. E isso implica na
		 * instancia, pois a propriedade nome é uma propriedade do objeto e não da
		 * classe. Agora, a propriedade (variavel) VALOR_HORA_AULA é uma propriedade da
		 * classe, ou seja, ela está na raiz, todos os objetos vão vim com esse mesmo
		 * valor. É um valor pre-definido independetemente de cada instancia, todos vão
		 * ter aquele valor, logo é uma propriedade static final.
		 */

		Professor p1 = new Professor();
		p1.setNome("Daniel Penelva");

		// Se adicionar esse comando: p1.VALOR_HORA_AULA = 500;

		// Vai gerar erro, porque a propriedade está definida como static e
		// final...(Explica 1)

		
		/*
		 * (Explica 2) Se atribuir novos valores na propriedade "VALOR_DIA_AULA",esse
		 * novo valor atribuido será imprimido em todos os objetos. Ou seja, Vou
		 * instanciar os objetos p1 e p2, mas vou atribuir um novo valor somente na
		 * instancia da variavel "p1", e esse novo valor atribuido "400" vai ser
		 * refletido também no outro objeto p2. Portanto, se eu alterar esse objeto,
		 * todos os outros objetos também sofreram essa mesma alteração, por que a
		 * alteração não é no objeto instanciado e sim na classe onde ela vai se
		 * redefinir e pré-definido, isso se a propriedade estiver como "static", se
		 * tiver um "final", não vai ser possível alterar esse valor, ele sempre será o
		 * mesmo já definido. Portanto, essa atribuição estaria errada:
		 * p1.VALOR_DIA_AULA = 400; A correta seria assim:
		 */

		Professor.VALOR_DIA_AULA = 250;
		System.out.println("Valor de Aula por dia: " + p1.VALOR_DIA_AULA);

		Professor p2 = new Professor();
		p2.setNome("Davi");
		System.out.println("Aula com " + p2.getNome() + " - custa " + p2.VALOR_DIA_AULA);

		
		// (Explica 3) Gerando o valor.
		System.out.println("Valor de aula por semana: " + Professor.getValorSemanaAula());

		
		// (Explica 4) Atribuindo novo valor através do método setters.
		Professor.setValorMesAula(5100);
		System.out.println("Valor de aula por mês: " + Professor.getValorMesAula());

		// ou

		Professor p3 = new Professor();
		p3.setNome("Paulo");
		p3.setValorMesAula(4900);
		System.out.println("Aula com " + p3.getNome() + " - custa por mês: " + p3.getValorMesAula());

		
		// (Explica 5) Instanciando um novo objeto e atribuindo um novo valor no método
		// mudarValorDia()
		Professor p4 = new Professor();
		p4.mudarValorDiaAula(400);
		
		
		//Exemplo extra - convertendo tipos.
		String n = "6";
		Integer novoN = Integer.parseInt(n);
		System.out.println("N: " + novoN);

	}

}
