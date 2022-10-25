package poo.fileTXT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		// Arquivo de entrada de dados
		FileInputStream entradaDeDados = new FileInputStream(new File(
				"C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileTXT\\arquivo.txt"));

		Scanner lerArquivo = new Scanner(entradaDeDados, "UTF-8");

		// Enquanto o arquivo estiver dados
		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();
			
			//Para ignorar as linhas em branco 
			if(linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}
		}
		
		//OBS. Por exemplo, se adicionar um nova pessoa no arquivo de texto, também irá imprimir.
	}
}
