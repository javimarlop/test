package database;

import java.util.ArrayList;

import com.agenda.model.dao.TareaDAO;
import com.agenda.model.vo.Tarea;

public class Main4 {

	public static void main(String[] args) {
	
		ArrayList<Tarea> tareas = TareaDAO.getTareas();
		
	for(int i=0;i<tareas.size();i++){
		System.out.println(tareas.get(i).getTarea());
	}
		
	}

}