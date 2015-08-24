package br.com.caelum.empresa;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.caelum.controle.modelo.Gasto;
import br.com.caelum.empresa.modelo.Funcionario;

public class ImportadorDeGastos
{
	private SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
	public List<Gasto> importa(InputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		List<Gasto> gastos = new ArrayList<Gasto>();
		while (leitor.hasNextLine()) {
			String line = leitor.nextLine();
			String tipo = line.substring(0, 6);
			String data = line.substring(6, 14);
			String valorTxt = line.substring(14, 23);
			String matriculaTxt = line.substring(23, 26);
			String nome = line.substring(26, 56);
			String dataNascTxt = line.substring(56);
			double valor = Double.parseDouble(valorTxt);
			int matricula = Integer.parseInt(matriculaTxt);
			
			Calendar dataNascimento = converteDataTxtParaCalendar(dataNascTxt);
			
			Calendar dataDespesa = converteDataTxtParaCalendar(data);
			
			Funcionario funcionario = new Funcionario(nome, matricula,
					dataNascimento);
			gastos.add(new Gasto (valor, tipo, funcionario, dataDespesa, true));
		}
		return gastos;
	}

	private Calendar converteDataTxtParaCalendar(String dataTxt)
			throws ParseException {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(df.parse(dataTxt));
		return dataNascimento;
	}
}
