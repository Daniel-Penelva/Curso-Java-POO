package poo.fileTXTPessoa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EscreverArquivoPessoa {

	public static void main(String[] args) throws IOException {

		File arquivoPessoa = new File(
				"C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileTXTPessoa\\arquivoPessoa.txt");

		// Para escrever no arquivo
		FileWriter escreverNoArquivo = new FileWriter(arquivoPessoa);

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

		for (Pessoa p : listaPessoas) {
			escreverNoArquivo
					.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}
		
		escreverNoArquivo.flush();
		escreverNoArquivo.close();
	}

}
