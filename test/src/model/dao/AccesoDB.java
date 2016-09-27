package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.vo.Pais;

public class AccesoDB {
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	private static void abrirConn() throws ClassNotFoundException, SQLException{
		// CARGAR EL DRIVER
		Class.forName("com.mysql.jdbc.Driver");
		
		//CREAMOS LA CONEXION
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "pepe");
	}
	
	public static ArrayList<Pais> getPaises(){
		try {
			abrirConn();
			
			ps = conn.prepareStatement("select * from country");
			
			rs = ps.executeQuery();
			
			ArrayList<Pais> paises = new ArrayList<Pais>();
			
			while(rs.next()){
				Pais p = new Pais(rs.getString("name"), rs.getString("continent"), rs.getLong("population"));
				paises.add(p);
			}
			
			return paises;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<Pais>();
		}finally{
			cerrarConn();
		}
		
		
	}
	
	public static void addPais(Pais p){
		try {
			abrirConn();
			
			ps = conn.prepareStatement("INSERT INTO country (name, continent, population) VALUES (?,?,?)");
			
			ps.setString(1, p.getNombre());
			ps.setString(2, p.getContinente());
			ps.setLong(3, p.getPopulacion());
			
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
