package Exceptions;

public class FechaException extends RuntimeException{
	
	public FechaException(){}
	
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
