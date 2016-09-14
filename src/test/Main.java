package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Primero generamos un objeto de la clase operaciones para poder usar los métodos.
			Operaciones op = new Operaciones();
			
//			System.out.println(op.esPrimo(32));
			
//			System.out.println("Divisores:");
//			op.mostrarDivisores(132);
			
//			System.out.println("De los cuales son primos:");
//			op.mostrarDivisoresPrimos(132);
			//System.out.println(op.mostrarDivisores2(16)); // hace lo mismo que la anterior pero devolviendo string como return type en lugar de void. Habria que usar arraylist si no queremos darle una longitud determinada a la salida y luego hacer un bucle for para pintar los resultados. 

			// funcion para pintar los numeros primos de una serie consecutiva de datos
			int i;
			for(i=1;i<=132;i++){
				if(op.esPrimo(i)){
				System.out.println(i);
				}
				}

	}

}
