package com.agenda.service;

import java.util.ArrayList;

import com.agenda.model.dao.TareaDAO;
import com.agenda.model.vo.Tarea;

public class TareaService {
	
	public void addTarea(Tarea tarea){
		TareaDAO.addTarea(tarea);
	}
	
	/**
	 * Metodo que devuelve todas las tareas
	 * @return ArrayList<Tarea>
	 */
	public ArrayList<Tarea> getTareas(){
		return TareaDAO.getTareas();
	}

}
