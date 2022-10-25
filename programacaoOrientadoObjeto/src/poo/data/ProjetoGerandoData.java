package poo.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProjetoGerandoData {

	public static void main(String[] args) throws ParseException {

		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("24/10/2022");

		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataInicial);

		for (int parcela = 1; parcela <= 12; parcela++) {
			// Acrescenta um mês
			calendario.add(Calendar.MONTH, 1);
			System.out.println("Parcela número: " + parcela + " vencimento é em: "
					+ new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime()));
		}

	}

}
