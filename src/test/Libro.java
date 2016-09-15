package test;

public class Libro {

	char[] titulo;
	String contenidoLibro;
	
	public String leer(){
		return contenidoLibro;
	}
	
	public void escribir(String nuevoContenido){
		this.contenidoLibro = nuevoContenido;
	}
	
	public void leer2(){
		System.out.println(this.contenidoLibro);
	}

	// check if two books have the same content
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Libro){
		Libro l = (Libro) obj;
		
		return this.contenidoLibro.equals(l.contenidoLibro);
		}else{
			return false;
		}
	}
	
	static int i = 0;
	static int l = 3;
	
	public static void main(String[] args){
		Libro libroC = new Libro();
		Libro libroD = new Libro();
		libroC.contenidoLibro = "bla bla bla...";
		libroD.contenidoLibro = "bla bla blo...";
		//libroC.escribir("mi version");
		//System.out.println(libroC.contenidoLibro);
		libroC.leer2();
		libroD.leer2();

//		int i = 0;
//		int l = 3;
		
//		while(i<l){System.out.println("OK");
//		i++;
//		}
		
		System.out.println(libroC.equals(libroD));
	
	}
	
}
