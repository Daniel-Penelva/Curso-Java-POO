package poo.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateFormatEmJava {

	public static void main(String[] args) {

		Date data = new Date();
		System.out.println("Data: " + data);

		// mostra qual é a localidade, no caso, pt_BR
		System.out.println(Locale.getDefault());

		// OBS. Caso não estivesse em portugues, seria passado da seguinte maneira.
		// Locale.setDefault(new Locale("pt", "Brazil"));

		// Formatar a data e a hora - repare que está transformando num tipo String
		//DateFormat é mais util para usar o locale
		String formatarDataEHora = DateFormat.getInstance().format(data);
		System.out.println(formatarDataEHora);

		// Formatar a data -> dd/MM/yyyy
		String formatarData = DateFormat.getDateInstance().format(data);
		System.out.println(formatarData);

		// Formatar a hora
		String formatarHora = DateFormat.getTimeInstance().format(data);
		System.out.println(formatarHora);

		// Formatar a hora e a data
		String formatarDataEHora1 = DateFormat.getDateTimeInstance().format(data);
		System.out.println(formatarDataEHora1);

		// Pode criar um estilo - vai formatar a hora de forma curta
		formatarDataEHora1 = DateFormat.getTimeInstance(DateFormat.SHORT).format(data);
		System.out.println(formatarDataEHora1);

		// Pode criar um estilo - vai formatar a hora de forma média
		formatarDataEHora1 = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(data);
		System.out.println(formatarDataEHora1);

		// Pode criar um estilo - vai formatar a hora de forma média
		formatarDataEHora1 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(data);
		System.out.println(formatarDataEHora1);

		
		// Passando de String para Data
		String data1 = "21/10/2022 03:16";
		try {
			Date conversaoData = DateFormat.getInstance().parse(data1);
			System.out.println(conversaoData);
			
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(conversaoData);
			System.out.println(calendario);
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
