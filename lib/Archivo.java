package lib;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	public static String busqueda(String pArchivo, Integer pId) {
		String registro = "";
		File f = new File(pArchivo);
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine();
			while(linea != null) {
				String[] datos = linea.split("\\|");
				Integer id = Integer.parseInt(datos[1].trim());
				if (id.equals(pId)) {
					registro = linea;
					break;
				}
				linea = br.readLine();
			}
			
			br.close();
		}   catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return registro;
	}
	
	public static String lectura(String pArchivo) {
		String registro = "";
		File f = new File(pArchivo);
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String linea = br.readLine();
			while(linea != null) {
				registro += linea + "\n";
				linea = br.readLine();
			}
			
			br.close();
		}   catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return registro;
	}
	
	public static void escritura(String pArchivo, String pTexto) {
		File f = new File(pArchivo);
		try {
			FileWriter fw    = new FileWriter(f, true); //El true significa que lo que se agregue o agregara algo al final del archivo.
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append(pTexto);
			bw.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
