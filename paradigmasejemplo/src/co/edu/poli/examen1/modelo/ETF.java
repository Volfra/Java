package co.edu.poli.examen1.modelo;

/**
 * 
 */
public class ETF extends ActivoFinanciero {

    /**
     * Default constructor
     */
    public ETF() {
    }

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private String indice;

    /**
     * 
     */
    private Accion [ ] accion;

    /**
     * 
     */
    public static String estrategiaInversion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIndice() {
		return indice;
	}

	public void setIndice(String indice) {
		this.indice = indice;
	}

	public Accion[] getAccion() {
		return accion;
	}

	public void setAccion(Accion[] accion) {
		this.accion = accion;
	}

	public static String getEstrategiaInversion() {
		return estrategiaInversion;
	}

	public static void setEstrategiaInversion(String estrategiaInversion) {
		ETF.estrategiaInversion = estrategiaInversion;
	}

	@Override
	public String describirVenta() {
		return "con comisión a 1 día";
	}




}