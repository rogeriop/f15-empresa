package br.com.caelum.empresa;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.controle.modelo.Gasto;

public class FiltradorDeGastosEspeciais {
    private Double limite;

    public FiltradorDeGastosEspeciais(Double limite) {
    	super();
    	this.limite = limite;
    }

    public List<Gasto> filtraGastosGrandes(List<Gasto> gastos) {
        List<Gasto> gastosAcimaDoLimite = new ArrayList<Gasto>();
        for (Gasto gasto : gastos) {
            if(gasto.getValor() >= this.limite) 
                gastosAcimaDoLimite.add(gasto);
        }
        return gastosAcimaDoLimite;
    }

}
