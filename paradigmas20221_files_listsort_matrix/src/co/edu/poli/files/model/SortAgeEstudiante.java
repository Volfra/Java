package co.edu.poli.files.model;

import java.util.Comparator;

public class SortAgeEstudiante implements Comparator<Estudiante>{

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		if (o1.getAge() < o2.getAge()) return -1; 
        if (o1.getAge() > o2.getAge()) return 1; 
        else {
        	return o1.getName().compareTo(o2.getName());
        } 
	}



}
