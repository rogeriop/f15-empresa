package br.com.caelum.empresa;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

import br.com.caelum.controle.modelo.Gasto;
import br.com.caelum.empresa.modelo.Funcionario;
import static org.junit.Assert.*;


public class FiltradorDeGastosEspeciaisTest {

	@Test
	public void test() {
		
		Funcionario funcionario = new Funcionario("Marcelo", 12345, new GregorianCalendar(1990, 12, 12));
		
		Gasto gasto1 = new Gasto(1000.0, "transporte", funcionario, new GregorianCalendar(), true);
		Gasto gasto2 = new Gasto(1500.0, "alimentação", funcionario, new GregorianCalendar(), true);
		Gasto gasto3 = new Gasto(2000.0, "estadia", funcionario, new GregorianCalendar(), false);
		
		FiltradorDeGastosEspeciais filtrador = new FiltradorDeGastosEspeciais(1500.0);
		
		List<Gasto> gastos = new ArrayList<Gasto>();
		gastos.add(gasto1);
		gastos.add(gasto2);
		gastos.add(gasto3);
		
		List<Gasto> filtraGastosGrandes = filtrador.filtraGastosGrandes(gastos);
	
		assertEquals(2, filtraGastosGrandes.size());
		assertEquals(1500.0, filtraGastosGrandes.get(0).getValor(), 0.00001);
		assertEquals(2000.0, filtraGastosGrandes.get(1).getValor(), 0.00001);
	}

}
