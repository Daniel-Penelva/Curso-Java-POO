package poo.fileExcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class CriandoArquivoExcel {

	public static void main(String[] args) throws IOException {

		/**
		 * Para manipular arquivos de Excel vai precisar da biblioteca Apache Poi, logo
		 * vai precisar baixar o jar (biblioteca), copiar e colar numa pasta lib.
		 * 
		 * Site para baixar a biblioteca Poi (vai ser usado o MAVEN)
		 * https://mvnrepository.com/artifact/org.apache.poi/poi
		 */

		File arquivoExcel = new File(
				"C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileExcel\\arquivoExcel.xls");

		if (!arquivoExcel.exists()) {
			arquivoExcel.createNewFile();
		}

		Pessoa p1 = new Pessoa();
		p1.setNome("Daniel");
		p1.setEmail("daniel@gmail.com");
		p1.setIdade(32);

		Pessoa p2 = new Pessoa();
		p2.setNome("Caio");
		p2.setEmail("caio@gmail.com");
		p2.setIdade(21);

		Pessoa p3 = new Pessoa();
		p3.setNome("Carla");
		p3.setEmail("carla@gmail.com");
		p3.setIdade(35);

		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);

		// Usado para escrever a planilha
		HSSFWorkbook escreverPlanilha = new HSSFWorkbook();

		// Criar a planilha
		HSSFSheet linhaPessoa = escreverPlanilha.createSheet("Planilha de pessoas");

		int numeroLinha = 0;
		for (Pessoa p : listaPessoas) {
			
			// Criando a linha na planilha
			Row linha = linhaPessoa.createRow(numeroLinha++);
			
			// Criando a célula
			int celula = 0;
			
			Cell celulaNome = linha.createCell(celula++); // Célula 1
			celulaNome.setCellValue(p.getNome());
			
			Cell celulaEmail = linha.createCell(celula++); // Célula 2
			celulaEmail.setCellValue(p.getEmail());
			
			Cell celulaIdade = linha.createCell(celula++); // Célula 3
			celulaIdade.setCellValue(p.getIdade());
		} /* Termina de montar a planilha */
		
		// Para criar a saida da planilha
		FileOutputStream saida = new FileOutputStream(arquivoExcel);
		escreverPlanilha.write(saida);
		
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada!");
	}

}
