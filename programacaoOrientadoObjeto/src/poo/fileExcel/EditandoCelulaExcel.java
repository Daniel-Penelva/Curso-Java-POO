package poo.fileExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class EditandoCelulaExcel {

	public static void main(String[] args) throws IOException {

		File arquivo = new File(
				"C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileExcel\\arquivoExcel.xls");

		FileInputStream entrada = new FileInputStream(arquivo);
		
		// Prepara a entrada do arquivo excel
		HSSFWorkbook prepararArquivo = new HSSFWorkbook(entrada);
		
		// Pegar a planilha
		HSSFSheet planilha = prepararArquivo.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		// Enquanto tiver linha na planilha
		while(linhaIterator.hasNext()) {
			// Dados da pessoa na linha
			Row linha = linhaIterator.next();
			
			// Quantidade de números de células da linha
			int numeroCelulas = linha.getPhysicalNumberOfCells();
			
			String valorCelula = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorCelula + " * valor gravado na aula");
		}
		
		entrada.close();
		
		// Colocar a saida para o mesmo arquivo
		FileOutputStream saida = new FileOutputStream(arquivo);
		prepararArquivo.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
	}

}
