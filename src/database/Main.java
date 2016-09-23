package database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
				
		// Cargar el driver (el try/catch te lo pide de manera automatica
		//por si no esta el driver)
		try {
			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Establecer la conexion
		
		//try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "pepe");
			
			// creamos el flujo de comunicacion (preparar comando sql)
			
			st = conn.createStatement();
			
			int population = 100000000;
			
			//Modo NO seguro porque pueden inyectar codigo!!!!!!!!
			//(ver Main2, aunque en esa version falta cerrar las conexiones!)
			rs = st.executeQuery("select * from country where population > " + population);
			
			//guardar el resultado en un objeto
			
			List<Pais> paises = new ArrayList<Pais>();
			
			while(rs.next()){
				//System.out.println(rs.getString("Name"));
				// tb puede ser el indice de la columna
				// rs.getString(2)
				Pais p = new Pais(rs.getString("name"),rs.getString("continent"),rs.getLong("population"));
				paises.add(p);
			}
			
			for(int i=0;i<paises.size();i++){
				System.out.println(paises.get(i).getNombre());
			}
		
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			try{
				if(rs!=null){rs.close();}
				if(rs!=null){st.close();}
				if(rs!=null){conn.close();}				
			} catch(SQLException e){
				e.printStackTrace();
			}

		}
		
	}

}
