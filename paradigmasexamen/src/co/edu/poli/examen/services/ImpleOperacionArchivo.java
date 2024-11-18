package co.edu.poli.examen.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import co.edu.poli.examen.model.Troncal;

/**
 * 
 */
public class ImpleOperacionArchivo implements OperacionArchivo {

    /**
     * Default constructor
     */
    public ImpleOperacionArchivo() {
    }

    public void serializar(Troncal [ ] troncales, String path, String name) {
        try {
			FileOutputStream fos = new FileOutputStream(path + name);
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(troncales);
			oos.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public Troncal [ ] deSerializar(String path, String name) {
    	Troncal [] a = null;
		try {	
		FileInputStream fis = new FileInputStream (path + name);
		ObjectInputStream ois = new ObjectInputStream (fis);
		a = (Troncal []) ois.readObject();
		
		ois.close();
		fis.close();
		
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	return a;
    }

}