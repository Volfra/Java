package co.edu.poli.examen1.modelo;

/**
 * 
 */
public abstract class ActivoFinanciero {

    /**
     * Default constructor
     */
    public ActivoFinanciero() {
    }

    /**
     * 
     */
    private String identificacion;

    /**
     * 
     */
    private String anioEmision;

    /**
     * 
     */
    protected double precioCompra;

    /**
     * 
     */
    private double precioActual;

    /**
     * 
     */
    private Pais pais;

    /**
     * 
     */
    private Empresa empresa;

    public ActivoFinanciero(String identificacion, String anioEmision, double precioCompra, double precioActual,
			Pais pais, Empresa empresa) {
		super();
		this.identificacion = identificacion;
		this.anioEmision = anioEmision;
		this.precioCompra = precioCompra;
		this.precioActual = precioActual;
		this.pais = pais;
		this.empresa = empresa;
	}


	public String getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}



	public String getAnioEmision() {
		return anioEmision;
	}



	public void setAnioEmision(String anioEmision) {
		this.anioEmision = anioEmision;
	}



	public double getPrecioCompra() {
		return precioCompra;
	}



	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}



	public double getPrecioActual() {
		return precioActual;
	}



	public void setPrecioActual(double precioActual) {
		this.precioActual = precioActual;
	}



	public Pais getPais() {
		return pais;
	}



	public void setPais(Pais pais) {
		this.pais = pais;
	}



	public Empresa getEmpresa() {
		return empresa;
	}



	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}



	/**
     * @return
     */
    public double calcularRenPorc() {
        // TODO implement here
        return 3.5;
    }
    
    public abstract String describirVenta();

}