package co.edu.poli.examen.services;



import co.edu.poli.examen.model.Troncal;

/**
 * 
 */
public interface OperacionArchivo {

	/**
	 * a
	 * @param troncales a
	 * @param path a
	 * @param name a
	 */
    public void serializar(Troncal [ ] troncales, String path, String name);

    /**
     * b
     * @param path b
     * @param name b
     * @return b
     */
    public Troncal [ ] deSerializar(String path, String name);

}