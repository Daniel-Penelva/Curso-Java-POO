package poo.fileTXT_Planilha;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CriarArquivoTxt {

	public static void main(String[] args) throws IOException {

		/**
		 * OBS. Para capturar esse caminho da pasta, segue as seguintes etapas:
		 * 1. Clica com o botão direito em cima do pacote poo.file 
		 * 2. Clica em properties 
		 * 3. Em Location copia o caminho do pacote.*/
		
		File arquivo = new File(
				"C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileTXT//arquivo.txt");

		// Se o arquivo não existe, então vai ser criado.
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		// Para escrever no arquivo
		FileWriter escreverNoArquivo = new FileWriter(arquivo);

		// Escrever no arquivo de texto
		escreverNoArquivo.write("Olá Java!");

		escreverNoArquivo.write("\n\n");

		for (int i = 0; i <= 10; i++) {
			escreverNoArquivo.write("Linha de texto " + (i + 1) + "\n");
		}
		
		escreverNoArquivo.flush();
		escreverNoArquivo.close();

	}

}
