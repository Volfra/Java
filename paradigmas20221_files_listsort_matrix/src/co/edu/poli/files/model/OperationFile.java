package co.edu.poli.files.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OperationFile {
	
	public String createFile(String path, String name) {
		try {
			File Obj = new File(path+name);
			if (Obj.createNewFile()) {
				return "File created: " + Obj.getName();
			} else {
				return "File already exists.";
			}
		} catch (IOException e) {
			e.printStackTrace();
			return "An error has occurred.";
		}
	}

	public String readFile(String path, String name, List<List <String>> matrix) {
		try {
			File Obj = new File(path+name);
			Scanner Reader = new Scanner(Obj);
			String data = "";
			while (Reader.hasNextLine()) {
				data = Reader.nextLine();
				matrix.add(Arrays.asList(data.split(" "))); 
			}
			Reader.close();
			return data;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "An error has occurred.";
		}
	}

	public String readFile(String path, String name) {
		try {
			File Obj = new File(path+name);
			Scanner Reader = new Scanner(Obj);
			String data = "";
			while (Reader.hasNextLine())
				data = Reader.nextLine();
			Reader.close();
			return data;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "An error has occurred.";
		}
	}
	
	public String writeFile(String path, String name, String txt) {

		try {
			FileWriter Writer = new FileWriter(path+name);
			Writer.write(txt);
			Writer.close();
			return "Successfully written.";
		} catch (IOException e) {
			e.printStackTrace();
			return "An error has occurred.";
		}

	}

	public String deleteFile(String path, String name) {
		File Obj = new File(path+name);
		if (Obj.delete()) {
			return "The deleted file is : " + Obj.getName();
		} else {
			return "Failed in deleting the file.";
		}
	}

}
