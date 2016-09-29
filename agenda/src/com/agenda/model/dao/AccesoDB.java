package com.agenda.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoDB {
	protected static Connection conn = null;
	protected static PreparedStatement ps = null;
	protected static ResultSet rs = null;
	
	protected static void abrirConn() throws ClassNotFoundException, SQLException{
		// CARGAR EL DRIVER
		Class.forName("com.mysql.jdbc.Driver");
		
		//CREAMOS LA CONEXION
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tareas", "root", "pepe");
	}
	
	protected static void cerrarConn(){
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
