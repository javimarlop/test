package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piolin[] PiolinArray = new Piolin[3];
		PiolinArray[0] = new Piolin('M', 2, 20, 100);
		PiolinArray[1] = new Piolin('F', 3, 30, 10);
		PiolinArray[2] = new Piolin('F', 8, 50, 5);
		
		 Loro loro1 = new Loro ('F', 5, 'N', "yellow");
		  loro1.cantar();
		  PiolinArray[0].cantar();
		  PiolinArray[1].cantar();
		  PiolinArray[2].cantar();
		
		Ave gigio = PiolinArray[0];
		
		gigio.nombres.setNombreDueno("Pepe");
		
		System.out.println(gigio.getNombreDueno());
		
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
		
			//Primero generamos un objeto de la clase operaciones para poder usar los m�todos.
			//Operaciones op = new Operaciones();
			
			// Al ser un meodo estatico no hace falta en realidad crear una instancia, se puede llamar a la clase directamente.
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
			
			// si queremos saber si dos personas son iguales hay que sobreescribir el metodo equals y decidir que parametros hacen que sean iguales.
	}

}
