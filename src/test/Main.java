package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
//import java.nio.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
//import static java.nio.file.StandardOpenOption.APPEND;

@SuppressWarnings("unused")

public class Main {

	public static void main(String[] args) {
	
	// Abrir archivo	
//	try{
//		Path path = Paths.get("C:\\Users\\Java\\Desktop\\test\\delete.txt");
//		Files.delete(path);
//	}catch (NoSuchFileException x){
//		System.out.print("No existe!");
//		} catch (DirectoryNotEmptyException x){
//			System.out.print("El directorio contiene archvos!");
//			}catch(IOException x){
//				System.out.print("Algo ha ido mal... Compruebe que tiene permisos para borrar.");
//			}
//	
//	// Leer/escribir archivo
//	//OpenOption[] options = new OpenOption[] { APPEND };
//	
//	Path path2 = Paths.get("C:\\Users\\Java\\Desktop\\test\\fichero.txt");
//	List<StringBuffer> datos = new ArrayList<StringBuffer>();
//	//datos.add(new StringBuffer(""));
//	datos.add(new StringBuffer("Linea1"));
//	datos.add(new StringBuffer("Linea2"));
//	try {
//		Files.write(path2, datos, Charset.forName("UTF-8"),StandardOpenOption.APPEND);//options);
//		List<String> lineas = Files.readAllLines(path2);
//		
//		for(String linea:lineas){
//			System.out.println(linea);
//		}
//		
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	

//	public static void main(String[] args) throws IOException{
//		
//		Path path = Paths.get("C:\\Users\\Java\\Desktop\\test");
//		System.out.println(path);
//		boolean existe = Files.exists(path);
//		System.out.println(existe);
		
		
		
	// Leer por lineas (Buffered streams)	
		
//		BufferedReader br = null;
//	try{
//		br = new BufferedReader(new FileReader("fichero.txt"));
//		
//		String linea = "";
//		
//		while((linea = br.readLine()) !=null){
//						
//			System.out.println(linea);
//		}
//		
//		
//		
//	}catch (FileNotFoundException e){
//		e.printStackTrace();
//	} catch (IOException e){
//		e.printStackTrace();
//	}finally{
//		if(br!=null){
//		try {
//			br.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//	}
		// Leer y escribir archivos de texto (CharacterStreams)
//		
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		
//		try{
//			
//		fis = new FileInputStream("fichero.txt");
//		fos = new FileOutputStream("ficheroCopia.txt");
//		
//		int c;
//		
//		while((c = fis.read()) != -1){
//			System.out.println((char)c);
//			fos.write(c);
//		}
//		
//		} catch (FileNotFoundException e){
//			e.printStackTrace();
//		} catch (IOException e){
//			e.printStackTrace();
//		}finally{
//			if(fis!=null){
//				try {
//					fis.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
		// trocear vectores/cadenas por separador
//		String texto = "Pepe|Toro|Lucas";
//		
//		StringTokenizer tokenizer = new StringTokenizer(texto, "|"); // tb puede omitirse el separador
//		
//		while(tokenizer.hasMoreTokens()){
//			String nombre = tokenizer.nextToken(); // tb se puede: tokenizer.nextToken("|")
//			System.out.println(nombre);
//		}
//		
//		// Otra forma
//		String[] nombres = texto.split("\\|");
//		
//		for(int i=0;i<nombres.length;i++){
//			System.out.println(nombres[i]);
//		}
		
		// Otra forma
//		String textoSubstring = "Javier";
//		
//		System.out.println(textoSubstring.substring(0)); // el numero es el caracter donde quieres que empiece a mostrar
		
	//Fechas
//		Calendar c = Calendar.getInstance();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// HH:mm"); // MMM es el mes en nombre abreviado
//		//System.out.println(sdf.format(c.getTime()));
//		
//		String fecha = "01/03/2015";
//		
//		try{
//			Date f = sdf.parse(fecha); // de la manera que defino arriba
//			c.setTime(f);
//			System.out.println(sdf.format(c.getTime()));
//		}catch (ParseException e){
//			System.out.println("Fecha incorrecta");
//		}
		 
		
//		Fecha f = new Fecha(1992,9,20);
//		
//		System.out.println(f);
		
	
	//Ejercicio
//		java.lang.Object[] ObArray = new java.lang.Object[12];
//
//		Persona Pe = new Persona("tizio", 25);
//		Ave Av = new Ave('M', 8);
//		Aparato Ap = new Aparato(200, 100);
//		Buitre Bu = new Buitre('M', 10, 25.5, 8.2);
//		Canario Ca = new Canario('F', 5, true);
//		Loro Lo = new Loro('F', 2, 'N', "Blue");
//		Piolin Pi = new Piolin('F', 1, true, 20);
//		Alumno Al = new Alumno("tizio", 8, "quimica", 4);
//		Profesor Pr = new Profesor("Villa", 55, 10, "fv@gmail.com");
//		Bedel Be = new Bedel("ste", 33, "mañanas", 20);
//		Tv tve = new Tv(50.2, 103.5, true, 1);
//		Radio Ra = new Radio(10.5, 50, true, 30);
//
//		ObArray[0] = Pe;
//		ObArray[1] = Av;
//		ObArray[2] = Ap;
//		ObArray[3] = Bu;
//		ObArray[4] = Ca;
//		ObArray[5] = Lo;
//		ObArray[6] = Pi;
//		ObArray[7] = Al;
//		ObArray[8] = Pr;
//		ObArray[9] = Be;
//		ObArray[10] = tve;
//		ObArray[11] = Ra;
//		
//		for (int ind = 0; ind < ObArray.length; ind++) {
//			if (ObArray[ind] instanceof Hablador) {
//				Hablador h = (Hablador) ObArray[ind];
//				h.hablar()
//				;
//
//			} else {System.out.println("no puedo hablar");
//			}
//		}
//		;
		
//		Piolin[] PiolinArray = new Piolin[3];
//		PiolinArray[0] = new Piolin('M', 2, 20, 100);
//		PiolinArray[1] = new Piolin('F', 3, 30, 10);
//		PiolinArray[2] = new Piolin('F', 8, 50, 5);
//		
//		 Loro loro1 = new Loro ('F', 5, 'N', "yellow");
//		  loro1.cantar();
//		  PiolinArray[0].cantar();
//		  PiolinArray[1].cantar();
//		  PiolinArray[2].cantar();
		
		//Ave gigio = PiolinArray[0];
		//gigio.nombres.setNombreDueno("Pepe");
		//System.out.println(gigio.nombres.getNombreDueno());
//		PiolinArray[1].nombres.setNombreDueno("Pepito");
//		System.out.println(PiolinArray[1].nombres.getNombreDueno());
		
//		Loro loro1 = new Loro('M',6,"E","amarillo");
//		Piolin piolin1 = new Piolin('H',8,16,5);
//		//Ave ave1 = new Ave('H',12); // al hacer abstracta la clase aves ya no se pueden crear aves porque no tiene sentido usar ese nivel de generalizacion
//		Canario canario1 = new Canario('M',5);
//		
//		loro1.quienSoy();
//		piolin1.quienSoy();
//		piolin1.altura();
//		loro1.deDondeEres();
//		
//		piolin1.tamano = 45;
//		piolin1.altura();
//		
//		loro1.region = "N";
//		
//		Ave.numAves();
//		
//		loro1.cantar();
//		piolin1.cantar();
//		canario1.cantar(); // No hay resultado porque es un metodo vacio
		
			//Primero generamos un objeto de la clase operaciones para poder usar los metodos.
			//Operaciones op = new Operaciones();
			
			// Al ser un meodo estatico no hace falta en realidad crear una instancia,
			//se puede llamar a la clase directamente.
	
			//System.out.println(Operaciones.esPrimo(32));
			
//			System.out.println(op.esPrimo(32));
			
//			System.out.println("Divisores:");
//			op.mostrarDivisores(132);
			
//			System.out.println("De los cuales son primos:");
//			op.mostrarDivisoresPrimos(132);
			//System.out.println(op.mostrarDivisores2(16)); // hace lo mismo que la anterior pero devolviendo string como return type en lugar de void. Habria que usar arraylist si no queremos darle una longitud determinada a la salida y luego hacer un bucle for para pintar los resultados. 

			// funcion para pintar los numeros primos de una serie consecutiva de datos
//			int i;
//			for(i=1;i<=132;i++){
//				if(op.esPrimo(i)){
//				System.out.println(i);
//				}
//				}

			
			//op.fibonacci(5);
			//op.factorial(3);
			
			//System.out.println(op.valor);
			
			//declaraciones de array
//			Libro[] libros = new Libro[3];
//			int[] numeros = new int[2];
//			String[] diasLab = {"Lunes","Martes","Miercoles"};
			
			//System.out.println(diasLab.length);
			//System.out.println(diasLab[2]);
			
			//System.out.println(diasLab); //referencia al objeto
			
			// Recorrer array version 1
//			for(int i=0;i<diasLab.length;i++){
//				System.out.println(diasLab[i]);
//			}
			
//			// Recorrer array version 2
//			for(String dia:diasLab){
//				System.out.println(dia);
//			}
			
//			String a1 = "kk";
//			String a2 = "kk";
//			
//			System.out.println(a1.equals(a2));
//			System.out.println(a1==a2);
			
			// si queremos saber si dos personas son iguales hay que sobreescribir
			//el metodo equals y decidir que parametros hacen que sean iguales.
	}

}
