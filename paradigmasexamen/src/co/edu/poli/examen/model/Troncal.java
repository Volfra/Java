package co.edu.poli.examen.model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 * @author wsoto
 * @since
 */
public class Troncal implements Serializable {

    /**
     * Default constructor
     */
   
	/**
     * 
     */
    private char letra;

    public Troncal(char letra, String destino, int demandaPromedio, Ruta[] rutas) {
		super();
		this.letra = letra;
		this.destino = destino;
		this.demandaPromedio = demandaPromedio;
		this.rutas = rutas;
	}
    
	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDemandaPromedio() {
		return demandaPromedio;
	}

	public void setDemandaPromedio(int demandaPromedio) {
		this.demandaPromedio = demandaPromedio;
	}

	public Ruta[] getRutas() {
		return rutas;
	}

	public void setRutas(Ruta[] rutas) {
		this.rutas = rutas;
	}
	
	@Override
	public String toString() {
		return "Troncal [letra=" + letra + ", destino=" + destino + ", demandaPromedio=" + demandaPromedio + ", rutas="
				+ Arrays.toString(rutas) + "]";
	}

	/**
     * 
     */
    private String destino;

    /**
     * 
     */
    private int demandaPromedio;

    /**
     * 
     */
    private Ruta [ ] rutas;


    /**
     * 
     * @param n
     * @return
     */
    protected int factorial (int n) {
    	if (n==1)
    		return 1;
    	return factorial(n-1)*n;
    }

}