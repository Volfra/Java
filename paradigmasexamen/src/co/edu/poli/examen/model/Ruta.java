package co.edu.poli.examen.model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Ruta implements Serializable {

    /**
     * Default constructor
     */
    

    /**
     * 
     */
    private String id;

    public Ruta(String id, String tipo, int qtyParadas, Bus[] buses) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.qtyParadas = qtyParadas;
		this.buses = buses;
	}
    

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQtyParadas() {
		return qtyParadas;
	}

	public void setQtyParadas(int qtyParadas) {
		this.qtyParadas = qtyParadas;
	}

	public Bus[] getBuses() {
		return buses;
	}

	public void setBuses(Bus[] buses) {
		this.buses = buses;
	}
	

	@Override
	public String toString() {
		return "Ruta [id=" + id + ", tipo=" + tipo + ", qtyParadas=" + qtyParadas + ", buses=" + Arrays.toString(buses)
				+ "]";
	}


	/**
     * 
     */
    private String tipo;

    /**
     * 
     */
    private int qtyParadas;

    /**
     * 
     */
    private Bus [ ] buses;

    /**
     * @param id 
     * @param tipo 
     * @param qtyParadas 
     * @param buses
     */

}