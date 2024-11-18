package co.edu.poli.examen1.servicios;

import co.edu.poli.examen1.modelo.ActivoFinanciero;

public class Fraccionada extends ActivoFinanciero{

	private double porcFraccion;

	public double getPorcFraccion() {
		return porcFraccion;
	}

	public void setPorcFraccion(double porcFraccion) {
		this.porcFraccion = porcFraccion;
	}

	@Override
	public String describirVenta() {
		return "comisión a 4 días";
	}


	
	
}
