package co.edu.poli.examen1.modelo;

/**
 * La clase Ciudad representa una ciudad con atributos como código,
 * nombre, población y área. Proporciona métodos para acceder y modificar
 * estos atributos, así como para obtener una representación en cadena
 * de la ciudad.
 * @author wsoto
 * @since 22.10.24
 */
public class Ciudad {
	
	private String codigo;
	
	private String nombre;
	
	private int poblacion;
	
	/** El área de la ciudad en kilómetros cuadrados. */
	private double area;

    /**
     * Constructor para crear una instancia de Ciudad.
     *
     * @param codigo el código de la ciudad
     * @param nombre el nombre de la ciudad
     * @param poblacion la población de la ciudad
     * @param area el área de la ciudad
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
