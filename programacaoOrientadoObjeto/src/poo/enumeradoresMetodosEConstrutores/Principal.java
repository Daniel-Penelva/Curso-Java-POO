package poo.enumeradoresMetodosEConstrutores;

import poo.enumeradoresMetodosEConstrutores.Formulario.Genero;

public class Principal {

	public static void main(String[] args) {

		//Instanciando o enum DiaSemana
		DiaSemana domingo = DiaSemana.DOMINGO;

		DiaSemana segunda = DiaSemana.DOMINGO;

		System.out.println(domingo.toString() + " - " + domingo.getValor());

		System.out.println(segunda.toString() + " - " + segunda.getValor());

		System.out.println();

		//Chamando Construtor Data
		Data data = new Data(18, 10, 2022, DiaSemana.SEGUNDA);
		System.out.println("Data: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno() + " - "
				+ data.getDiaSemana().TERCA);

		//Instanciando a Classe Formulario
		Formulario formulario = new Formulario();

		//Instanciando o enum Genero
		Genero masc = Genero.MASCULINO;
		Genero fem = Genero.FEMININO;

		System.out.println("Generos: " + masc.toString() + " / " + fem.toString());

		System.out.println();

		// setando valores
		formulario.setNome("Daniel");
		formulario.setGenero(masc);

		System.out.println("Nome: " + formulario.getNome() + " - Genero: " + formulario.getGenero());

		System.out.println();

		// Chamando construtor fomulario
		Formulario form1 = new Formulario("Carla", Genero.FEMININO);
		System.out.println("Nome: " + form1.getNome() + " - Genero: " + form1.getGenero());

		System.out.println();

		// Usando métodos value 
		System.out.println("Usando o método values() para obter todos os valores no enumerador!");

		DiaSemana[] dias = DiaSemana.values();

		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}

		// ou
		System.out.println();

		for (DiaSemana d : DiaSemana.values()) {
			System.out.println(d);
		}

		System.out.println();

		// Usando métodos valueOf - consegue obter um enum atraves de uma String
		System.out.println("Usando o método valuesOf()!");
		
		//EXEMPLO 1
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		
		//EXEMPLO 2
		DiaSemana diaSemana = Enum.valueOf(DiaSemana.class, "QUARTA");
		System.out.println("Dia Semana: " + diaSemana);

	}
}
