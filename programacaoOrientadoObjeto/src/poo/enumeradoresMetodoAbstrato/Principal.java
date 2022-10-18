package poo.enumeradoresMetodoAbstrato;

public class Principal {

	public static void main(String[] args) {
	
		//Exemplo 1
		
		Double somando = EnumCalculadora.SOMA.calculando(20, 10);
		Double subtraindo = EnumCalculadora.SUBTRACAO.calculando(20, 2);
		Double multiplicando = EnumCalculadora.MULTIPLICACAO.calculando(20, 5);
		Double dividindo = EnumCalculadora.DIVISAO.calculando(20, 10);
		
		System.out.println(somando.toString());
		System.out.println(subtraindo.toString());
		System.out.println(multiplicando.toString());
		System.out.println(dividindo.toString());
		
		System.out.println();
		
		//Exemplo 2
		
		Double so = EnumCalculadora2.SOMA.calculando(10, 30);
		System.out.println(so);
		
		Double sub = EnumCalculadora2.SUBTRACAO.calculando(50, 30);
		System.out.println(sub);
		
		Double mult = EnumCalculadora2.MULTIPLICACAO.calculando(100, 5);
		System.out.println(mult);
		
		Double div = EnumCalculadora2.DIVISAO.calculando(100, 2);
		System.out.println(div);
	}

}
