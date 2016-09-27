package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import leerConsola.Leer;
import model.vo.Alumno;

public class AccesoDB2 {
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	private static void abrirConn2() throws ClassNotFoundException, SQLException{
		// CARGAR EL DRIVER
		Class.forName("com.mysql.jdbc.Driver");
		
		//CREAMOS LA CONEXION
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudios", "root", "pepe");
	}
	
	public static ArrayList<Alumno> getAlumnos(){
		try {
			abrirConn2();
			
			ps = conn.prepareStatement("select * from alumnos");
			
			rs = ps.executeQuery(); //sin Query para todo lo que no sean consultas!
			
			ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
			
			while(rs.next()){
				Alumno p = new Alumno(rs.getString("nombre"), rs.getString("apellidos"), rs.getInt("edad"));
				alumnos.add(p);
			}
			
			return alumnos;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<Alumno>();
		}finally{
			cerrarConn();
		}
		
		
	}
	

	public static void addAlumno(Alumno p){
		try {
			abrirConn2();
			
			ps = conn.prepareStatement("INSERT INTO alumnos (nombre, apellidos, edad) VALUES (?,?,?)");
			
			ps.setString(1, p.getNombre());
			ps.setString(2, p.getApellidos());
			ps.setInt(3, p.getEdad());
			
			ps.execute();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			cerrarConn();
		}
	}

	public static void anadirAlumnos(){
		
		//for(int i=0;i<entradas;i++){ 
		
		System.out.print("Nombre: ");
		String nombre = Leer.leerTexto();
		System.out.print("Apellido: ");
		String apellidos = Leer.leerTexto();
		System.out.print("Edad: ");
		int edad = Leer.leerEntero();
		Leer.cerrarScanner();
		
		Alumno a = new Alumno(nombre,apellidos,edad);
		addAlumno(a);
		

	
	//}
	
}
	
	public static void updateAlumno(String nombre, String apellidos, int edad){
		
		try {
			abrirConn2();
			
			ps = conn.prepareStatement("UPDATE alumnos SET edad=? WHERE nombre=? AND apellidos=?");
			
			ps.setString(2, nombre);//p.getNombre());
			ps.setString(3, apellidos);
			ps.setInt(1, edad);
			
			ps.execute();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			cerrarConn();
		}
	}
	
	
	public static void delAlumno(String nombre){
				
		try {
			abrirConn2();
			
			ps = conn.prepareStatement("DELETE FROM alumnos WHERE nombre=?");
			
			ps.setString(1, nombre);//p.getNombre());
//			ps.setString(2, p.getApellidos());
//			ps.setInt(3, p.getEdad());
			
			ps.execute();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			cerrarConn();
		}
	}
	
	public static void delAlumno(int idAlumno){
		//this.nombre = nombre;
		
		try {
			abrirConn2();
			
			ps = conn.prepareStatement("DELETE FROM alumnos WHERE idAlumnos=?");
			
			ps.setInt(1, idAlumno);//p.getNombre());
//			ps.setString(2, p.getApellidos());
//			ps.setInt(3, p.getEdad());
			
			ps.execute();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			cerrarConn();
		}
	}
	
	private static void cerrarConn(){
		try {
			if(rs!=null){
				rs.close();
			}
			
			if(ps!=null){
				ps.close();
			}
			
			if(conn!=null){
				conn.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
