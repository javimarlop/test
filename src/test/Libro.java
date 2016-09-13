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

	static int i = 0;
	static int l = 3;
	
	public static void main(String[] args){
		Libro libroC = new Libro();
		libroC.contenidoLibro = "bla bla bla...";
		libroC.escribir("mi version");
		//System.out.println(libroC.contenidoLibro);
		libroC.leer2();

//		int i = 0;
//		int l = 3;
		
		while(i<l){System.out.println("OK");
		i++;
		}
	
	}
	
}
