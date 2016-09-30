<!DOCTYPE html>
<%@page import="com.agenda.model.vo.Tarea"%>
<%@page import="java.util.ArrayList" errorPage="errorPage.jsp"%>
<html>
<head>
<style type="text/css">
	.tachado{
	text-decoration: line-through;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="cabecera.html" %>
	<form action="addTarea" method="post">
		<input type="text" name="tarea" />
		<!--
	<form action="hecha" method="post">
		<input type="boolean" name="hecha" />
		-->
	<button type="submit">Enviar</button>
	</form>
	<%
	ArrayList<Tarea> tareas = (ArrayList<Tarea>) session.getAttribute("tareas");
	
	if(tareas!=null){
		//tareas=null;
		for(int i=0;i<tareas.size();i++){%>
		<%if(tareas.get(i).isHecha()){%>
			<p class = "tachado">
			<%} else{ %>
			<p>
			<%} %>
			<%=tareas.get(i).getTarea() %>
			</p>
		<% } 
		}%>
<!--
	<%for(int i=0;i<10;i++){%>
		<p>Hola</p>
	<%}%>
	-->
</body>
</html>