package poo.array;

public class ExemploSplitArray {

	public static void main(String[] args) {
		
		String texto = "Daniel, JAVA, azul, 32, 1.76";
		
		//Vai repartir por virgula
		String[] valoresArrays = texto.split(",");
		
		System.out.println("Nome: " + valoresArrays[0]);
		System.out.println("Curso: " + valoresArrays[1]);
		System.out.println("Cor: " + valoresArrays[2]);
		System.out.println("Idade: " + valoresArrays[3]);
		System.out.println("Altura: " + valoresArrays[4]);
		
		System.out.println();
		
		for(int i=0; i<valoresArrays.length; i++) {
			System.out.println("Posição " + i + " é: " + valoresArrays[i]);
		}

	}

}
