package poo.data;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarEmJava {

	public static void main(String[] args) {

		GregorianCalendar hoje = new GregorianCalendar();
		System.out.println(hoje);
		
		imprimirData(hoje);

	}

	private static void imprimirData(Calendar calendario) {

		int ano = calendario.get(Calendar.YEAR);
		System.out.println("Ano " + ano);

		int mes = calendario.get(Calendar.MONTH);
		System.out.println("Mês " + mes);

		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		System.out.println("Dia " + dia);

		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		System.out.println("Hora " + hora);

		int minutos = calendario.get(Calendar.MINUTE);
		System.out.println("Minutos " + minutos);

		int segundos = calendario.get(Calendar.SECOND);
		System.out.println("Segundos " + segundos);
		
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
	}

}
