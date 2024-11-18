package co.edu.poli.examen1.modelo;

import java.util.Arrays;

/**
 * La clase {@code Pais} representa un pa�s con sus atributos y ciudades.
 * @author wsoto
 */
public class Pais {

    /** El c�digo del pa�s. */
    private String codigo;

    /** El nombre del pa�s. */
    private String nombre;

    /** La capital del pa�s. */
    private String capital;

    /** La longitud del pa�s. */
    private double longitud;

    /** La latitud del pa�s. */
    private double latitud;

    /** Un arreglo de ciudades en el pa�s. */
    private Ciudad[] ciudades;

    /** La flota mercante del pa�s. */
    private FlotaMercante flotamercante;

    /**
     * Crea una nueva instancia de {@code Pais} con los valores especificados.
     *
     * @param codigo     el c�digo del pa�s
     * @param nombre     el nombre del pa�s
     * @param capital    la capital del pa�s
     * @param longitud   la longitud del pa�s
     * @param latitud    la latitud del pa�s
     * @param ciudades   un arreglo de ciudades en el pa�s
     */
    public Pais(String codigo, String nombre, String capital, double longitud, double latitud, Ciudad[] ciudades) {
        super();
        this.codigo = codigo;
        this.nombre = nombre;
        this.capital = capital;
        this.longitud = longitud;
        this.latitud = latitud;
        this.ciudades = ciudades;
    }

    /**
     * Devuelve el c�digo del pa�s.
     *
     * @return el c�digo del pa�s
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el c�digo del pa�s.
     *
     * @param codigo el nuevo c�digo del pa�s
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve el nombre del pa�s.
     *
     * @return el nombre del pa�s
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del pa�s.
     *
     * @param nombre el nuevo nombre del pa�s
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la capital del pa�s.
     *
     * @return la capital del pa�s
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Establece la capital del pa�s.
     *
     * @param capital la nueva capital del pa�s
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * Devuelve la longitud del pa�s.
     *
     * @return la longitud del pa�s
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Establece la longitud del pa�s.
     *
     * @param longitud la nueva longitud del pa�s
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Devuelve la latitud del pa�s.
     *
     * @return la latitud del pa�s
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Establece la latitud del pa�s.
     *
     * @param latitud la nueva latitud del pa�s
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Devuelve un arreglo de ciudades del pa�s.
     *
     * @return un arreglo de ciudades
     */
    public Ciudad[] getCiudades() {
        return ciudades;
    }

    /**
     * Establece un nuevo arreglo de ciudades para el pa�s.
     *
     * @param ciudades el nuevo arreglo de ciudades
     */
    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }

    /**
     * Devuelve la flota mercante del pa�s.
     *
     * @return la flota mercante
     */
    public FlotaMercante getFlotamercante() {
        return flotamercante;
    }

    /**
     * Establece una nueva flota mercante para el pa�s.
     *
     * @param flotamercante la nueva flota mercante
     */
    public void setFlotamercante(FlotaMercante flotamercante) {
        this.flotamercante = flotamercante;
    }

    /**
     * Devuelve una representaci�n en forma de cadena del pa�s.
     *
     * @return una cadena que representa el pa�s
     */
    @Override
    public String toString() {
        return "Pais [codigo=" + codigo + ", nombre=" + nombre + ", capital=" + capital + ", longitud=" + longitud
                + ", latitud=" + latitud + ", ciudades=" + Arrays.toString(ciudades) + ", flotamercante="
                + flotamercante + "]";
    }
}
