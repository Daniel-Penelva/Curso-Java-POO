package poo.data;

import java.util.Date;

public class DateEmJava {

	public static void main(String[] args) {
		
		//Classe mais básica para Data
		
		Date data = new Date();
		System.out.println(data);
		System.out.println("Milissegundos desde 1 jan 1970: " + data.getTime());
		

	}

}
