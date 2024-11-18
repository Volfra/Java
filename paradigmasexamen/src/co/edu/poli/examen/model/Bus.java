package co.edu.poli.examen.model;

import java.io.Serializable;

/**
 * 
 */
public class Bus implements Serializable {

    /**
     * Default constructor
     */
  

    /**
     * 
     */
    private String numBus;

    public Bus(String numBus, String placa, int qtPasajeros) {
		super();
		this.numBus = numBus;
		this.placa = placa;
		this.qtPasajeros = qtPasajeros;
	}
    

	public String getNumBus() {
		return numBus;
	}

	public void setNumBus(String numBus) {
		this.numBus = numBus;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getQtPasajeros() {
		return qtPasajeros;
	}

	public void setQtPasajeros(int qtPasajeros) {
		this.qtPasajeros = qtPasajeros;
	}
	
	

	@Override
	public String toString() {
		return "Bus [numBus=" + numBus + ", placa=" + placa + ", qtPasajeros=" + qtPasajeros + "]";
	}



	/**
     * 
     */
    private String placa;

    /**
     * 
     */
    private int qtPasajeros;

    /**
     * @param numBus 
     * @param placa 
     * @param qtPasajeros
     */

}