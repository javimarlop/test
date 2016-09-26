package test;

public class FechaException extends RuntimeException {
	/*
	 * error en tiempo de ejecucion. Si no es obligatorio el try/catch.
	 * Si heredara de Exception si seria obligatorio el try/catch.
	 */
	

		public FechaException(){
			super();
		}
		
		public FechaException(String message){
			super (message);
			}
		
		public FechaException(String message, Throwable cause) {
			super (message, cause);
		}
		
		public FechaException(Throwable cause) {
			super (cause);
		}

	
}
