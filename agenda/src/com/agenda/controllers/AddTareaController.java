package com.agenda.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.dao.TareaDAO;
import com.agenda.model.vo.Tarea;
import com.agenda.service.TareaService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.agenda.model.dao.AccesoDB;

@WebServlet("/addTarea")
public class AddTareaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private TareaService tareaService;
	
	@Override
	public void init() throws ServletException {
		tareaService = new TareaService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tarea = request.getParameter("tarea");
		
		Tarea t = new Tarea(tarea, false);
		response.sendRedirect("tareas.html");
		
		//Add tarea a la DB
		tareaService.addTarea(t);
		
		//recoger todos las tareas de la BD
		ArrayList<Tarea> tareas = TareaDAO.getTareas();
		
		//aniadir tareas a la sesion
		// asi meto mi arraylist de tareas dentro de la sesion y asi puedo luego acceder desde tareas.jsp
		request.getSession().setAttribute("tareas", tareas);
		
		//mostrarlas por consola
		for(Tarea task: tareas){
			System.out.println(task.getTarea());
		}
	}
}
