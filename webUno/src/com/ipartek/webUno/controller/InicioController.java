package com.ipartek.webUno.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addTarea")
public class InicioController extends HttpServlet{

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse res){ //doGet
//		System.out.println("atiendo peticion!");
//	}
//	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse res){
//		req.getParameter("tarea1");
//		System.out.println("haciendo algo");
//	}
	
	int contadorVisitas;
	//String tarea1;
	
	@Override
	public void init() throws ServletException {
		contadorVisitas = 0;
		System.out.println("inicio el servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tarea1 = req.getParameter("tarea1");
		System.out.println(tarea1);
		System.out.println("GET");
		contadorVisitas++;
		System.out.println(contadorVisitas);
	}
	
}
