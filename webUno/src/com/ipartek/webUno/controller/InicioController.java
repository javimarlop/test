package com.ipartek.webUno.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inicioGenerico")
public class InicioController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res){ //doGet
		System.out.println("atiendo peticion!");
	}
	
	
	
}
