package br.com.caelum.controle.teste;

import java.util.GregorianCalendar;

import br.com.caelum.controle.modelo.Gasto;
import br.com.caelum.empresa.modelo.Funcionario;

public class TestaGasto {

	public static void main(String[] args) {
		
		
		Funcionario funcionario1 = new Funcionario("Maria", 123456, new GregorianCalendar(1958, 11, 28));
		Funcionario funcionario2 = new Funcionario("José", 123457, new GregorianCalendar(1970, 12, 03));
		Funcionario funcionario3 = new Funcionario("Pedro", 123458, new GregorianCalendar(1988, 01, 25));

		Gasto gasto1 = new Gasto(40.00, "refeição", funcionario1, new GregorianCalendar(2015, 04, 28), true);
		Gasto gasto2 = new Gasto(100.00, "transporte", funcionario1, new GregorianCalendar(2015, 04, 28), true);
		Gasto gasto3 = new Gasto(3500.00, "hospedagem", funcionario1, new GregorianCalendar(2015, 04, 28), true);
		
		System.out.println(gasto1);
		System.out.println(gasto2);
		System.out.println(gasto3);
	}

}
