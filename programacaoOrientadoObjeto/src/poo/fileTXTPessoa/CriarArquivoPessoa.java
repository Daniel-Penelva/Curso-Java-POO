package poo.fileTXTPessoa;

import java.io.File;
import java.io.IOException;

public class CriarArquivoPessoa {

	public static void main(String[] args) throws IOException {
		
		File arquivoPessoa = new File("C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileTXT\\arquivoPessoa.txt");
		
		if(!arquivoPessoa.exists()) {
			arquivoPessoa.createNewFile();
		}
	}

}
