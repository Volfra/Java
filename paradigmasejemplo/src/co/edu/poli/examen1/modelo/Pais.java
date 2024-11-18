package co.edu.poli.examen1.modelo;

import java.util.Arrays;

/**
 * La clase {@code Pais} representa un país con sus atributos y ciudades.
 * @author wsoto
 */
public class Pais {

    /** El código del país. */
    private String codigo;

    /** El nombre del país. */
    private String nombre;

    /** La capital del país. */
    private String capital;

    /** La longitud del país. */
    private double longitud;

    /** La latitud del país. */
    private double latitud;

    /** Un arreglo de ciudades en el país. */
    private Ciudad[] ciudades;

    /** La flota mercante del país. */
    private FlotaMercante flotamercante;

    /**
     * Crea una nueva instancia de {@code Pais} con los valores especificados.
     *
     * @param codigo     el código del país
     * @param nombre     el nombre del país
     * @param capital    la capital del país
     * @param longitud   la longitud del país
     * @param latitud    la latitud del país
     * @param ciudades   un arreglo de ciudades en el país
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
     * Devuelve el código del país.
     *
     * @return el código del país
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del país.
     *
     * @param codigo el nuevo código del país
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve el nombre del país.
     *
     * @return el nombre del país
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del país.
     *
     * @param nombre el nuevo nombre del país
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la capital del país.
     *
     * @return la capital del país
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Establece la capital del país.
     *
     * @param capital la nueva capital del país
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * Devuelve la longitud del país.
     *
     * @return la longitud del país
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Establece la longitud del país.
     *
     * @param longitud la nueva longitud del país
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Devuelve la latitud del país.
     *
     * @return la latitud del país
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Establece la latitud del país.
     *
     * @param latitud la nueva latitud del país
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Devuelve un arreglo de ciudades del país.
     *
     * @return un arreglo de ciudades
     */
    public Ciudad[] getCiudades() {
        return ciudades;
    }

    /**
     * Establece un nuevo arreglo de ciudades para el país.
     *
     * @param ciudades el nuevo arreglo de ciudades
     */
    public void setCiudades(Ciudad[] ciudades) {
        this.ciudades = ciudades;
    }

    /**
     * Devuelve la flota mercante del país.
     *
     * @return la flota mercante
     */
    public FlotaMercante getFlotamercante() {
        return flotamercante;
    }

    /**
     * Establece una nueva flota mercante para el país.
     *
     * @param flotamercante la nueva flota mercante
     */
    public void setFlotamercante(FlotaMercante flotamercante) {
        this.flotamercante = flotamercante;
    }

    /**
     * Devuelve una representación en forma de cadena del país.
     *
     * @return una cadena que representa el país
     */
    @Override
    public String toString() {
        return "Pais [codigo=" + codigo + ", nombre=" + nombre + ", capital=" + capital + ", longitud=" + longitud
                + ", latitud=" + latitud + ", ciudades=" + Arrays.toString(ciudades) + ", flotamercante="
                + flotamercante + "]";
    }
}
