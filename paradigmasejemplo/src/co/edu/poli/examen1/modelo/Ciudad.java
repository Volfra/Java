package co.edu.poli.examen1.modelo;

/**
 * La clase Ciudad representa una ciudad con atributos como c�digo,
 * nombre, poblaci�n y �rea. Proporciona m�todos para acceder y modificar
 * estos atributos, as� como para obtener una representaci�n en cadena
 * de la ciudad.
 * @author wsoto
 * @since 22.10.24
 */
public class Ciudad {
	
	private String codigo;
	
	private String nombre;
	
	private int poblacion;
	
	/** El �rea de la ciudad en kil�metros cuadrados. */
	private double area;

    /**
     * Constructor para crear una instancia de Ciudad.
     *
     * @param codigo el c�digo de la ciudad
     * @param nombre el nombre de la ciudad
     * @param poblacion la poblaci�n de la ciudad
     * @param area el �rea de la ciudad
     */
	public Ciudad(String codigo, String nombre, int poblacion, double area) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.area = area;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Ciudad [codigo=" + codigo + ", nombre=" + nombre + ", poblacion=" + poblacion + ", area=" + area + "]";
	}
	
	public String test (ActivoFinanciero a) {
		return a.getClass().getSimpleName();
	}


}
