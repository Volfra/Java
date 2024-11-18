package co.edu.poli.examen.services;



import co.edu.poli.examen.model.Troncal;

/**
 * 
 */
public interface Operacion {

    /**
     * @param id 
     * @return
     */
    public Troncal read(char id);

    /**
     * @param id 
     * @param T 
     * @return
     */
    public String update(char id, Troncal T);

}