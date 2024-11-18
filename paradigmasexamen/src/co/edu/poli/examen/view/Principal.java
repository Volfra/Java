package co.edu.poli.examen.view;

import co.edu.poli.examen.services.ImpleOperacionArchivo;
import co.edu.poli.examen.model.Troncal;

public class Principal {

	public static void main(String [ ] args) {
       
        ImpleOperacionArchivo y = new ImpleOperacionArchivo();
        /*
        Troncal [] z = y.deSerializar("", "_SITP.bin");
        
        ImpleOperacion x = new ImpleOperacion(z);
        //System.out.println(x.read('K'));
        Bus a1= new Bus ("TG0012B" ,"HUJ789",80);
        Bus a2 = new Bus ("HU8908A","KIJ890", 80);
        Bus a3 = new Bus ("HY9002C","GTF456",80);
        
        Bus a4 = new Bus ("FT6788C","UIH890", 50);
        Bus a5 = new Bus ("YY6777B","HWW567",50);
        Bus [] buses1 = {a1,a2,a3};
        Bus [] buses2 = {a4,a5};
        Ruta r1 = new Ruta ("K303","Urbano",33,buses1);
        Ruta r2 = new Ruta ("K319","Urbano", 22, buses2);
        Ruta [] rutas = {r1,r2};
        Troncal k = new Troncal ('K',"Fontibón",2332,rutas);
        //System.out.println(k);
        
        for (int i = 0; i < z.length; i++) {
			System.out.println(z [i]);
		}
        x.update('K', k);
        for (int i = 0; i < z.length; i++) {
			System.out.println(z [i]);
		}
        //y.serializar(z, "", "_SITP.bin");
        */
        Troncal [] f = y.deSerializar("", "_SITP.bin");
        for (int i = 0; i < f.length; i++) {
			System.out.println(f [i]);
		}
    }

}