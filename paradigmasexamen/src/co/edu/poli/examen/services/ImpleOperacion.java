package co.edu.poli.examen.services;


import co.edu.poli.examen.model.Troncal;

/**
 * 
 */
public class ImpleOperacion implements Operacion {
	

    /**
     * Default constructor
     */
    public ImpleOperacion(Troncal [] x) {
    	this.agenda = x;
    }
    
    /**
     * 
     */
    private Troncal [] agenda;
    
    /**
     * @param id 
     * @return
     */
    public Troncal read(char id) {
    	for (int i = 0; i < agenda.length; i++) {
			if(agenda [i] != null) {
				if(agenda[i].getLetra() == id) {
				return  agenda [i];
				}
			}
		}
		return  null;
    }

    /**
     * @param id 
     * @param T 
     * @return
     */
    public String update(char id, Troncal T) {
    	int c = 0;
		String message = "";
		for (int i = 0; i < agenda.length; i++) {
			if(agenda [i] != null) {
				if(agenda[i].getLetra() == id) {
					agenda [i] = T;
					c++;
					message +="Transaccion actualizada ";
					return message;
				}
			}
		}
		if(c == 0) {
			message +=  "Transaccion no presente ";
		}
		return message;
    }

}