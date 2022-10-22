package poo.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneEmJava {

	public static void main(String[] args) {

		Calendar calendario = Calendar.getInstance();

		TimeZone fusoHorario = calendario.getTimeZone();
		System.out.println(fusoHorario);

		// Imprimir todos os Ids dos fuso horários existentes
		String[] fusos = TimeZone.getAvailableIDs();
		for (String f : fusos) {
			System.out.println(f);
		}

		// Configurar outro fuso horario
		TimeZone jamaica = TimeZone.getTimeZone("Jamaica");
		System.out.println("Fuso Horario da Jamaica: " + jamaica);
		System.out.println(jamaica.getDisplayName());
		System.out.println(jamaica.getID());
		

		// Para converter datas e salvar
		// Ou seja, coverter a data "America/Sao_Paulo" e salvar em algum lugar.

		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraJamaica = Calendar.getInstance(jamaica);
		System.out.println(sdf.format(agoraJamaica.getTime()));
		
		agoraJamaica.add(calendario.HOUR_OF_DAY, jamaica.getOffset(System.currentTimeMillis())/1000/60/60);
		System.out.println(sdf.format(agoraJamaica.getTime()));

	}

}
