package poo.variavel_metodo_static;

public class Professor {

	/*
	 * (Explica 1) Valor constante, ou seja, que não pode ser atribuido outro valor
	 * - a maioria das vezes a letra está caixa alta. Repare lá na classe Principal
	 * que vou chamar a variavel "VALOR_HORA_AULA" sem instancia-la. Como está
	 * definida como "final" não vou conseguir instanciar essa propriedade com o
	 * objetivo de atribuir um novo objeto. EX: Não vou conseguir fazer isso!!! VAI
	 * DAR ERRO, VAI INFORMAR QUE PRECISA TIRAR O FINAL... 
	 * Professor p1 = new Professor(); 
	 * p1.VALOR_HORA_AULA = 300;
	 */

	public static final double VALOR_HORA_AULA = 100;

	/*
	 * (Explica 2) Agora, se eu tirar o final, vou conseguir instanciar e atribuir
	 * novos valores, e esses novos valores atribuidos vão ser imprimidos (na Classe
	 * Principal)? Sim, e esse novo valor atribuído vai ser refletido em todos os
	 * objetos.
	 */

	public static double VALOR_DIA_AULA = 500;

	/*
	 * (Explica 3) É possível declarar uma propriedade static final como private?
	 * Sim. Só que para acessar seu objeto vai ser preciso utilizar o método
	 * getters. Já o método setters não vai ser possível gera-lo, uma vez que, está
	 * definido como "final", logo o valor não pode ser atribuído, ou seja, não é
	 * possível alterar esse valor.
	 */

	private static final double VALOR_SEMANA_AULA = 2000;

	public static double getValorSemanaAula() {
		return VALOR_SEMANA_AULA;
	}

	/*
	 * (Explica 4) - Criar uma variavel static valorMesAula e gerar os métodos
	 * getters e setters
	 */

	private static double valorMesAula = 6000;

	public static double getValorMesAula() {
		return valorMesAula;
	}

	public static void setValorMesAula(double valorMesAula) {
		Professor.valorMesAula = valorMesAula;
	}

	
	/*
	 * (Explica 5) É possível criar um método que não é estático (static) alterando
	 * uma propriedade estática.
	 */
	
	public void mudarValorDiaAula(double novoValorDia) {
		VALOR_DIA_AULA = novoValorDia;
		System.out.println("Novo valor do dia: " + novoValorDia);
	}

	
	//Atributos 
	private String nome;
	private String materia;

	
	//métodos getters e setters 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}
