package co.edu.poli.examen1.modelo;

/**
 * Esta clase representa acciones en el mercado bursatil
 * @author wsoto
 * @since 22.10.24
 */
public class Accion extends ActivoFinanciero {

    public Accion() {
    }

	public Accion(double dividendo) {
		super();
		this.setDividendo(dividendo);
	}   
	
	/**
	 * Este metodo es el constructor sobrecaggdad
	 * @param dividendo ganancia
	 * @param rendimiento es el valor de ganacia de la accion
	 * @param sectorEmpresa empressa e
	 */
    public Accion(double dividendo, double rendimiento, String sectorEmpresa) {
		super();
		this.setDividendo(dividendo);
		this.rendimiento = rendimiento;
		this.sectorEmpresa = sectorEmpresa;
	}


	/**
	 * Esto es la ganacia de la acción
	 */
    private double dividendo;

    /**
     * 
     */
    private double rendimiento;

    /**
     * 
     */
    private String sectorEmpresa;

    
    
    public double getRendimiento() {
		return rendimiento;
	}





	@Override
    public double calcularRenPorc() {
		
    	return 4.7;
    }


	public double getDividendo() {
		return dividendo;
	}

	public void setDividendo(double dividendo) {
		this.dividendo = dividendo;
	}

	@Override
	public String describirVenta() {
		return "Sin comisión 3 días";
	}

}