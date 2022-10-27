package poo.fileJSON;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJson {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario = new Usuario();
		
		usuario.setNome("Daniel");
		usuario.setLogin("D4n");
		usuario.setSenha("123");
		usuario.setCpf("1111111111");
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setNome("Pedro");
		usuario1.setLogin("P3d");
		usuario1.setSenha("123");
		usuario1.setCpf("22222222222");
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(usuario);
		listaUsuarios.add(usuario1);
		
		// Organiza a estrutura do código
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(listaUsuarios);
		
		System.out.println(jsonUser);
		
		FileWriter arquivo = new FileWriter("C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileJSON\\arquivoJSON.json");
		
		arquivo.write(jsonUser);
		arquivo.flush();
		arquivo.close();
		
		/* --------------------- Lendo o Arquivo Json --------------------- */
		
		FileReader fileReader = new FileReader("C:\\Users\\d4nan\\git\\repository2\\programacaoOrientadoObjeto\\src\\poo\\fileJSON\\arquivoJSON.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> liUsuarios = new ArrayList<Usuario>();
		
		for(JsonElement jsonElement: jsonArray) {
			Usuario usu = new  Gson().fromJson(jsonElement, Usuario.class);
			liUsuarios.add(usu);
		}
		
		// Vai imprimir o toString do Usuario
		System.out.println("Leitura do arquivo JSON: " + liUsuarios);

	}

}
