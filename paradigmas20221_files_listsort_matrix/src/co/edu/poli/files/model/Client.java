package co.edu.poli.files.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "";
		String file = "file.txt";
		
		OperationFile op = new OperationFile();
		System.out.println("Escriba en consola para guardar en archivo:");
		op.createFile(path, file);
		op.writeFile(path, file, sc.nextLine());
		System.out.println("Leyendo archivo:");
		System.out.println(op.readFile(path, file)); 
		//op.deleteFile(path, file);
		
		System.out.println("\n***** Leyendo Datos de archivo para Matriz *****");
		List<List <String>> m = new ArrayList<>();
		op.readFile(path, "dataMatrix.txt", m);
		System.out.println(m);
		
		sc.close();
		
		System.out.println("\n***** Listas Ordenadas *****");
		List<String> arrEst1 = new ArrayList<String>();
		
		arrEst1.add("Paula");
		arrEst1.add("Luisa");
		arrEst1.add("Juanita");
		arrEst1.add("Andrea");
		
		System.out.println(arrEst1);
		Collections.sort(arrEst1);
		System.out.println(arrEst1);
		
		System.out.println("\n***** Listas Ordenadas Objetos *****");
		//List<Estudiante> arrEst2 = new ArrayList<Estudiante>();
		SortAgeEstudiante sAge = new SortAgeEstudiante();
		List<Estudiante> arrEst2 = new ArrayList<>();
		
		arrEst2.add(new Estudiante("8888","Paula",33));
		arrEst2.add(new Estudiante("3333","Luisa",27));
		arrEst2.add(new Estudiante("1111","Camila",27));
		arrEst2.add(new Estudiante("7777","Juanita",23));
		arrEst2.add(new Estudiante("5555","Carolina",43));
		arrEst2.add(new Estudiante("4444","Andrea",43));
		
		System.out.println("\nLista sin orden:\n"+arrEst2+"\n");
		Collections.sort(arrEst2, sAge);
		System.out.println("Lista ordenada edad y nombre:\n"+ arrEst2+"\n");
		Collections.sort(arrEst2, Collections.reverseOrder(sAge));
		System.out.println("Lista ordenada edad y nombre (inversa):\n" + arrEst2+"\n");
	}

}
