package co.edu.poli.examen1.servicios;

import co.edu.poli.examen1.modelo.ActivoFinanciero;

public class ImplementacionOperacion implements Operacion {

	private ActivoFinanciero[] activos;

	public ImplementacionOperacion() {
		activos = new ActivoFinanciero[5];
	}

	@Override
	public String create(ActivoFinanciero x) {
		
		return "aqui es";
	}

}
