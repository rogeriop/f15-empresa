package br.com.caelum.empresa;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.Collection;

import br.com.caelum.controle.modelo.Gasto;

public class TesteImportador {

	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
		String conteudo = "CARTAO010120110000100000123Joao da Silva                 25012970\r\n"
                + "CARTAO010120110000100000124Jose da Silva                 25012970\r\n"
                + "CARTAO010120110000100000124Jose da Silva                 25012970\r\n"
                + "CARTAO010120110000100000124Jose da Silva                 25012970";
		
		ImportadorDeGastos importador = new ImportadorDeGastos();
		
		Collection<Gasto> list = importador.importa(new ByteArrayInputStream(conteudo.getBytes("UTF-8")));
		
		for (Gasto gasto: list) {
			System.out.println(gasto);
		}
	
	}

}
