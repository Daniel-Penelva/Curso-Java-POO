package poo.fileExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LeituraArquivoExcel {

	public static void main(String[] args) throws IOException {

		// Para criar a entrada de leitura da planilha
		FileInputStream entrada = new FileInputStream(new File(
				"C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileExcel\\arquivoExcel.xls"));

		// Prepara a entrada do arquivo excel para ler
		HSSFWorkbook prepararArquivo = new HSSFWorkbook(entrada);

		// Pega a primeira planilha do nosso arquivo excel
		HSSFSheet planilha = prepararArquivo.getSheetAt(0);

		// Percorrer as linhas da planilhas
		Iterator<Row> linhaIterator = planilha.iterator();

		// Vai percorrer na lista de usuários
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		// Enquanto estiver linha vai percorrer
		while (linhaIterator.hasNext()) {
			// Vai pegar os dados da pessoa na linha
			Row linha = linhaIterator.next();

			// Percorrer o iterator de célula
			Iterator<Cell> celulas = linha.iterator();

			// Instanciar a Pessoa
			Pessoa pessoa = new Pessoa();

			// Percorrer as células
			while (celulas.hasNext()) {
				Cell c = celulas.next();

				switch (c.getColumnIndex()) {
				case 0:
					pessoa.setNome(c.getStringCellValue());
					break;

				case 1:
					pessoa.setEmail(c.getStringCellValue());
					break;

				case 2:
					pessoa.setIdade(Double.valueOf(c.getNumericCellValue()).intValue());
					break;

				default:
					break;
				}
			} // Fim da célula da linha

			// Adiciona na lista
			pessoas.add(pessoa);
		}

		// Terminou de ler o arquivo
		entrada.close();

		// Imprimir a lista de pessoas
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	}

}
