package co.edu.poli.examen1.modelo;

public class FlotaMercante {
	
	private String codigo;
	
	private String nombre;
	
	private String fechaCreacion;

	public FlotaMercante(String codigo, String nombre, String fechaCreacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
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

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		return "FlotaMercante [codigo=" + codigo + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + "]";
	}

}
