package com.agenda.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.agenda.model.vo.Tarea;

import com.agenda.model.dao.*;



public class TareaDAO extends AccesoDB{
	
	/**
	 * Metodo que recibe una tarea por parametro y la inserta en la DB
	 * @param tarea
	 */
	public static void addTarea(Tarea tarea){
		
			try {
				abrirConn();
				
				ps = conn.prepareStatement("INSERT INTO tareas (tarea, hecha) VALUES (?,?)");
				
				ps.setString(1, tarea.getTarea());
				ps.setBoolean(2, tarea.isHecha());
				
				ps.execute();
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}finally{
				cerrarConn();
			}
		}
	
	/**
	 * Metodo que recoge todas las tareas de la BD
	 * @return ArrayList<Tarea> con todas las tareas de la DB
	 */
	public static ArrayList<Tarea> getTareas(){
		
		try {
			abrirConn();
			
			ps = conn.prepareStatement("select * from tareas");
			
			rs = ps.executeQuery(); //sin Query para todo lo que no sean consultas!
			
			ArrayList<Tarea> tareas = new ArrayList<Tarea>();
			
			while(rs.next()){
				Tarea t = new Tarea(rs.getString("tarea"), rs.getBoolean("hecha"));
				tareas.add(t);
			}
			
			return tareas;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return new ArrayList<Tarea>();
		}finally{
			cerrarConn();
		}
		
		
	}
	
}
