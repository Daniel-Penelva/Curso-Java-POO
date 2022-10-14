package poo.array;

import java.util.Arrays;
import java.util.List;

public class ExemploConversaoArray {

	public static void main(String[] args) {
		// Conversão de Array para Lista e;
		// Coversão de Lista para Array.

		String[] cor = { "azul", "amarelo", "vermelho", "preto", "branco" };

		// Convertendo um Array em uma Lista
		List<String> lista = Arrays.asList(cor);

		for (String valores : lista) {
			System.out.println("Valores cores: " + valores);
		}

		System.out.println();

		
		// Convertendo uma Lista em um Array
		String[] conversaoArray = lista.toArray(new String[5]);

		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println("Valores cores: " + conversaoArray[pos]);
		}
	}

}
