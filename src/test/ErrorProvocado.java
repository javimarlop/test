package test;

public class ErrorProvocado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String strTest = null;
			strTest.length();
		}catch (NullPointerException e){
			System.out.println("Error capturado");
			e.printStackTrace();
		}
	}

}
