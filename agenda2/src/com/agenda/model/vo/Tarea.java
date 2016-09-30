package com.agenda.model.vo;

public class Tarea {

	private String tarea;
	private boolean hecha;

	public Tarea(String tarea, boolean hecha) {
		super();
		this.tarea = tarea;
		this.hecha = hecha;
	}
	
	public String getTarea() {
		return tarea;
	}
	public void setTarea(String tarea) {
		this.tarea = tarea;
	}
	public boolean isHecha() {
		return hecha;
	}
	public void setHecha(boolean hecha) {
		this.hecha = hecha;
	}
	
}
