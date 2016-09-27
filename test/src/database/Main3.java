package database;

import java.util.ArrayList;

import model.dao.AccesoDB;
import model.dao.AccesoDB2;
import model.vo.Pais;
import model.vo.Alumno;

public class Main3 {

	public static void main(String[] args) {

		
//		ArrayList<Pais> paises = AccesoDB.getPaises();
//			
//		for(int i=0;i<paises.size();i++){
//			System.out.println("El pais " + paises.get(i).getNombre() + " esta en el continente " + paises.get(i).getContinente() + " y tiene " + paises.get(i).getPopulacion() + " habitantes");
//		}
//		
//		Pais p = new Pais("Albertia", "Europe", 100);
//		
//		AccesoDB.addPais(p);
		
		//AccesoDB2.delAlumno("Pepe");
		//AccesoDB2.delAlumno(2);
		//AccesoDB2.updateAlumno("Javier","Martinez",5);

		
		ArrayList<Alumno> alumnos = AccesoDB2.getAlumnos();
		
	for(int i=0;i<alumnos.size();i++){
		System.out.println("El alumno " + alumnos.get(i).getNombre() + " " + alumnos.get(i).getApellidos() + " tiene " + alumnos.get(i).getEdad() + " anios.");
	}
	
	//Alumno p = new Alumno("Pepe", "Perez", 100);
	
	//AccesoDB2.addAlumno(p);
	//AccesoDB2.anadirAlumnos();
		
	}

}

