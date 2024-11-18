package co.edu.poli.examen1.vista;

import co.edu.poli.examen1.modelo.Accion;
import co.edu.poli.examen1.modelo.ActivoFinanciero;
import co.edu.poli.examen1.modelo.Ciudad;
import co.edu.poli.examen1.modelo.ETF;
import co.edu.poli.examen1.modelo.FlotaMercante;
import co.edu.poli.examen1.modelo.Pais;
import co.edu.poli.examen1.servicios.ImplementacionOperacion;

class Principal {

    public static void main(String [ ] args) {
        
    	Ciudad miciudad1 = new Ciudad("ca","cali",700000, 67000);
    	Ciudad miciudad2 = new Ciudad("bu","bumanga",500000, 37000);
    	
    	Ciudad[] ciudades = new Ciudad[10];
    	ciudades[0] = miciudad1;
    	ciudades[1] = miciudad2;
    	
    	Pais paisito = new Pais("co","colombia","bogota",323.3,1212.8,ciudades);
    	
    	System.out.println(paisito);
    	
    	FlotaMercante flotica = new FlotaMercante("FTF","Exportadora","2010-09-12");
    	
    	paisito.setFlotamercante(flotica);
    	
    	System.out.println(paisito);
    	
    	//Polimorfismo
    	
    	ETF etf1 = new ETF();
    	ActivoFinanciero[] activos = new ActivoFinanciero[5];
    	
    	Accion a1 = new Accion();
    	activos[1] = a1;
    	
    	ActivoFinanciero af1 = new ETF();
    	activos[2] = af1;
    	ActivoFinanciero af2 = new Accion();
    	
    	activos[0] = af2;
    	activos[3] = etf1;
    	
    	for (int i = 0; i < activos.length; i++) {
    		if (activos[i]!=null)
			System.out.println(activos[i].calcularRenPorc());
		}
  
    	System.out.println(miciudad1.test(a1));
    	System.out.println(miciudad1.test(etf1));
    	System.out.println(miciudad1.test(af2));
    	
    	
    	ImplementacionOperacion io = new ImplementacionOperacion();
    	System.out.println(io.create(af2));
    	
    }

}










